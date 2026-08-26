# Write your MySQL query statement below
SELECT email AS Email FROM Person
Group By email
HAVING COUNT(email)>1;