CREATE DATABASE StudentManagementSys;
USE StudentManagementSys;
-- Student table
CREATE TABLE Student (
StudentID VARCHAR(10) PRIMARY KEY,
FirstName VARCHAR(25) NOT NULL,
LastName VARCHAR(25) NOT NULL,
DateOfBirth DateTime NOT NULL,
Gender VARCHAR(25) NOT NULL,
Email VARCHAR(30) UNIQUE NOT NULL,
Phone VARCHAR(25) NOT NULL
);

-- Inserting into Student table
INSERT INTO Student (StudentID,FirstName,LastName,DateOfBirth,Gender,
Email,Phone) VALUES
('S101','John', 'Doe','2000-10-10','M', 'john@example.com','9878457945'),
('S102','Jane', 'Smith','2013-08-08','M', 'jane@example.com','9977457745'),
('S103','Alice', 'Johnson','2011-09-08','F', 'alice@example.com','9876457845'),
('S104','Anna', 'Doe','2011-07-08','F', 'Anna.doe@india.com','9876457842'),
('S105','Peter', 'Parker','2011-06-05','M', 'p_parker@example.com','9276457843');

-- Updating Student table with email
UPDATE Student SET Email = 'jane_Smith@example.com' WHERE FirstName = 'Jane' AND LastName = 'Smith' AND StudentID='S102' ;

mysql> UPDATE Student SET Email = 'jane_Smith@example.com' WHERE FirstName = 'Jane' AND LastName = 'Smith' AND StudentID='S102' ;
Query OK, 0 rows affected (0.04 sec)
Rows matched: 1  Changed: 0  Warnings: 0

-- Print updated student table
SELECT * FROM Student;

mysql> SELECT * FROM Student;
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
| StudentID | FirstName | LastName | DateOfBirth         | Gender | Email                  | Phone      |
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
| S101      | John      | Doe      | 2000-10-10 00:00:00 | M      | john@example.com       | 9878457945 |
| S102      | Jane      | Smith    | 2013-08-08 00:00:00 | M      | jane_Smith@example.com | 9977457745 |
| S103      | Alice     | Johnson  | 2011-09-08 00:00:00 | F      | alice@example.com      | 9876457845 |
| S104      | Anna      | Doe      | 2011-07-08 00:00:00 | F      | Anna.doe@india.com     | 9876457842 |
| S105      | Peter     | Parker   | 2011-06-05 00:00:00 | M      | p_parker@example.com   | 9276457843 |
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
5 rows in set (0.00 sec)


-- Instructor Table
CREATE TABLE Instructor (
InstructorID VARCHAR(10) PRIMARY KEY,
Email VARCHAR(30) UNIQUE NOT NULL,
FirstName VARCHAR(30) NOT NULL,
LastName VARCHAR(30)
);

-- Inserting into Instructor table
INSERT INTO Instructor (InstructorID ,Email,FirstName,LastName) VALUES
('I101','sunil@example.com','Sunil','Rawat'),
('I102','nida@example.com','Nida','Fatima'),
('I103','shiv@example.com','Shiv','Kumar');

-- Updating Instructor email
UPDATE Instructor SET Email = 'sunilrawat@example.com' WHERE FirstName = 'Sunil' AND LastName = 'Rawat' AND InstructorID='I101';

mysql> UPDATE Instructor SET Email = 'sunilrawat@example.com' WHERE FirstName = 'Sunil' AND LastName = 'Rawat' AND InstructorID='I101';
Query OK, 0 rows affected (0.01 sec)
Rows matched: 1  Changed: 0  Warnings: 0

-- Printing Instructor Table
SELECT * FROM Instructor;

mysql> SELECT * FROM Instructor;
+--------------+------------------------+-----------+----------+
| InstructorID | Email                  | FirstName | LastName |
+--------------+------------------------+-----------+----------+
| I101         | sunilrawat@example.com | Sunil     | Rawat    |
| I102         | nida@example.com       | Nida      | Fatima   |
| I103         | shiv@example.com       | Shiv      | Kumar    |
+--------------+------------------------+-----------+----------+
3 rows in set (0.00 sec)

--Deleting from Enrollment table
DELETE FROM Enrollment WHERE StudentID IN (SELECT StudentID FROM Student WHERE LastName = 'Smith');

mysql> DELETE FROM Enrollment WHERE StudentID IN (SELECT StudentID FROM Student WHERE LastName = 'Smith');
Query OK, 0 rows affected (0.01 sec)

-- Printing Enrollment Table
SELECT * FROM Enrollment;
mysql> SELECT * FROM Enrollment;
+--------------+-----------+----------+--------------+
| EnrollmentID | StudentID | CourseID | InstructorID |
+--------------+-----------+----------+--------------+
| E1001        | S101      | C101     | I101         |
| E1003        | S103      | C102     | I102         |
+--------------+-----------+----------+--------------+
2 rows in set (0.01 sec)

-- Deleting a student
DELETE FROM Student WHERE LastName = 'Smith' AND StudentID='S101';

mysql> DELETE FROM Student WHERE LastName = 'Smith' AND StudentID='S101';
Query OK, 0 rows affected (0.00 sec)

--printing updated student table
SELECT * FROM Student;
mysql> SELECT * FROM Student;
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
| StudentID | FirstName | LastName | DateOfBirth         | Gender | Email                  | Phone      |
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
| S101      | John      | Doe      | 2000-10-10 00:00:00 | M      | john@example.com       | 9878457945 |
| S102      | Jane      | Smith    | 2013-08-08 00:00:00 | M      | jane_Smith@example.com | 9977457745 |
| S103      | Alice     | Johnson  | 2011-09-08 00:00:00 | F      | alice@example.com      | 9876457845 |
| S104      | Anna      | Doe      | 2011-07-08 00:00:00 | F      | Anna.doe@india.com     | 9876457842 |
| S105      | Peter     | Parker   | 2011-06-05 00:00:00 | M      | p_parker@example.com   | 9276457843 |
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
5 rows in set (0.00 sec)

-- printing  student's name starting with J
SELECT *FROM Student WHERE FirstName LIKE 'J%';

mysql> SELECT *FROM Student WHERE FirstName LIKE 'J%';
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
| StudentID | FirstName | LastName | DateOfBirth         | Gender | Email                  | Phone      |
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
| S101      | John      | Doe      | 2000-10-10 00:00:00 | M      | john@example.com       | 9878457945 |
| S102      | Jane      | Smith    | 2013-08-08 00:00:00 | M      | jane_Smith@example.com | 9977457745 |
+-----------+-----------+----------+---------------------+--------+------------------------+------------+
2 rows in set (0.00 sec)