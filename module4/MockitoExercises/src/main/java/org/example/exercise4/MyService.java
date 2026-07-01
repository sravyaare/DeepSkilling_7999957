package org.example.exercise4;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void performSave() {
        api.saveData();
    }
}