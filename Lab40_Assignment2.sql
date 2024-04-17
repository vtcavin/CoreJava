CREATE DATABASE EmployeeDetails;
USE EmployeeDetails;
-- Employee table 
CREATE TABLE Employee
(
Emp_id VARCHAR(30) PRIMARY KEY,
First_Name VARCHAR(20) NOT NULL, 
Last_Name VARCHAR(20)  NOT NULL,  
Age INT  NOT NULL,
Email VARCHAR(30) UNIQUE NOT NULL
);

-- Inserting into Employee table 
INSERT INTO Employee( Emp_id, First_Name,Last_Name,Age,Email)
VALUES
('E101','Cavin','Vadala',22,'vtcavin@gmail.com'),
('E102','Rahul','Sunnoju',31,'rahulsunnoju@gmail.com'),
('E103','shiva','prasad',21,'shivaprasad@gmail.com'),
('E104','Karthik','kandukula',32,'kandukulakarthik@gmail.com');
-- Printing first and last name in Employee table 
SELECT First_Name, Last_Name FROM Employee;

mysql> SELECT First_Name, Last_Name FROM Employee;
+------------+-----------+
| First_Name | Last_Name |
+------------+-----------+
| Cavin      | Vadala    |
| Rahul      | Sunnoju   |
| shiva      | prasad    |
| Karthik    | kandukula |
+------------+-----------+
4 rows in set (0.00 sec)

-- printing an employee who is greater than 30 in Employee table 
SELECT First_Name, Last_name, Age FROM Employee WHERE Age > 30;

mysql> SELECT First_Name, Last_name, Age FROM Employee WHERE Age > 30;
+------------+-----------+-----+
| First_Name | Last_name | Age |
+------------+-----------+-----+
| Rahul      | Sunnoju   |  31 |
| Karthik    | kandukula |  32 |
+------------+-----------+-----+
2 rows in set (0.00 sec)
-- Updating an employee with adding up the age who are greater than 25Employee table 
UPDATE Employee SET Age=Age+1 WHERE Age>25;

mysql> Select First_Name, Last_Name, Age FROM Employee;
+------------+-----------+-----+
| First_Name | Last_Name | Age |
+------------+-----------+-----+
| Cavin      | Vadala    |  22 |
| Rahul      | sunnoju   |  32 |
| shiva      | prasad    |  21 |
| Karthik    | kandukula |  33 |
+------------+-----------+-----+
4 rows in set (0.00 sec)