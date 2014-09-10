package zim.grails

class InvaderController {

    def index(String name) {
        new Quote(name: name, message: "boo").save()
        [quote: Quote.findByName(name)]
    }
}
