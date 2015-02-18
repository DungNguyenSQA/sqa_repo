select * from products where productId in (1001,1007);
select * from products where productId in (1001,1006) and productCode='PEN';
select * from products;
select * from suppliers;


select * from products p left outer join suppliers s on p.supplierID = s.supplierID;
select * from products p right outer join suppliers s on p.supplierID = s.supplierID;
select * from products inner join suppliers;

select * from student_info;
insert into student_info values(1,'Robert',54354);
insert into student_info values(2,'Jack',54325);
insert into student_info values(3,'Jon',43543);
insert into student_info values(4,'David',65364);
insert into student_info values(5,'Paul',74565);


CREATE TABLE customers (
  customer_id int(50) NOT NULL,
  first_name int(50) NOT NULL,
  last_name varchar(50) NOT NULL,
  email varchar(35) NOT NULL,
  phone int(10) NOT NULL,
  PRIMARY KEY (customer_id)
);

insert into customers values('John','Smith','John.Smith@yahoo.com','6262222222');
insert into customers values('Steven','Goldfish','goldfish@fishhere.net','3234554545');
insert into customers values('Paula','Brown','pb@herowndomain.org','4163233232');
insert into customers values('James','Smith','jim@supergig.co.uk','4163238888');
insert into customers values('John','Kane','John.Kane@yahoo.com','42343');

SELECT * FROM Customers WHERE LastName = 'Smith';
SELECT * FROM Customers WHERE LastName <> 'Smith';


CREATE TABLE IF NOT EXISTS products (
	productID    INT UNSIGNED  NOT NULL AUTO_INCREMENT,
    productCode  CHAR(3)       NOT NULL DEFAULT '',
    name         VARCHAR(30)   NOT NULL DEFAULT '',
    quantity     INT UNSIGNED  NOT NULL DEFAULT 0,
    price        DECIMAL(7,2)  NOT NULL DEFAULT 99999.99,
    PRIMARY KEY  (productID)
);


INSERT INTO products VALUES (1001, 'PEN', 'Pen Red', 5000, 1.23);
INSERT INTO products VALUES (1002, 'PEN', 'Pen Blue',  8000, 1.25);
INSERT INTO products VALUES (1003, 'PEN', 'Pen Black', 2000, 1.25);
INSERT INTO products VALUES (1004, 'PEC', 'Pencil 2B', 10000, 0.48);
INSERT INTO products VALUES (1005, 'PEC', 'Pencil 2H', 8000, 0.49);
INSERT INTO products (productCode, name) VALUES ('PEC', 'Pencil HB');

SELECT name, price FROM products WHERE price < 1.0;
SELECT * FROM products WHERE quantity <= 2000;
SELECT name, price FROM products WHERE productCode = 'PEN';
SELECT name, price FROM products WHERE name LIKE 'PENCIL%';
SELECT name, price FROM products WHERE name LIKE 'P__ %';
SELECT * FROM products WHERE quantity >= 5000 AND name LIKE 'Pen %';
SELECT * FROM products WHERE name IN ('Pen Red', 'Pen Black');

#ORDER BY :
SELECT * FROM products WHERE name LIKE 'Pen %' ORDER BY price DESC;
SELECT * FROM products WHERE name LIKE 'Pen %' ORDER BY price DESC, quantity;

#LIMIT
SELECT * FROM products ORDER BY price LIMIT 2;
#AS
SELECT productID AS ID, productCode AS Code, name AS Description, price AS `Unit Price` FROM products;

#distinct
SELECT DISTINCT price AS `Distinct Price` FROM products;

show tables;
drop table customers;
drop table products;
drop table student_info;
drop table suppliers;

#GROUP BY Clause
#The GROUP BY clause allows you to collapse multiple records with a common value into groups. For example,
SELECT * FROM products;
SELECT * FROM products GROUP BY productCode;
SELECT productCode, COUNT(*) FROM products GROUP BY productCode;
SELECT productCode, AVG(quantity) as aver, SUM(quantity), MIN(price) FROM products GROUP BY productCode;
SELECT MAX(price), MIN(price), AVG(price), STD(price), SUM(quantity) FROM products;


#Update:
UPDATE products SET price=0.50 where productID=1005;

#Delete
#delete from prodcuts where <condition>

CREATE TABLE suppliers (
         supplierID  INT UNSIGNED  NOT NULL AUTO_INCREMENT, 
         name        VARCHAR(30)   NOT NULL DEFAULT '', 
         phone       CHAR(8)       NOT NULL DEFAULT '',
         PRIMARY KEY (supplierID)
       );

INSERT INTO suppliers VALUE (501, 'ABC Traders', '88881111'), (502, 'XYZ Company', '88882222'), (503, 'QQ Corp', '88883333');
select * from suppliers;

ALTER TABLE products ADD COLUMN supplierID INT UNSIGNED;
UPDATE products SET supplierID = 501;
UPDATE products SET supplierID = 502 WHERE productID = 1004;

SELECT p.name, price, s.name, p.productId, s.supplierId FROM products p JOIN suppliers s ON p.supplierID = s.supplierID;# WHERE price < 0.6;
select p.*,s.* from suppliers s join products p on s.supplierId=p.supplierId;

INSERT INTO products VALUES (1008, 'PEC', 'Pencil 6B', 7000, 1.33,null);
INSERT INTO suppliers VALUE (504, 'LMN Co.', '54324432');

select * from products;
select * from suppliers;

#give me everything from product table and respective supplier name if it is present
select p.*, s.name, s.phone from products p left outer join suppliers s on p.supplierId=s.supplierId;
select p.*, s.name, s.phone from  suppliers s right outer join products p on p.supplierId=s.supplierId;

#Show me the records where suppliers do not have any products associated with them.
select * from suppliers s left outer join products p on s.supplierId=p.supplierId where p.supplierId is null;
drop table products;


select * from products;
select * from suppliers;

