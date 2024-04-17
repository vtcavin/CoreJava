CREATE DATABASE BankSystem;
USE BankSystem;
-- BankAccount table
CREATE TABLE BankAccount
(
Account_Id VARCHAR(50) PRIMARY KEY,
Account_holder_name VARCHAR(20) NOT NULL, 
Account_Balance BIGINT
);
-- Inserting into BankAccount table
INSERT INTO BankAccount(Account_Id, Account_holder_name, Account_Balance)
VALUES
('B101', 'Cavin' ,1046),
('B102', 'Rahul' ,164000),
('B103', 'Akash' ,38750),
('B104', 'Dhanush' ,7000);
-- Selecting name and balance from BankAccount table
SELECT  Account_holder_name, Account_Balance FROM BankAccount;
mysql> SELECT  Account_holder_name, Account_Balance FROM BankAccount;
+---------------------+-----------------+
| Account_holder_name | Account_Balance |
+---------------------+-----------------+
| Cavin               |            1046 |
| Rahul               |          164000 |
| Akash               |           38750 |
| Dhanush             |            7000 |
+---------------------+-----------------+
4 rows in set (0.00 sec)

-- Selecting name and balance from BankAccount table where balance is greather than 300000
SELECT  Account_holder_name, Account_Balance FROM BankAccount WHERE Account_Balance>30000;

mysql> SELECT  Account_holder_name, Account_Balance FROM BankAccount WHERE Account_Balance>30000;
+---------------------+-----------------+
| Account_holder_name | Account_Balance |
+---------------------+-----------------+
| Rahul               |          164000 |
| Akash               |           38750 |
+---------------------+-----------------+
2 rows in set (0.00 sec)

-- updating balance from BankAccount table
UPDATE BankAccount SET Account_Balance=50000 WHERE Account_Id='B103';
mysql> UPDATE BankAccount SET Account_Balance=50000 WHERE Account_Id='B103';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
-- viewing update BankAccount table
SELECT * FROM BankAccount;
mysql> SELECT * FROM BankAccount;
+------------+---------------------+-----------------+
| Account_Id | Account_holder_name | Account_Balance |
+------------+---------------------+-----------------+
| B101       | Cavin               |            1046 |
| B102       | Rahul               |          164000 |
| B103       | Akash               |           50000 |
| B104       | Dhanush             |            7000 |
+------------+---------------------+-----------------+
4 rows in set (0.00 sec)