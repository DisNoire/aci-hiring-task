insert into billers (id, name) values (1, 'Apple');
insert into billers (id, name) values (2, 'Google');

insert into customers (id, first_name, last_name, address, date_of_birth) values (1, 'Ainur', 'Khusnutdinov', 'Green, 11', '1998-02-28 16:10:32.9');
insert into customers (id, first_name, last_name, address, date_of_birth) values (2, 'Bulat', 'Muzipov', 'Molodezhnaya, 37', '1998-03-06 13:22:45.1');

insert into payments (id, account, amount, date, biller_id, customer_id) values (1, '12345', 42.1, '2018-05-31 21:00:00.0', 1, 2);
insert into payments (id, account, amount, date, biller_id, customer_id) values (2, '54321', 44.1, '2018-05-31 20:00:00.0', 2, 1);
insert into payments (id, account, amount, date, biller_id, customer_id) values (3, '23415', 89.3, '2018-05-31 19:00:00.0', 2, 1);
insert into payments (id, account, amount, date, biller_id, customer_id) values (4, '43115', 42.1, '2018-05-31 22:00:00.0', 1, 2);


