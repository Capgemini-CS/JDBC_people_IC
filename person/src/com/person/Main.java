package com.person;

import com.person.entity.PersonEntity;
import com.person.serivce.PersonService;

import java.sql.SQLException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws SQLException {

        PersonService personService = new PersonService();

        System.out.println(personService.getAllPersons());

        PersonEntity person = new PersonEntity(3, "Matias", "Monte", 21, "1990133004455", 3, 3);
        personService.addPersonToTable(person);


        System.out.println(personService.getAllPersons());

    }
}
