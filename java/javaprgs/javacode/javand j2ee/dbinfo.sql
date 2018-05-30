table names:
Student
Product
supplier
Manufac
create table student(sid int,sname varchar(20),sadd varchar(20),sphone int,remarks varchar(20))
insert into student values(1000,'kathir','chennai',1234,'good')
insert into student values(1001,'akathir','schennai',1234,'good')
insert into student values(1002,'bkathir','dchennai',1234,'good')
insert into student values(1003,'ckathir','cchennai',1234,'good')
select * from student
create table product(pid int,pname varchar(20),padd varchar(20),pphone int,total int)
insert into product values(100000,'raja','cmumbmai',1234,100)
insert into product values(10001,'araja','smumbmai',1234,200)
insert into product values(10002,'braja','dmumbmai',1234,300)
insert into product values(10003,'craja','cmumbmai',1234,400)
select * from student
create table supplier(srid int,srname varchar(20),sradd varchar(20),srphone int,remarks varchar(20))
insert into supplier values(100,'kumar','kochin',1234,'good')
insert into supplier values(101,'senthil','schennai',1234,'good')
insert into supplier values(102,'pavi','dmumbai',1234,'good')
insert into supplier values(103,'karthik','cdelhi',1234,'good')
select * from supplier
create table manufac(mid int,mname varchar(20),madd varchar(20),mphone int,salary int)
insert into manufac values(2000,'kumar','kochin',1234,1222)
insert into manufac values(2101,'senthil','schennai',1234,2222)
insert into manufac values(2102,'pavi','dmumbai',1234,56655)
insert into manufac values(2103,'karthik','cdelhi',1234,221)
select * from manufac
create table college(cid int,cname varchar(20),cadd varchar(20),cphone int,remarks varchar(20))
insert into college values(1000,'kathir','chennai',1234,'good')
insert into college values(1001,'akathir','schennai',1234,'good')
insert into college values(1002,'bkathir','dchennai',1234,'good')
insert into college values(1003,'ckathir','cchennai',1234,'good')
select * from college
==================================Inner join=========================================
create table college(cid int,cname varchar(20),cadd varchar(20),cphone int,remarks varchar(20))
insert into college values(1000,'kathir','chennai',1234,'good')
insert into college values(1001,'akathir','schennai',1234,'good')
insert into college values(1002,'bkathir','dchennai',1234,'good')
insert into college values(1006,'akathir','schennai',1234,'good')
insert into college values(1004,'bkathir','dchennai',1234,'good')
insert into college values(1003,'ckathir','cchennai',1234,'good')
select * from college
create table student(sid int,sname varchar(20),sadd varchar(20),sphone int,remarks varchar(20))
insert into student values(1000,'kathir','chennai',1234,'good')
insert into student values(1001,'akathir','schennai',1234,'good')
insert into student values(1002,'bkathir','dchennai',1234,'good')
insert into student values(1003,'ckathir','cchennai',1234,'good')
insert into student values(10501,'akathir','schennai',1234,'good')
insert into student values(10052,'bkathir','dchennai',1234,'good')
select * from student
create table product(pid int,pname varchar(20),padd varchar(20),pphone int,total int)
insert into product values(100000,'raja','cmumbmai',1234,100)
insert into product values(10001,'araja','smumbmai',1234,200)
insert into product values(10002,'braja','dmumbmai',1234,300)
insert into product values(10003,'craja','cmumbmai',1234,400)
select * from student
==================================================================================
select* from student inner join college on student.sid=college.cid
select sid,sname from student stu inner join college col on stu.sid=col.cid
select max(salary) from manufac where salary<(select max(salary) from manufac)
select sid,sname from student stu join college col on stu.sid=col.cid
select sid,sname from student stu left outer join college col on stu.sid=col.cid
select sid,sname from student stu right outer join college col on stu.sid=col.cid
select sid,sname from student stu full outer join college col on stu.sid=col.cid
select sid,sname from student stu cross join college 
select * from student cross join college 
select sid,sname from student s inner join product p on s.sid=p.pid inner join manufac f on p.pphone=s.aphone where mphone=1234
select s.sid,s.sname from student s inner join student s1 on s.sid=s1.sid
select * from student
select * from college
select * from manufac

