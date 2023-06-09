DROP DATABASE if EXISTS student_tracker;

CREATE DATABASE student_tracker;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(45) DEFAULT NULL,
  last_name VARCHAR(45) DEFAULT NULL,
  email VARCHAR(45) DEFAULT NULL
);

-- set id start with 1
SELECT setval(pg_get_serial_sequence('student', 'id'), 1);

SELECT * FROM student;

-- truncate vs drop
TRUNCATE student;
