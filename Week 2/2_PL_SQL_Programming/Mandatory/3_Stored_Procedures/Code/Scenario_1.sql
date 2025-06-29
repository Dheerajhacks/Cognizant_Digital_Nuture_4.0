CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS

BEGIN
    Update ACCOUNTS set balance = balance + (balance * 0.01)
    where ACCOUNTTYPE = 'Savings';
END;
/