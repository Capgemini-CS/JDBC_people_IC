package com.person.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T>{

     List<T> getAll() throws SQLException;

     void addToTable(T data) throws SQLException;

}
