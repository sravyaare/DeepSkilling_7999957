SET SERVEROUTPUT ON;

-- =====================================
-- Scenario 1
-- GenerateMonthlyStatements
-- =====================================

DECLARE

    CURSOR GenerateMonthlyStatements IS
        SELECT CustomerID,
               AccountID,
               TransactionID,
               Amount,
               TransactionType,
               TransactionDate
        FROM Transactions t
        JOIN Accounts a
        ON t.AccountID = a.AccountID
        WHERE EXTRACT(MONTH FROM TransactionDate)
              = EXTRACT(MONTH FROM SYSDATE);

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        '===== Monthly Statements ====='
    );

    FOR rec IN GenerateMonthlyStatements LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Customer ID: ' || rec.CustomerID ||
            ' | Account ID: ' || rec.AccountID ||
            ' | Transaction ID: ' || rec.TransactionID ||
            ' | Amount: ' || rec.Amount ||
            ' | Type: ' || rec.TransactionType
        );

    END LOOP;

END;
/

-- =====================================
-- Scenario 2
-- ApplyAnnualFee
-- =====================================

DECLARE

    CURSOR ApplyAnnualFee IS
        SELECT AccountID
        FROM Accounts;

BEGIN

    FOR rec IN ApplyAnnualFee LOOP

        UPDATE Accounts
        SET Balance = Balance - 100
        WHERE AccountID = rec.AccountID;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Annual Fee Applied Successfully'
    );

END;
/

-- =====================================
-- Scenario 3
-- UpdateLoanInterestRates
-- =====================================

DECLARE

    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID,
               InterestRate
        FROM Loans;

BEGIN

    FOR rec IN UpdateLoanInterestRates LOOP

        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = rec.LoanID;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Loan Interest Rates Updated'
    );

END;
/

-- =====================================
-- Verification Queries
-- =====================================

SELECT AccountID,
       Balance
FROM Accounts;

SELECT LoanID,
       InterestRate
FROM Loans;