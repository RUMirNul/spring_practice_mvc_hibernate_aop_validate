# CRUD application for works with employees    

### About project
A project for practical work with Spring Web MVC, Hibernate and etc. Realized base CRUD functions and  data validation when adding/updating a employee information.

### Technologies
- Spring Web MVC
- Spring ORM
- Hibernate Core
- Hibernate Validator
- JSTL
- AspectJ Weaver
- MySQL Connector/J
- C3P0

### MySQL Table parametrs

USE my_db;

CREATE TABLE employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  surname varchar(25),
  department varchar(20),
  salary int,
  PRIMARY KEY (id)
) ;
