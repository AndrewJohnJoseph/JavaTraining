select * From emp

--View

create or replace view myview as select empno, ename, mgr, deptno from emp

select * From myview

desc myview

create table gurutab( no number, name varchar2(100))
create or replace force view chiruview as select no, name from gurutab

desc chiruview

insert into gurutab values(1, 'test')
select * From chiruview

create table testtab (dob number(5), mgr number(10))
alter table testtab add (no number)
insert into testtab values(1, 1812, 123)

select * From testtab

create or replace force view chiruview as select no, name,dob, mgr from gurutab,testtab
select * From chiruview

create sequence mysequence increment by 1 start with 1 maxvalue 10 nocycle nocache

insert into testtab values(mysequence.NEXTVAL, 3012, 125);

create table dept1(deptno number(3) constraint dept_pk_deptno primary key, deptname number(5))
select * from dept1

create table customerlist(custno number(5) constraint cust_pk_custno primary key, custname varchar2(50) not null, phone number(5) unique, deptno number(3), sal number(5), constraint cust_ck_sal check(sal > 50000), 
constraint cust_fk_deptno foreign key(deptno) references dept1(deptno));

insert into dept1 values(1, 100)
insert into dept1 values(2, 200)

insert into customerlist values(1, 'Andrew', 8222, 1, 60000)
insert into customerlist values(2, 'John', 18222, 1, 60000)

select * From customerlist