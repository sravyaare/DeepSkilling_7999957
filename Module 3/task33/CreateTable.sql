USE BankDB;


CREATE TABLE accounts(
    account_id INT PRIMARY KEY,
    account_holder VARCHAR(50),
    balance DOUBLE
);

INSERT INTO accounts VALUES
(101,'Alice',10000),
(102,'Bob',5000);