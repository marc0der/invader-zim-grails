import support.QuotePage

import static cucumber.api.groovy.EN.*
import static support.Remote.createInvader
import static support.Remote.updateInvader

Given(~'^an Invader named "([^"]*)"$') { String name ->
    assert createInvader(name)
}

And(~'^the Invader "([^"]*)" says "([^"]*)"$') { String name, String message ->
    assert updateInvader(name, message)
}

When(~'^a Quote is requested for "([^"]*)"$') { String name ->
    QuotePage.url = "/zim-grails/invader/$name"
    to QuotePage
}

Then(~'^we are taken to the Quote Page$') { ->
    sleep(5000)
    at QuotePage
}

And(~'^we see "([^"]*)"$') { String message ->
    def quote = page.fetchInvasionQuote()
    assert quote == message
}