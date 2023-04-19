Named  PLSQL Blocks a.k.a SUB PRograms

1) Procedure
2) Functions

3) Packages
4) Triggers

Procedures:
----------------

Modes in procedure:   IN , OUT, INOUT

create or replace procedure pro11(num in number)
as
begin
   dbms_output.put_line(' Time Now is :' || num);
end;
/

set serveroutput on;
execute pro11(2);
exec pro11(3)

create procedure pro12(num in number,enam out varchar2)
as
begin
   select ename into  enam from emp where empno=num;
   dbms_output.put_line(' Ename is :' || enam);
end pro12;
/
variable nam varchar2(20);
execute pro12(7369,:nam);
print nam;



create or replace procedure pro13(pnum in out varchar2)
as
begin
   pnum := '+91 '||substr(pnum,1,3) || ' - ' || substr(pnum,4,3) || ' - ' || substr(pnum,7) ;   
end pro13;
/

--pnum =+91 984-567-1234
variable phnum varchar2(20);
begin
:phnum:='9845671234';
end;
/


execute pro13(:phnum);
print phnum;


----------------------------------------------

Define procedure within a procedure

create table mytracktime(tno number(5),trackedon date);
select * from mytracktime;
create or replace procedure pro14(num in number,enam out varchar2, newno out number)
as
   procedure tracktime(myno in number, newno out number) is                                 -- defining a procedure
   begin
        dbms_output.put_line(' Myno is :' || myno);
       insert into mytracktime values(mph210seq.nextval,sysdate);
       newno := myno;
   end;
begin
   select ename into  enam from emp where empno=num;
   tracktime(num,newno);
   dbms_output.put_line(' newno is :' || newno);
   dbms_output.put_line(' Ename is :' || enam);
end pro14;
/
variable nam varchar2(20);



variable myno number;
begin
:myno := 123;
end;
/

execute pro14(7369,:nam, :myno);
print nam;
print myno;

create sequence mph210seq
  start with 1
  increment by 1
  nocycle
  nocache;

----------------------------------------------------------------------------------------------
Invoking/calling a procedure within a procedure:
----------------------------------------------------------------
create procedure pro1(num in number)
as
begin
     dbms_output.put_line('My Lucky Number :' || num);
end pro1;
/

create or replace procedure pro2(num in number,enam out varchar2)
as
begin
   select ename into  enam from emp where empno=num;
   dbms_output.put_line(' Ename is :' || enam);
   pro1(100);     -- invoking a procedure
   
exception
    when NO_DATA_FOUND then
         dbms_output.put_line('Error from Procedure . Employee Number Does Not Exist :( ');
end pro2;
/

variable nam varchar2(20);
execute pro2(7369,:nam);
print nam;

drop procedure pro1;
------------------------------------------------------------------

create or replace function tax(val in number)
return number
is
begin
    return (val*0.10);
end;
/

select sal,tax(sal) from emp;

Procedure                                         Function
DO NOT return any value             Do Return a value
Has 3 modes, in, out, inout           Has 1 mode, IN

create or replace function empfunc(eno in number)
return number
is
vsal emp.sal%type;
begin
     select sal into vsal from emp where empno=eno;
     return  vsal;  
end;
/

select empfunc(7788) from dual ;

Drop function empfunc;

-------------------------------------------------------
PACKAGES:

--> It will pack related procedures and functions together as a unit.
--> 2 sections
          i) the package specification --> have the proc / func declaration  ---> public in nature
          ii) the package body             --> have the proc /func  definition   ---> private in nature
--> the package spec and body shd be separatly created.
  
 create or replace package emppack
 as
      procedure pro12(num in number,enam out varchar2); 
      function tax(val in number) return number;
 end;
 /
 create or replace package body emppack
 as
    procedure pro12(num in number,enam out varchar2) is
    begin
     select ename into  enam from emp where empno=num;
      dbms_output.put_line(' Ename is :' || enam);
    end pro12;
    
    function tax(val in number) return number
    is
    begin
          return (val*0.10);
    end tax;
end emppack;
 /

variable nam varchar2(20);
execute emppack.pro12(7369,:nam);
print nam;
show errors;

select emppack.tax(sal) from emp;

drop package emppack;
drop package body emppack;

----------------------------------------------------
Triggers:
-------------

--What? A block which gets executed/called automatically when an event occurs
-- 2 types  
       i) Application trigger
                a) Statement level trigger
                b) Row level trigger
       ii) Database trigger
      iii) Instead of trigger  -- used with views  

CREATE [OR REPLACE ] TRIGGER trigger_name  
{BEFORE | AFTER | INSTEAD OF }  
{INSERT [OR] | UPDATE [OR] | DELETE}  
[OF col_name]  
ON table_name  
[REFERENCING OLD AS o NEW AS n]  
[FOR EACH ROW]  
WHEN (condition)   
DECLARE 
   Declaration-statements 
BEGIN  
   Executable-statements 
EXCEPTION 
   Exception-handling-statements 
END; 

stmt level trigger
create or replace trigger trig1
before insert on emp
begin
        dbms_output.put_line(' Welcome ');
