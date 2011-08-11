package org.geeks.mb

class BucketMember {
  Bucket bucket
  User user

  static constraints = {
    bucket nullable:false
  }
}
