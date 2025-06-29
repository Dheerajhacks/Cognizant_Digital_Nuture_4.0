CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN varchar2, to_account IN varchar2, amount IN NUMBER
)
IS
BEGIN
    Select blanace into bal from accounts where accountId = from_account;
    if bal < amount THEN
        RAISE_APPLICATION_ERROR(-40001, 'Insufficient funds for transfer');
    END IF;
    UPDATE Accounts
    SET balance = balance - amount
    WHERE account_id = from_account;

    UPDATE Accounts
    SET balance = balance + amount
    WHERE account_id = to_account;
END;
/