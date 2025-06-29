BEGIN
   for cus IN (Select l.loanid, l.InterestRate, c.DOB, c.Name
      from LOANS l join CUSTOMERS c ON l.CUSTOMERID = c.CUSTOMERID) LOOP
      if MONTHS_BETWEEN(SYSDATE, cus.DOB) > 60 THEN
      update LOANS
         set InterestRate = cus.InterestRate - 1
         where loanid = cus.loanid;
      end if;
   end LOOP;
end;
/