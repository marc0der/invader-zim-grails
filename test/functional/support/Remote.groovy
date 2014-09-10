package support

import grails.plugin.remotecontrol.RemoteControl
import zim.grails.Quote

class Remote {
    static createInvader(String name) {
        def remote = new RemoteControl()
        remote {
            def quote = new Quote(name: name)
            quote.save()
            quote.id
        } as Long
    }

    static updateInvader(String name, String message) {
        def remote = new RemoteControl()
        remote {
            def quote = Quote.findByName(name)
            quote.message = message
            quote.save()
            quote.id
        } as Long
    }
}
