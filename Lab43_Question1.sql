USE StudentManagementSys;
-- Adding a new Age and Adress column to the student table with chars upto 100 and not null
ALTER TABLE Student ADD COLUMN Age INT NOT NULL, 
ADD COLUMN Address VARCHAR(100) NOT NULL;
mysql> DESC Student;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| StudentID   | varchar(10)  | NO   | PRI | NULL    |       |
| FirstName   | varchar(25)  | NO   |     | NULL    |       |
| LastName    | varchar(25)  | NO   |     | NULL    |       |
| DateOfBirth | datetime     | NO   |     | NULL    |       |
| Gender      | varchar(25)  | NO   |     | NULL    |       |
| Email       | varchar(30)  | NO   | UNI | NULL    |       |
| Phone       | varchar(25)  | NO   |     | NULL    |       |
| Age         | int          | NO   |     | NULL    |       |
| Address     | varchar(100) | NO   |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
9 rows in set (0.01 sec)