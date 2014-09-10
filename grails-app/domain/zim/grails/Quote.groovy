package zim.grails

class Quote {

    String name
    String message

    static constraints = {
        message nullable: true
    }
}
