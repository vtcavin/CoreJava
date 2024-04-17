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

-- Inserting into student table
INSERT INTO Student (StudentID,FirstName,LastName,DateOfBirth,Gender,
Email,Phone) VALUES
('S101','John', 'Doe','2000-10-10','M', 'john@example.com','9878457945'),
('S102','Jane', 'Smith','2013-08-08','M', 'jane@example.com','9977457745'),
('S103','Alice', 'Johnson','2011-09-08','F', 'alice@example.com','9876457845'),
('S104','Anna', 'Doe','2011-07-08','F', 'Anna.doe@india.com','9876457842'),
('S105','Peter', 'Parker','2011-06-05','M', 'p_parker@example.com','9276457843');


--Course table
CREATE TABLE Course (
CourseID VARCHAR(10) PRIMARY KEY,
CourseTitle VARCHAR(30) NOT NULL,
Credits INT NOT NULL
);

-- Insert into into Cousrse table
INSERT INTO Course (CourseID,CourseTitle,Credits) VALUES
('C101','Math101',12),
('C102','History101',13),
('C103','Computer Science101',11);

-- Instructor table
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


-- Enrollment table
CREATE TABLE Enrollment (
EnrollmentID VARCHAR(10) PRIMARY KEY,
StudentID VARCHAR(10) NOT NULL,
CourseID VARCHAR(10) NOT NULL,
InstructorID VARCHAR(10) NOT NULL,
FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID)
);

-- Inserting into Enrollment table
INSERT INTO Enrollment (EnrollmentID,StudentID, CourseID,InstructorID) VALUES
('E1001','S101','C101','I101'),
('E1002','S102','C101', 'I101'),
('E1003','S103','C102','I102');

-- Score table
CREATE TABLE Score(
ScoreID VARCHAR(10) PRIMARY KEY,
StudentID VARCHAR(10) NOT NULL,
CourseID VARCHAR(10) NOT NULL,
FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
CreditObtained VARCHAR(10) NOT NULL,
DateOfExam DateTime NOT NULL
);

-- Inserting into Score table
INSERT INTO Score
(ScoreID,StudentID,CourseID,CreditObtained,DateOfExam)VALUES
('SC101','S101','C101','12','2022-10-10'),
('SC102','S102','C101','10','2022-10-10');

-- Feedback table
CREATE TABLE Feedback(
FeedbackID INT Auto_Increment PRIMARY KEY,
StudentID VARCHAR(10) NOT NULL,
InstructorName VARCHAR(10) NOT NULL,
Feedback VARCHAR(100) NOT NULL
);

-- Inserting into Feedback table
INSERT INTO Feedback(StudentID,InstructorName,Feedback)VALUES
('S101','I101','Session was good'),
('S102','I101','Topic was well explained '),
('S103','I102', 'Session was excellent ');

mysql> show tables;
+--------------------------------+
| Tables_in_studentmanagementsys |
+--------------------------------+
| course                         |
| enrollment                     |
| feedback                       |
| instructor                     |
| score                          |
| student                        |
+--------------------------------+
6 rows in set (0.01 sec)

mysql> select * from student;
+-----------+-----------+----------+---------------------+--------+----------------------+------------+
| StudentID | FirstName | LastName | DateOfBirth         | Gender | Email                | Phone      |
+-----------+-----------+----------+---------------------+--------+----------------------+------------+
| S101      | John      | Doe      | 2000-10-10 00:00:00 | M      | john@example.com     | 9878457945 |
| S102      | Jane      | Smith    | 2013-08-08 00:00:00 | M      | jane@example.com     | 9977457745 |
| S103      | Alice     | Johnson  | 2011-09-08 00:00:00 | F      | alice@example.com    | 9876457845 |
| S104      | Anna      | Doe      | 2011-07-08 00:00:00 | F      | Anna.doe@india.com   | 9876457842 |
| S105      | Peter     | Parker   | 2011-06-05 00:00:00 | M      | p_parker@example.com | 9276457843 |
+-----------+-----------+----------+---------------------+--------+----------------------+------------+
5 rows in set (0.03 sec)


mysql> select * from course;
+----------+---------------------+---------+
| CourseID | CourseTitle         | Credits |
+----------+---------------------+---------+
| C101     | Math101             |      12 |
| C102     | History101          |      13 |
| C103     | Computer Science101 |      11 |
+----------+---------------------+---------+
3 rows in set (0.01 sec)


mysql> select * from enrollment;
+--------------+-----------+----------+--------------+
| EnrollmentID | StudentID | CourseID | InstructorID |
+--------------+-----------+----------+--------------+
| E1001        | S101      | C101     | I101         |
| E1002        | S102      | C101     | I101         |
| E1003        | S103      | C102     | I102         |
+--------------+-----------+----------+--------------+
3 rows in set (0.01 sec)


mysql> select * from instructor;
+--------------+-------------------+-----------+----------+
| InstructorID | Email             | FirstName | LastName |
+--------------+-------------------+-----------+----------+
| I101         | sunil@example.com | Sunil     | Rawat    |
| I102         | nida@example.com  | Nida      | Fatima   |
| I103         | shiv@example.com  | Shiv      | Kumar    |
+--------------+-------------------+-----------+----------+
3 rows in set (0.02 sec)


mysql> select * from score;
+---------+-----------+----------+----------------+---------------------+
| ScoreID | StudentID | CourseID | CreditObtained | DateOfExam          |
+---------+-----------+----------+----------------+---------------------+
| SC101   | S101      | C101     | 12             | 2022-10-10 00:00:00 |
| SC102   | S102      | C101     | 10             | 2022-10-10 00:00:00 |
+---------+-----------+----------+----------------+---------------------+
2 rows in set (0.02 sec)


mysql> select * from feedback;
+------------+-----------+----------------+---------------------------+
| FeedbackID | StudentID | InstructorName | Feedback
      |
+------------+-----------+----------------+---------------------------+
|          1 | S101      | I101           | Session was good          |
|          2 | S102      | I101           | Topic was well explained  |
|          3 | S103      | I102           | Session was excellent     |
+------------+-----------+----------------+---------------------------+
3 rows in set (0.01 sec)
