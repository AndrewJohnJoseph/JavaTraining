
-- Group functions  - ignores NULL values

select sum(sal),count(*),min(sal),max(sal),avg(sal) from emp;
select count(comm) from emp;
select count(nvl(comm,1)) from emp ;
 
 
 
 --group by clause  -- to create subgroups
 
 Rules:
1) Columns in the select list shd be there in group by clause
   select job,deptno from emp group by deptno,job;

2) Columns in the group by clause may or may not be there in the select list
 	 select deptno, job from emp group by deptno,job;


3) Alias name cannot be used in group by
	 select deptno en from emp group by deptno;

4) group by results in unique values/results
	select deptno from emp group by deptno;


5) The columns in the select list within group function may or maynot be there in group by clause.
	select min(sal),deptno from emp group by deptno;


6) To restrict the no.of rows in the group use having clause
	select min(sal),deptno from emp group by deptno having deptno=20;


7) The column used in having clause shd be used in group by clause.
	select min(sal),deptno from emp group by deptno,sal having sal>1000;

8) If the column in the having clause is within the group function , then it may or maynot be in the group by clause.
	select min(sal),deptno from emp group by deptno having min(sal)>900;

9) Having clause cannot accept alias name.
	select min(sal),deptno  from emp group by deptno dn having dn=30;

10) Cannot use group function with where clause
	select sal,deptno from emp where min(sal)>=950 

--Joins
---------

Natural join  --  it is a type of equi join where the equality condition is taken implicity
--column used in NATURAL join cannot have qualifier

select ename,job,sal,deptno,dname from emp natural join dept;

--Where clause shd be given after join condition.
select ename,job,sal,deptno,dname from emp join dept using(deptno) where job like 'SALESMAN';

-- For applying the join condition use on NOT where.
select e.ename,e.job,e.sal,d.deptno,d.dname from emp e  join dept d on e.deptno=d.deptno where job like 'MANAGER';

select e.ename,e.job,e.sal,e.deptno,d.dname from emp e  join dept d on e.deptno>20;


select e.ename,e.job,e.sal,e.deptno,d.dname from emp e  full outer join dept d on e.deptno=d.deptno;

select m.ename || '  is the manager of  ' || e.ename "Manager Details" from emp  e join emp m
on  m.empno = e.mgr;

select e.ename,e.deptno,d.dname from emp e cross join dept d;

--Subquery

1) Write a query to find the salary of the employees whose salary is greater than the salary of the employee
whose id is 7566?
select ename,sal from emp where sal>(select sal from emp where empno=7566);

2) Write a query to find the employees who all are earning the highest salary?
select ename,sal from  emp where sal = (select max(sal) from emp);

second highest salary?
select max(sal) from  emp where sal< (select max(sal) from emp);

Multiple row subquery:
-- operators used here is IN , ANY, ALL

<ANY   => <MAX
> ANY => >MIN
=ANY  => IN
>ALL  =>  >MAX
<ALL  =>  <MIN

1) Write a query to find the employees whose salary is equal to the salary of atleast one employee in depart 30?
select empno,ename,deptno,sal from emp where sal in(select distinct sal from emp where deptno=30);

2) Write a query to find the employees whose salary is greater than the salary of atleast one employee in depart 30?
select empno,ename,deptno,sal from emp where sal >ANY(select sal from emp where deptno=30);

select sal from emp where deptno=30;

3) Write a query to find the employees whose salary is less  than the salary of atleast one employee in depart 30?
select empno,ename,deptno,sal from emp where sal <ANY(select sal from emp where deptno=30);


4) Write a query to find the employees whose salary is less  than the salary of all of the employee in depart 30?
select empno,ename,deptno,sal from emp where sal <ALL(select sal from emp where deptno=30);

Multiple Column subquery:
select empno,ename,mgr,deptno from emp where (mgr,deptno) in
(select mgr,deptno from emp where empno in(7566,7788));


7566  7839
select mgr,deptno from emp where empno in(7566,7788)

Corelated subquery:
-----------------------
-- For each and every excution of the subquery , the outer query will be executed.
-- The sub query is executed for each row of the main query.

select ename , (select d.dname from dept d where d.deptno =e.deptno) dname from emp e;

1.Write a query to list the department names which have at least one employee.

select dname from dept d where exists (select 1  from emp e where e.deptno=d.deptno);


1. Display all the information of the EMP table.

select * From EMP

2. Display unique Jobs from EMP table.

select distinct job from EMP

3. Display the details of all MANAGERS.

select distinct mgr from emp


select * from emp join dept using(deptno) where deptno=10

Set operator
-------------------
select deptno from emp union select deptno from dept;
select deptno from emp union all select deptno from dept;
select deptno from emp intersect select deptno from dept;
select deptno from dept minus select deptno from emp;


DDL , DML
-----------------
drop table memp;
create table memp(eno number(5),ename varchar2(10),sal number(20));

desc memp;

insert into memp values(10,'Ram',1000);
insert into memp values(20,'Ravi',2000);
savepoint A;
insert into memp values(30,'Akhil',3000);
savepoint B;
insert into memp(eno,ename) values(40,'Asha');
savepoint C;
update memp set sal=4500 where eno=40;
rollback to C;
delete from memp where eno=40 ;
update memp set sal=5000 where eno=40;
commit;

rollback;
alter table memp add phone number(5);
alter table memp modify phone number(10);
alter table memp drop column phone;
select * from memp;

truncate table memp;
alter table memp rename column phone to mobile;


Transaction : TCL
--- Begins with DML
--- Ends with TCL - commit,rollback ,savepoint(bookmark)
-- All the DDL stmt will have auto commit.
-- All DML requires explicit commit.
-- After commit rollback will not work
-- After commit savepoints will be deleted.

-------------------------------------------------
--Insert using subqueries:

insert into table(col,col) values (subquery);

create table tab1(col1 number,col2 number);
create table tab2(col3 number,col4 number);

select * from tab1,tab2;
--syntax 1:
insert into tab1(col1,col2) select empno, sal from emp;

--
--insert into tab2(col2, col4) values (select t1.col2,t2.col4 from tab1 t1 ,tab2 t2);

select * from tab2;
drop table tab2;

create table tab2 as select * from emp;   -- take a backup of a table
drop table stu2
create table stu2(rollno number, sname varchar2(10), dept number);
insert into stu2(rollno,sname,dept) select empno,ename,deptno from emp; 

-- Multiple insert

create table stu2(rollno number, sname varchar2(10), dept number);

insert all
into stu2(rollno,sname,dept) values(100,'Chiru',20)
into stu2(rollno,sname,dept) values(200,'Chitra',20)
into stu2(rollno,sname,dept) values(300,'Shankar',20)
into stu2(rollno,sname,dept) values(400,'Sanjeev',20)
select * from dual;

select * from stu2;



