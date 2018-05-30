create table softech(sid int,sname varchar(20),sadd varchar(20),sphone int,remarks varchar(20))
insert into softech values(1000,'kathir','chennai',1234,'good')
insert into softech values(1001,'akathir','schennai',1234,'good')
insert into softech values(1002,'bkathir','dchennai',1234,'good')
insert into softech values(1003,'ckathir','cchennai',1234,'good')
select * from softech
create table propus(pid int,pname varchar(20),padd varchar(20),pphone int,salary int)
insert into propus values(1000,'kathir','chennai',1234,2000)
insert into propus values(1001,'akathir','schennai',1234,5000)
insert into propus values(1002,'bkathir','dchennai',1234,2002)
insert into propus values(1003,'ckathir','cchennai',1234,3495)
select * from propus
============================DDl================================
exec sp_help softech
exec sp_help softech
========================Alter Table============================
modifying the  table
1.To Add new column to a table
2.To Drop Column to a table
3.To modify an existing table
alter table softech add period datetime
select * from softech
alter table softech drop column remarks
alter table softech alter column sname varchar(40)
sp_help  softech
		Conclussion
modifying the  table
1.To Add new column to a table
2.To Drop Column to a table
3.To modify an existing table
1.alter table softech add newcolumnname vartype
2.1.alter table softech drop column columnname
3.alter table softech alter column existingcolumnname vartype
======================select statement=========================
select * from propus
***add new heading on column name ***
select pid 'propusid' from propus
select pname as propusname from propus
select pid 'propusid',pname 'propusname' from propus
***concadination on column***
select padd +'concatination'+ pname from propus
****select range of column****
select top 25 PERCENT * from propus
SELECT TOP 3 * FROM PROPUS
=========================where clause==============================
attributes of select
=,<,<=,>,>=,<>,between,like,or,and,is null,is not null,in
select * from propus where pphone<>1234
select * from propus
select * from propus where pid=1000 or pname='aaaa'
select * from propus where pid=1000 and pname='kathir'
select * from propus where salary between 10000 and 110000
select * from propus where salary between 2000 or 10000//error
select * from propus where salary is null
select * from propus where salary is not null
select * from propus where pname  in ('kathir','manager')//is like OR 
select * from propus where pname not in ('kathir','manager')
like 	% match any string/character
	_ match single character
	[] match a single character with in the bracket
	[^] match a single character with in the bracket not listed
====================update statement=====================================
update propus set pid=10001 where pid=1000
select * from propus	
update propus set pid=pid-9000 where pid=10001
update propus set pid=1000 where pid=1001
update propus set pid=1001 where pname='akathir'
update propus set pphone=pphone+100 where pname='kathir'//particular column
update propus set pphone=pphone+100 //modify all column 
=====================delete=====================================
using delete we can remove one column or more column
select * from propus	
delete from propus where pid=1003
delete  from propus where pphone=1334
delete from propus
insert into propus values(1000,'kathir','chennai',1234,2000)
insert into propus values(1001,'akathir','schennai',1234,5000)
insert into propus values(1002,'bkathir','dchennai',1234,2002)
insert into propus values(1003,'ckathir','cchennai',1234,3495)	
=======================extra  statement========================
1.trancate
2.order clause
3.drop table
4.eleminate dupilcate
5.select into
trancate remove all row from table----
truncate table propus
drop remove table from database
drop table propus
delete remove one row /many row from table
select * from propus order by pname asc // no 'where' condition
select * from propus
select distinct pphone  from propus
select all pphone from propus
select pid,pname into globaltable from propus
select * from globaltable
select * from into newtable from oldtable
select all/disticnt * from table









