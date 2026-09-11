# Write your MySQL query statement below
select Email from Person
Group by email
having count(email)>1;
