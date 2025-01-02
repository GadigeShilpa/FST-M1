REM   Script: Activity 6-7-8
REM   Orders table Activivties

CREATE TABLE salesman (salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

DESCRIBE salesman


CREATE TABLE salesman (salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

DESCRIBE salesman


CREATE TABLE salesman1 (salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

DESCRIBE salesman1


CREATE TABLE salesman1 (salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

DESCRIBE salesman1


CREATE TABLE salesman (salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

DESCRIBE salesman


DESCRIBE salesman


SELECT * FROM salesman;

INSERT ALL  
    INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

DESCRIBE salesman


SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name= 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

INSERT ALL  
     INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
    INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT ALL  
     INTO salesman VALUES (5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES (5001, 'James Hoog', 'New York', 15, 100);

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

CREATE TABLE orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT * FROM orders;

SELECT DISTINCT salesman_id from orders;

SELECT order_no, order_date FROM orders ORDER BY order_date;

SELECT order_no, purchase_amount FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500;

SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

SELECT * FROM orders WHERE purchase_amount < 500 ORDER BY purchanse_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500 ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500 ORDER BY purchase_amount ASC;

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT * FROM orders;

SELECT DISTINCT salesman_id from orders;

SELECT order_no, order_date FROM orders ORDER BY order_date;

SELECT order_no, purchase_amount FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500;

SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

SELECT * FROM orders;

select SUM(purchase_amount) AS "Total sum" from orders;

select AVG(purchase_amount) AS "Average" from orders;

select MAX(purchase_amount) AS "Maximum" from orders;

select MIN(purchase_amount) AS "Minumum" from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

SELECT * FROM orders;

SELECT SUM(purchase_amount) AS "Total sum" FROM orders;

SELECT AVG(purchase_amount) AS "Average" FROM orders;

SELECT MAX(purchase_amount) AS "Maximum" FROM orders;

SELECT MIN(purchase_amount) AS "Minumum" FROM orders;

SELECT COUNT(DISTINCT salesman_id) AS "Total count" FROM orders;

SELECT customer_id, MAX(purchase_amount) AS MAX_Purchase FROM orders GROUP BY customer_id;

SELECT * FROM orders;

 SELECT salesman_id, MAX(purchase_amount) AS MAX_Purchase FROM orders TO_DATE('2012/08/17','YYYY/MM/DD') GROUP BY salesman_id;

SELECT salesman_id, MAX(purchase_amount) AS MAX_Purchase FROM orders WHERE order_date=TO_DATE('2012/08/17','YYYY/MM/DD') GROUP BY salesman_id;

SELECT salesman_id, MAX(purchase_amount) AS MAX_Purchase17Aug FROM orders WHERE order_date=TO_DATE('2012/08/17','YYYY/MM/DD') GROUP BY salesman_id;

SELECT customer_id,order_date, MAX(purchase_amount) AS MAX_Purchase FROM orders  
GROUP BY customer_id,order_date  
HAVING MAX(purchase_amount) IN (2030,3450,5760,6000);

SELECT salesman_id, MAX(purchase_amount) AS MAX_Purchase17Aug12 FROM orders  
WHERE order_date=TO_DATE('2012/08/17','YYYY/MM/DD')  
GROUP BY salesman_id;

SELECT salesman_id,order_date, MAX(purchase_amount) AS MAX_Purchase17Aug12 FROM orders  
WHERE order_date=TO_DATE('2012/08/17','YYYY/MM/DD')  
GROUP BY salesman_id;

SELECT salesman_id,MAX(purchase_amount) AS MAX_Purchase17Aug12 FROM orders  
WHERE order_date=TO_DATE('2012/08/17','YYYY/MM/DD')  
GROUP BY salesman_id;

SELECT customer_id,order_date, MAX(purchase_amount) AS MAX_Purchase FROM orders  
GROUP BY customer_id,order_date  
HAVING MAX(purchase_amount) IN (2030,3450,5760,6000);

