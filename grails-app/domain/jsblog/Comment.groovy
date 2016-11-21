package jsblog

class Comment {

    String author
    String content

    static belongTo = [post:Post]

    static constraints = {
        author(nullable:false)
        content(nullable:false)
    }
}
