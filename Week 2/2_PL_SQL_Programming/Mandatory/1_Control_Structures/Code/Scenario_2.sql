BEGIN
    for cus IN (select CustomerID, balance, IsVip from CUSTOMERS) LOOP
    if cus.balance > 10000 THEN
        UPDATE CUSTOMERS
        SET IsVip = 'TRUE'
        WHERE CustomerID = cus.CustomerID;
    end IF;
    end loop;
END;
/