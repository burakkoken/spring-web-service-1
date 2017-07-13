package com.codnect.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Burak Köken on 13.7.2017.
 *
 * @author Burak Köken
 * @version 1.0
 */
@XmlRootElement(name = "Person")
public class PersonXML implements Serializable {


    private int id;

    private String name;

    private int age;

    public PersonXML() {
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
