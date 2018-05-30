select * from propus
=========================function=================================
1.groupby--calculate summary for group of rows in a column
select pname, max(salary) from propus group by pname
select pname, min(salary) from propus group by pname
select min(salary) from propus
select * from propus
2.having-- determine which groups include in final result 
select pphone, min(salary) from propus group by  pphone having count(*)>3
3.compute--  

4.computeby
