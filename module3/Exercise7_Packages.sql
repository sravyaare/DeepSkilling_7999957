SET SERVEROUTPUT ON;

--------------------------------------------------
-- CUSTOMER MANAGEMENT PACKAGE
--------------------------------------------------

CREATE OR REPLACE PACKAGE CustomerManagement AS

    PROCEDURE AddCustomer(
        p_id NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER
    );

    PROCEDURE UpdateCustomer(
        p_id NUMBER,
        p_balance NUMBER
    );

    FUNCTION GetCustomerBalance(
        p_id NUMBER
    ) RETURN NUMBER;

END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(
        p_id NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER
    )
    IS
    BEGIN
        INSERT INTO Customers
        VALUES(
            p_id,
            p_name,
            p_dob,
            p_balance,
            SYSDATE,
            NULL
        );
    END;

    PROCEDURE UpdateCustomer(
        p_id NUMBER,
        p_balance NUMBER
    )
    IS
    BEGIN
        UPDATE Customers
        SET Balance = p_balance
        WHERE CustomerID = p_id;
    END;

    FUNCTION GetCustomerBalance(
        p_id NUMBER
    )
    RETURN NUMBER
    IS
        v_balance NUMBER;
    BEGIN
        SELECT Balance
        INTO v_balance
        FROM Customers
        WHERE CustomerID = p_id;

        RETURN v_balance;
    END;

END CustomerManagement;
/

--------------------------------------------------
-- EMPLOYEE MANAGEMENT PACKAGE
--------------------------------------------------

CREATE OR REPLACE PACKAGE EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_id NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2
    );

    PROCEDURE UpdateEmployee(
        p_id NUMBER,
        p_salary NUMBER
    );

    FUNCTION AnnualSalary(
        p_id NUMBER
    ) RETURN NUMBER;

END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_id NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2
    )
    IS
    BEGIN
        INSERT INTO Employees
        VALUES(
            p_id,
            p_name,
            p_position,
            p_salary,
            p_department,
            SYSDATE
        );
    END;

    PROCEDURE UpdateEmployee(
        p_id NUMBER,
        p_salary NUMBER
    )
    IS
    BEGIN
        UPDATE Employees
        SET Salary = p_salary
        WHERE EmployeeID = p_id;
    END;

    FUNCTION AnnualSalary(
        p_id NUMBER
    )
    RETURN NUMBER
    IS
        v_salary NUMBER;
    BEGIN
        SELECT Salary
        INTO v_salary
        FROM Employees
        WHERE EmployeeID = p_id;

        RETURN v_salary * 12;
    END;

END EmployeeManagement;
/

--------------------------------------------------
-- ACCOUNT OPERATIONS PACKAGE
--------------------------------------------------

CREATE OR REPLACE PACKAGE AccountOperations AS

    PROCEDURE OpenAccount(
        p_accountid NUMBER,
        p_customerid NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER
    );

    PROCEDURE CloseAccount(
        p_accountid NUMBER
    );

    FUNCTION GetTotalBalance(
        p_customerid NUMBER
    ) RETURN NUMBER;

END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(
        p_accountid NUMBER,
        p_customerid NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER
    )
    IS
    BEGIN
        INSERT INTO Accounts
        VALUES(
            p_accountid,
            p_customerid,
            p_type,
            p_balance,
            SYSDATE
        );
    END;

    PROCEDURE CloseAccount(
        p_accountid NUMBER
    )
    IS
    BEGIN
        DELETE FROM Accounts
        WHERE AccountID = p_accountid;
    END;

    FUNCTION GetTotalBalance(
        p_customerid NUMBER
    )
    RETURN NUMBER
    IS
        v_total NUMBER;
    BEGIN
        SELECT NVL(SUM(Balance),0)
        INTO v_total
        FROM Accounts
        WHERE CustomerID = p_customerid;

        RETURN v_total;
    END;

END AccountOperations;
/

--------------------------------------------------
-- TEST ALL SCENARIOS
--------------------------------------------------

BEGIN

    CustomerManagement.AddCustomer(
        20,
        'Chris',
        TO_DATE('1998-05-10','YYYY-MM-DD'),
        8000
    );

    CustomerManagement.UpdateCustomer(
        20,
        9000
    );

    DBMS_OUTPUT.PUT_LINE(
        'Customer Balance = ' ||
        CustomerManagement.GetCustomerBalance(20)
    );

    EmployeeManagement.HireEmployee(
        10,
        'Kevin',
        'Analyst',
        50000,
        'Finance'
    );

    EmployeeManagement.UpdateEmployee(
        10,
        55000
    );

    DBMS_OUTPUT.PUT_LINE(
        'Annual Salary = ' ||
        EmployeeManagement.AnnualSalary(10)
    );

    AccountOperations.OpenAccount(
        10,
        1,
        'Savings',
        2000
    );

    DBMS_OUTPUT.PUT_LINE(
        'Total Balance = ' ||
        AccountOperations.GetTotalBalance(1)
    );

    COMMIT;

END;
/

--------------------------------------------------
-- VERIFICATION QUERIES
--------------------------------------------------

SELECT *
FROM Customers
WHERE CustomerID = 20;

SELECT *
FROM Employees
WHERE EmployeeID = 10;

SELECT *
FROM Accounts;