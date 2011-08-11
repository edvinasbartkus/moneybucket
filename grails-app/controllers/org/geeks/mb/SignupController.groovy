package org.geeks.mb

class SignupController {
  def form = {
    def user = new User()

    [ user:user ]
  }

  def save = {
    def user = new User(params)
    if(user.save(flush:true)) {
      
    } else {
      render view:'form', model: [user:user]
      return
    }
  }
}