package org.example.exercise6;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void process() {

        api.firstMethod();

        api.secondMethod();
    }
}