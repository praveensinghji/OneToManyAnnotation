Use praveen;
CREATE TABLE DEPARTMENT (
id INT auto_increment not null primary key,
`name` varchar(255)
);
    
CREATE TABLE Student (
id int auto_increment not null primary key,
`name` varchar(255),
department_id int,
foreign key (department_id)
references DEPARTMENT(id)
);