end;
/
drop trigger trig1

insert into emp(empno,ename) values(8002,'Sakshi');
----------------------------------------------

create or replace trigger trig2
before update of sal on emp
FOR EACH ROW
when (new.sal  < old.sal)
begin
        dbms_output.put_line(' Do not decrease the salary ;(  ');
end;
/

update emp set sal=1500;
rollback;
----------------------------------------
create or replace trigger trig3
before insert or update of sal or delete on emp
begin
        if INSERTING THEN  
             dbms_output.put_line(' YOU ARE INSERTING ');
        elsif DELETING THEN  
             dbms_output.put_line(' YOU ARE DELETING ');
        elsif UPDATING('sal') THEN  
             dbms_output.put_line(' YOU ARE UPDATING SAL ');
        else
              dbms_output.put_line(' Do something  '); 
        end if;
end trig3;
/


delete from emp where empno=8002;
update emp set sal=1500 where empno=8001;
insert into emp(empno,ename) values(8002,'Sakshi');

--------------------------------------

instead of trigger
--------------------------

create table tab1(eno number, ename varchar2(10), did number(5));
create table tab2(dno number, dname varchar2(10));

create or replace view myview as select e.*,d.* from tab1 e , tab2 d where e.did=d.dno;

select * from myview;


create or replace trigger trig4
instead of   insert on myview
FOR EACH ROW
begin
        if INSERTING THEN  
            insert into tab1 values(:new.eno,:new.ename,:new.did);
             insert into tab2 values(:new.dno,:new.dname);
       end if;       
end trig4;
/

INSERT INTO MYVIEW VALUES(100,'DIVYA',1,1,'IT');


SELECT * FROM TAB1;
SELECT * FROM TAB2;
SELECT * FROM MYVIEW;
--------------------------------------------
Database trigger:
---------------------------
create table log_trig_table(user_id varchar2(20), log_date timestamp, action varchar2(30));

create or replace trigger logontrigger
after LOGON ON SCHEMA
begin
    insert into log_trig_table values(user,current_timestamp,'Logging ON');
end;
/

create or replace trigger logofftrigger
before LOGOFF ON SCHEMA
begin
    insert into log_trig_table values(user,current_timestamp,'Logging OFF');
end;
/
select * from log_trig_table


Create a program to retrieve the number of years of service for a specific employee.
a. Create a stored function called GET_SERVICE_YRS to retrieve the total number of years
of service for a specific employee.
The function should accept the employee ID as a parameter and return the number of years
of service. Add error handling to account for an invalid employee ID.

b. Invoke the function. You can use the following data:
EXECUTE DBMS_OUTPUT.PUT_LINE(get_service_yrs(999))
Hint: The above statement should produce an error message because there is no employee
with employee ID 999.

EXECUTE DBMS_OUTPUT.PUT_LINE ('Approximately .... ' ||get_service_yrs(7499) || ' years')
Hint: The above statement should be successful and return the number of years of service
for employee with employee ID 7499

Make these functions available in a package name EMPPACK

Create a stored procedure called UPD_SAL to update the  salaries
for a specific job in the EMP table.
Pass three parameters to the procedure: the job , a new minimum salary, and a new
maximum salary for the job. Add exception handling to account for an invalid job name in the
EMP table. Also, raise an exception if the maximum salary supplied is less than the
minimum salary.

select * From emp1
select * From salgrade
CREATE TABLE emp1 AS SELECT * FROM emp

create or replace function calculateService(empid in varchar2)
return number
is
    joindate varchar2(50);
    emp_not_found EXCEPTION;
begin
    select  hiredate into joindate from emp where empno = empid;
    if joindate is null then
        RAISE emp_not_found;
    else 
        return  round(((round(sysdate,'month')) - (round(to_date(joindate),'month')))/(30 * 12));
    end if;
exception
     when emp_not_found then            --handle
         dbms_output.put_line('Emp Number  : '|| empid || ' not found ');
end;
/

create or replace procedure updateSalary(myjob in varchar2,minSalary in number, maxSalary in number)
as
    actualmaxsalary number;
    invalid_salary EXCEPTION;
    NOTFOUND EXCEPTION;
begin
    select max(sal) into actualmaxsalary from emp1 where job=myjob;
    if (actualmaxsalary is null) then
        RAISE NOTFOUND;
    elsif (maxSalary < actualmaxsalary) then
        RAISE invalid_salary;
    else
        update emp1 set sal=maxSalary where job=myjob
    end if;
exception
    when invalid_salary then
        dbms_output.put_line('Invalid Minimun -  maximum Salary');
    when NOTFOUND then
         dbms_output.put_line('Error from Procedure . Employee Number Does Not Exist :( ');
end updateSalary;
/

(select max(sal) from emp1 where job = 'CLERK')
select s.grade from salgrade s where s.losal < (select sal from emp1 e where e.job = 'CLERK') and s.hisal > (select sal from emp1 e where e.job = 'CLERK')

select calculateService(7369) from dual;

set serveroutput on;
execute updateSalary('CLERK', 800, 1000)

