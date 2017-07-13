package com.codnect.controller;

import com.codnect.model.PersonJSON;
import com.codnect.model.PersonXML;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Burak Köken on 13.7.2017.
 */
@RestController
public class PersonController {

    @RequestMapping("/personJson/{id}")
    public PersonJSON personJSON(@PathVariable Integer id){
        PersonJSON personJSON = new PersonJSON();
        personJSON.setId(id);
        personJSON.setName("Burak Köken");
        personJSON.setAge(22);

        return personJSON;
    }

    @RequestMapping("/personXml/{id}")
    public PersonXML personXML(@PathVariable Integer id){
        PersonXML personXML = new PersonXML();
        personXML.setId(id);
        personXML.setName("Burak Köken");
        personXML.setAge(22);

        return personXML;
    }


    @RequestMapping("/person/{id}")
    public Object person(@PathVariable Integer id,
                         @RequestParam(value = "type", defaultValue = "json") String type){

        if(type.compareTo("xml") == 0){
            PersonXML personXML = new PersonXML();
            personXML.setId(id);
            personXML.setName("Burak Köken");
            personXML.setAge(22);
            return personXML;
        }

        PersonJSON personJSON = new PersonJSON();
        personJSON.setId(id);
        personJSON.setName("Burak Köken");
        personJSON.setAge(22);

        return personJSON;
    }


}
