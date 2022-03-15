package com.person.repository;

import com.person.connection.MySqlConnectionManager;
import com.person.entity.PersonEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements Repository<PersonEntity> {


    private MySqlConnectionManager sqlConnection = new MySqlConnectionManager();

    @Override
    public List<PersonEntity> getAll() throws SQLException {
        List<PersonEntity> persons = new ArrayList<PersonEntity>();
        String personQuery = "SELECT * FROM persons";

        try (Connection connection = sqlConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(personQuery);
             ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            while (resultSet.next()) {
                PersonEntity person = new PersonEntity();
                person.setPersonId(resultSet.getInt("PERSON_ID"));
                person.setFirstName(resultSet.getString("FIRST_NAME"));
                person.setLastName(resultSet.getString("LAST_NAME"));
                person.setAge(resultSet.getInt("AGE"));
                person.setCnp(resultSet.getString("CNP"));
                person.setAddressId(resultSet.getInt("ADDRESS_ID"));
                person.setJobId(resultSet.getInt("JOB_ID"));
                persons.add(person);
            }
        }
        return persons;
    }

    @Override
    public void addToTable(PersonEntity person) throws SQLException {
        String personQuery = "INSERT INTO persons\nVALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = sqlConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(personQuery);
        ) {
            preparedStatement.setInt(1, person.getPersonId());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getLastName());
            preparedStatement.setInt(4, person.getAge());
            preparedStatement.setString(5, person.getCnp());
            preparedStatement.setInt(6, person.getAddressId());
            preparedStatement.setInt(7, person.getJobId());
            preparedStatement.executeUpdate();
        }

    }
}


