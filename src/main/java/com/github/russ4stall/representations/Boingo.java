package com.github.russ4stall.representations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by russ on 4/4/15.
 */
public class Boingo {
    private String name;
    private int age;

    public Boingo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public int getAge() {
        return age;
    }
}
