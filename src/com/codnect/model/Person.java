package com.codnect.model;

import java.io.Serializable;

/**
 * Created by Burak Köken on 13.7.2017.
 *
 * @author Burak Köken
 * @version 1.0
 */
public class Person implements Serializable {

    private int id;

    private String name;

    private int age;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
