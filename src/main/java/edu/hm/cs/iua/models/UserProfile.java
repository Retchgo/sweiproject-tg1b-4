package edu.hm.cs.iua.models;


public class UserProfile {

    private String name;

    protected UserProfile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}