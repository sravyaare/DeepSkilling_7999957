package com.cognizant.handon4.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Skill {

    @NotNull(message = "Skill id is mandatory")
    @Min(value = 1, message = "Skill id should be greater than 0")
    private Integer id;

    @NotNull(message = "Skill name is mandatory")
    @NotBlank(message = "Skill name cannot be blank")
    @Size(min = 1, max = 30, message = "Skill name should be between 1 and 30 characters")
    private String name;

    public Skill() {
    }

    public Skill(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}