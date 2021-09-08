package com.test.servicethree.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class User {

    @Valid
    @NotNull
    private String name;
    @Valid
    @NotNull
    private String surname;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}