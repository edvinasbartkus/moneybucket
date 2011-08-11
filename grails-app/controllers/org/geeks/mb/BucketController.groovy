package org.geeks.mb

class BucketController {
  def index = {
    [ buckets:Bucket.list() ]
  }

  def show = {
    def bucket = Bucket.get(params.long("id"))
    [ bucket:bucket ]
  }

  def create = {
    def bucket = new Bucket()
    [ bucket:bucket ]
  }

  def save = {
    def bucket = params.long("id") ? Bucket.get(params.long("id")) : new Bucket()
    bucket.properties['title'] = params

    if(bucket.save(flush:true)) {
      redirect action:"show", id:bucket.id
      return
    } else {
      render view:'create', model: [ bucket:bucket ]
      return
    }
  }

  def edit = {
    def bucket = Bucket.get(params.long("id"))
    [ bucket:bucket ]
  }

  def delete = {
    def bucket = Bucket.get(params.long("id"))
    bucket.delete()

    redirect action:"index"
  }
}
