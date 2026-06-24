SET SERVEROUTPUT ON;

--------------------------------------------------
-- Scenario 1 : Apply 1% discount for customers
-- above 60 years old
--------------------------------------------------

BEGIN
    FOR cust IN (
        SELECT CustomerID,
               FLOOR(MONTHS_BETWEEN(SYSDATE,DOB)/12) Age
        FROM Customers
    )
    LOOP
        IF cust.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Interest rate discount applied to Customer ID '
                || cust.CustomerID
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/

SELECT LoanID,
       CustomerID,
       InterestRate
FROM Loans;

--------------------------------------------------
-- Scenario 2 : Mark customers as VIP
--------------------------------------------------

BEGIN
    FOR cust IN (
        SELECT CustomerID,
               Balance
        FROM Customers
    )
    LOOP
        IF cust.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'VIP status granted to Customer ID '
                || cust.CustomerID
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/

SELECT CustomerID,
       Name,
       Balance,
       IsVIP
FROM Customers;

--------------------------------------------------
-- Scenario 3 : Loan reminder for next 30 days
--------------------------------------------------

BEGIN
    FOR loan_rec IN (
        SELECT LoanID,
               CustomerID,
               EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE
                          AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || loan_rec.LoanID
            || ' for Customer '
            || loan_rec.CustomerID
            || ' is due on '
            || TO_CHAR(loan_rec.EndDate,'DD-MON-YYYY')
        );

    END LOOP;
END;
/