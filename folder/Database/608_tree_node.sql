/* Write your PL/SQL query statement below */
SELECT Id,
    CASE
        WHEN  P_ID IS NULL THEN 'Root'
        WHEN  ID IN (SELECT P_ID FROM TREE WHERE P_ID IS NOT NULL) THEN 'Inner'
        ELSE 'Leaf'
    END AS Type
FROM TREE
ORDER BY ID;
