create table dalemp(empid number, empname varchar2(20));

select * from dalemp;
----------------------------------------------------------------------------------------------------------
select * from emp;
select empno,ename from emp;  -- select column name
select empno,ename,sal from emp;

--as is optional
select empno,ename,sal as salary from emp;   
select empno,ename,sal Annualsalary from emp order by Annualsalary;   -- no " " double quates are required when alias doesnt contain spaces 

select empno,ename,sal  "Annual salary" from emp;  -- alias shd b enclosed within "  " when the alias name contains space
select empno, ename, sal, sal+200 Bonus from emp;  -- accepts expr

select distinct deptno from emp;
select distinct deptno,sal, ename from emp;
-- adding string litral using '  ' . Concatination operator is ||
select ename ||' works for   ' || mgr  "manager Details" from emp;

select ename || q'[work's for]'  || mgr  "manager Details" from emp;

describe emp;  -- gives table structure
desc emp;

select empno,ename,sal as salary from emp where ename='SMITH';   
select empno,ename,sal as salary,job  from emp where ename='SMITH' and  job='CLERK' ;   
select empno,ename,sal as salary,job  from emp where ename='SMITH' or  sal>2500 ;   

select empno,ename,sal as salary,job  from emp where sal not between 1000 and 3000;

select empno,ename,sal as salary,job  from emp where ename not like 'A%';
select empno,ename,sal as salary,job  from emp where ename like  '_A%';
select empno,ename,sal as salary,job  from emp where ename like '%N';

select empno,ename,sal as salary,job  from emp where sal not between 1000 and 3000;

select empno,ename,sal as salary,job  from emp where ename not like 'A%';
select empno,ename,sal as salary,job  from emp where ename like  '_A%';
select empno,ename,sal as salary,job  from emp where ename like '%N';
--*************************
select empno,ename,sal as salary,job,deptno  from emp where deptno  in(10,20);
select empno,ename,sal as salary,job,deptno  from emp where deptno=10 or deptno=20;

select empno,ename,sal as salary,job,deptno,comm  from emp where comm is not null;

select empno, ename, sal as salary, job, deptno, comm from emp order by salary --alias name can be used in order by but not in where class
select empno, ename, sal as salary, job, deptno, comm from emp order by 2
select empno, ename, sal as salary, job, deptno, comm from emp where sal < 1000 order by 2

select &en from emp

select &enae from &etab where &S=&val

select lower(ename) from emp
select upper('hello') from emp
select initcap(ename) from emp

select concat('Andrew', ' John') from emp
select length('Andrew ') from emp -- includes space in the length
select instr('Andrew Andrew', 'A') from emp -- first occurance will be consider

select ename, substr(ename, 1, 3) from emp
select ename, substr(ename, 3) from emp

select replace('ambrtam','am','jj') from dual; -- consider the string
select translate('ambrtam','amb','bo4') from dual; -- consider the character

select length('     hei     ') from dual;
select length(trim('     hei     ')) from dual;
select lpad('Hello',10,'#') from dual;
select rpad('Hello',10,'#') from dual;

select chr(66) from dual;
select ascii('B') from dual;




select ROUND(45.926, 2) from dual;
select ROUND(45.926, 1) from dual;
select ROUND(45.926, 0) from dual;
select ROUND(445.926, -2) from dual;
select ROUND(444.926, -1) from dual;


select trunc(45.926, 2) from dual;
select trunc(45.926, 1) from dual;
select trunc(45.926, 0) from dual;
select trunc(45.926, -1) from dual;
select trunc(445.926, -2) from dual;
select mod(1600,300) from dual;

select sysdate from dual;  -- Date format DD-MON-RR   (DD-MM-RR)
select current_timestamp from dual;

select round(to_date('06-Jan-21'),'year') from dual;
select round(to_date('06-Jan-21'),'month') from dual;
select trunc('06-Jan-21','year') from dual;
select trunc('06-Jan-21','month') from dual;

select round('26-Jan-21','year') from dual;
select round('26-Jan-21','month') from dual;
select trunc('26-Jan-21','year') from dual;
select trunc('26-Jan-21','month') from dual;

select round('06-Jul-21','year') from dual;
select round('06-Jul-21','month') from dual;
select trunc('06-Jul-21','year') from dual;
select trunc('06-Jul-21','month') from dual;

select round('26-Jul-21','year') from dual;
select round('26-Jul-21','month') from dual;
select trunc('26-Jul-21','year') from dual;
select trunc('26-Jul-21','month') from dual;

select round('15-Jun-21','year') from dual;
select round('15-Jun-21','month') from dual;
select trunc('15-Jun-21','year') from dual;
select trunc('15-Jun-21','month') from dual;  --Ans:

select  to_char(sysdate,'MONTH DD, YEAR') from dual;
select  to_char(sysdate,'MON DD, YYYY') from dual;
select  to_char(sysdate,'MON DD, YY DAY') from dual;
select  to_char(sysdate,'dd/mm/yy') from dual;
select  to_char(sysdate,'dd-mm-yy') from dual;

select  to_char(sysdate,'ddspth "of" Mon yy') from dual;

select  to_char(sysdate,'fmDDth "of" Mon yy hh24:mi:ss') from dual;

-- https://docs.oracle.com/cd/B28359_01/olap.111/b28126/dml_commands_1029.htm#OLADM780

select to_char(to_date('21-apr-1972'),'ddth "of" Mon YYYY') from dual;

select to_char(hiredate,'ddth "of" Mon YYYY') from emp;

select to_char(sal,'$99,999.000') from emp;

select to_number('1000') from dual;

select '10000'||'200' from dual;
select 10000+20 from dual;


