package jsblog

class Post {

    String title
    String author
    String content

    static constraints = {
        title(nullable:true)
        author(nullable:false)
        content(nullable:false)
    }
}
