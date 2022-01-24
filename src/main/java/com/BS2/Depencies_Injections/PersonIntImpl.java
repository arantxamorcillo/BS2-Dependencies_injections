package com.BS2.Depencies_Injections;

import org.springframework.stereotype.Service;

@Service
public class PersonIntImpl implements personInt{
    Person person = new Person();

    @Override
    public  Person createPerson(String name, int age, String city){
        person.setName(name);
        person.setAge(age);
        person.setCity(city);
        return person;
    }



    public Person getPerson(){
        return person;
    }


}
