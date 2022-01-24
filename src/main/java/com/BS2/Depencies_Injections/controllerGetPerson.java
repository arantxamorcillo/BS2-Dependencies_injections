package com.BS2.Depencies_Injections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class controllerGetPerson {
    @Autowired
    personInt personInt;

    @PostMapping ("/controllerGetPerson/getPerson")
    public Person getPerson(){
        Person personDoubleAge =  personInt.getPerson();
        personDoubleAge.setAge(personDoubleAge.getAge()*2);
        return personDoubleAge;
    }
}
