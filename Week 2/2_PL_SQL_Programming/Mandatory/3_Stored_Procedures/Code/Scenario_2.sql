CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept IN varchar2, bonus IN number
)
IS
BEGIN
    Update Employees
    SET salary = salary + (salary * bonus/100)
    WHERE department = dept;
END;
/