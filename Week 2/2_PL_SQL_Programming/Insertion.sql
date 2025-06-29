-- Customers (5 records: some above 60, balances above/below 10000)
INSERT INTO Customers VALUES (1, 'John Smith', TO_DATE('15-MAY-1950', 'DD-MON-YYYY'), 7500, SYSDATE, 'FALSE');
INSERT INTO Customers VALUES (2, 'Emily Johnson', TO_DATE('22-SEP-1985', 'DD-MON-YYYY'), 12000, SYSDATE, 'TRUE');
INSERT INTO Customers VALUES (3, 'Robert Brown', TO_DATE('03-JUL-1948', 'DD-MON-YYYY'), 5000, SYSDATE, 'FALSE');
INSERT INTO Customers VALUES (4, 'Sarah Davis', TO_DATE('30-NOV-1990', 'DD-MON-YYYY'), 15000, SYSDATE, 'TRUE');
INSERT INTO Customers VALUES (5, 'Michael Wilson', TO_DATE('12-APR-1965', 'DD-MON-YYYY'), 8500, SYSDATE, 'FALSE');

-- Accounts (5 records)
INSERT INTO Accounts VALUES (101, 1, 'Savings', 7500, SYSDATE);
INSERT INTO Accounts VALUES (102, 2, 'Checking', 12000, SYSDATE);
INSERT INTO Accounts VALUES (103, 3, 'Savings', 5000, SYSDATE);
INSERT INTO Accounts VALUES (104, 4, 'Checking', 15000, SYSDATE);
INSERT INTO Accounts VALUES (105, 5, 'Savings', 8500, SYSDATE);

-- Transactions (5 records)
INSERT INTO Transactions VALUES (1001, 101, TO_DATE('10-JUN-2025', 'DD-MON-YYYY'), 500, 'Deposit');
INSERT INTO Transactions VALUES (1002, 102, TO_DATE('11-JUN-2025', 'DD-MON-YYYY'), 200, 'Withdraw');
INSERT INTO Transactions VALUES (1003, 103, TO_DATE('12-JUN-2025', 'DD-MON-YYYY'), 1000, 'Deposit');
INSERT INTO Transactions VALUES (1004, 104, TO_DATE('13-JUN-2025', 'DD-MON-YYYY'), 300, 'Withdraw');
INSERT INTO Transactions VALUES (1005, 105, TO_DATE('14-JUN-2025', 'DD-MON-YYYY'), 700, 'Deposit');

-- Loans (5 records: some due before 20th Jul 2025)
INSERT INTO Loans VALUES (201, 1, 20000, 5.5, TO_DATE('01-JAN-2025', 'DD-MON-YYYY'), TO_DATE('15-JUL-2025', 'DD-MON-YYYY'));
INSERT INTO Loans VALUES (202, 2, 15000, 4.5, TO_DATE('01-FEB-2025', 'DD-MON-YYYY'), TO_DATE('01-AUG-2025', 'DD-MON-YYYY'));
INSERT INTO Loans VALUES (203, 3, 10000, 6.0, TO_DATE('01-MAR-2025', 'DD-MON-YYYY'), TO_DATE('10-JUL-2025', 'DD-MON-YYYY'));
INSERT INTO Loans VALUES (204, 4, 25000, 5.0, TO_DATE('01-APR-2025', 'DD-MON-YYYY'), TO_DATE('01-SEP-2025', 'DD-MON-YYYY'));
INSERT INTO Loans VALUES (205, 5, 18000, 5.5, TO_DATE('01-MAY-2025', 'DD-MON-YYYY'), TO_DATE('15-AUG-2025', 'DD-MON-YYYY'));

-- Employees (5 records)
INSERT INTO Employees VALUES (301, 'David Miller', 'Manager', 75000, 'Finance', TO_DATE('10-JAN-2020', 'DD-MON-YYYY'));
INSERT INTO Employees VALUES (302, 'Jennifer Lee', 'Analyst', 60000, 'IT', TO_DATE('15-MAR-2021', 'DD-MON-YYYY'));
INSERT INTO Employees VALUES (303, 'James Taylor', 'Teller', 45000, 'Operations', TO_DATE('20-MAY-2022', 'DD-MON-YYYY'));
INSERT INTO Employees VALUES (304, 'Lisa White', 'Manager', 80000, 'HR', TO_DATE('05-JUL-2019', 'DD-MON-YYYY'));
INSERT INTO Employees VALUES (305, 'Thomas Clark', 'Developer', 65000, 'IT', TO_DATE('12-SEP-2020', 'DD-MON-YYYY'));