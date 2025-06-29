BEGIN
    for i IN (select LoanID, CustomerID, EndDate from LOANS 
    where EndDate BETWEEN SYSDATE AND SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Loan ID: ' || i.LoanID || 
            ', Customer ID: ' || i.CustomerID || 
            ', End Date: ' || TO_CHAR(i.EndDate, 'YYYY-MM-DD') ||
            ' — your loan is ending soon, please contact us for renewal options.'
        );
    END LOOP;
END;
/