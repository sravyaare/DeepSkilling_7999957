package org.example.exercise5;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String processData() {

        return "Processed " +
                repository.getData();
    }
}