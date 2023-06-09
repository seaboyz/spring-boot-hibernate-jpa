DROP DATABASE if EXISTS student_tracker;

CREATE DATABASE student_tracker;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(45) DEFAULT NULL,
  last_name VARCHAR(45) DEFAULT NULL,
  email VARCHAR(45) DEFAULT NULL
);

SELECT setval(pg_get_serial_sequence('student', 'id'), 3000);

SELECT * FROM student;
