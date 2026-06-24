CREATE OR REPLACE FUNCTION CalculateAge(
    p_dob DATE
)
RETURN NUMBER
IS
    v_age NUMBER;
BEGIN

    v_age := FLOOR(
        MONTHS_BETWEEN(SYSDATE,p_dob)/12
    );

    RETURN v_age;

END;
/
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount NUMBER,
    p_interest_rate NUMBER,
    p_years NUMBER
)
RETURN NUMBER
IS
    v_installment NUMBER;
BEGIN

    v_installment :=
    (p_loan_amount +
     (p_loan_amount*p_interest_rate*p_years/100))
     /(p_years*12);

    RETURN ROUND(v_installment,2);

END;
/
CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_accountid NUMBER,
    p_amount NUMBER
)
RETURN VARCHAR2
IS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_accountid;

    IF v_balance >= p_amount THEN
        RETURN 'TRUE';
    ELSE
        RETURN 'FALSE';
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 'ACCOUNT NOT FOUND';
END;
/
SELECT CalculateAge(
       TO_DATE('1990-07-20','YYYY-MM-DD')
       ) AS AGE
FROM dual;

SELECT CalculateMonthlyInstallment(
       50000,
       5,
       5
       ) AS MONTHLY_INSTALLMENT
FROM dual;

SELECT HasSufficientBalance(
       1,
       500
       ) AS BALANCE_CHECK
FROM dual;