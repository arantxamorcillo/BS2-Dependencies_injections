package com.BS2.Depencies_Injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerAddPerson {

    @Autowired
    personInt personInt;

    @GetMapping ("/ControllerAddPerson/addPerson")
    public Person getPerson (@RequestHeader(value = "name") String name, @RequestHeader(value = "age")int age, @RequestHeader(value = "city")String city){
        return personInt.createPerson(name, age, city);

    }


}
