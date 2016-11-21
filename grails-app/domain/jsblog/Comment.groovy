package jsblog

class Comment {

    String author
    String content

    static constraints = {
        author(nullable:false)
        content(nullable:false)
    }
}
