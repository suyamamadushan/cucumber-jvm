package io.cucumber.core.gherkin5;

import io.cucumber.core.gherkin.Argument;
import io.cucumber.messages.Messages.PickleStepArgument.PickleDocString;

public final class DocStringArgument implements Argument, io.cucumber.plugin.event.DocStringArgument {

    private final PickleDocString docString;

    DocStringArgument(PickleDocString docString) {
        this.docString = docString;
    }

    @Override
    public String getContent() {
        return docString.getContent();
    }

    @Override
    public String getContentType() {
        return docString.getContentType();
    }

    @Override
    public int getLine() {
        return docString.getLocation().getLine();
    }
}