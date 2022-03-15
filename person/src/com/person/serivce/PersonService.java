package com.person.serivce;

import com.person.entity.PersonEntity;
import com.person.repository.PersonRepository;

import java.sql.SQLException;
import java.util.List;

public class PersonService {


    PersonRepository personRepository = new PersonRepository();

    public List<PersonEntity> getAllPersons() {
        try {
            return personRepository.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addPersonToTable(PersonEntity person) {
        try {
            personRepository.addToTable(person);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
