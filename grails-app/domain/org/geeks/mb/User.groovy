package org.geeks.mb

class User {

	transient springSecurityService

	String username
	String password
	String email

	String firstName
	String lastName

	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static constraints = {
		username blank: false, unique: true
		password blank: false

		firstName blank:true, nullable:true
		lastName  blank:true, nullable:true

		email    blank: false, email:  true
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}

	String toString() {
		"${firstName} ${lastName}"
	}
}
