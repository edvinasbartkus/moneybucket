package org.geeks.mb

class Bucket {
  String name
  User owner

  List members
  static hasMany = [ members:BucketMember ]

  static constraints = {
    name blank:false
    owner nullable:false
  }
}
