package pl.sda.advanced.exceptions;

import java.io.IOException;

public class ProblematicClass {

    public void doSomething() throws IOException {
        throw new IOException("Input/output exception");
    }

    public void doSomething(String argument) {
        throw new IllegalArgumentException("Illegal argument: " + argument);
    }

}
