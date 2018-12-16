-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)

--INSERT INTO USER (id, firstname, lastname, email, username, password, role) VALUES ('123', 'John', 'Doe', 'john@mail.com', 'johnD', 'pass1234', 'ROLE_USER');
--INSERT INTO USER (id, firstname, lastname, email, username, password, role) VALUES ('124', 'Jane', 'Doe', 'jane@mail.com', 'janeD', 'pass1234', 'ROLE_ADMIN');

INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('123456789','Papadopoulos','George', 'Geopap', 'Kifisias 15', 'gpap@email.com', '1234', 'Toyota', 'ABC-1234', 'Admin');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('223456789','Papadopoulos','Giannis', 'Johnyp', 'Kifisias 17', 'gianpap@email.com', '1234', 'Nissan', 'ABD-1234', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('123456789','Papadopoulos','Antonis', 'Ant',  'Kifisias 19', 'apap@email.com', '1234', 'Audi', 'ABC-1984', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('223456789','Papadopoulos','Manos', 'mpap', 'Kifisias 21', 'mpap@email.com', '1234', 'BMW', 'AGD-1234', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('123456789','Papadopoulou','Eleni', 'epap','Kifisias 23', 'epap@email.com', '1234', 'Toyota', 'ASC-7834', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('223456789','Papadopoulos','Charis', 'chpap', 'Kifisias 25', 'chpap@email.com', '1234', 'Toyota', 'ACD-6534', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('123456789','Papadopoulos','Leonidas', 'leop', 'Kifisias 125', 'lpap@email.com', '1234', 'Toyota', 'MBC-8734', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('223456789','Papadopoulos','Vasilis', 'vpap','Kifisias 157', 'vpap@email.com', '1234', 'Toyota', 'FBD-4574', 'Owner');

INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-26 15:15:00','2018-12-25 15:15:00','ToDo','Small',88.45,'KYX-8888',1);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-27 15:15:00','2018-12-23 15:15:00','ToDo','Small',88.45,'KYX-8888',2);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-28 15:15:00','2018-12-22 15:15:00','ToDo','Small',88.45,'KYX-8888',2);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-29 15:15:00','2018-12-21 15:15:00','ToDo','Small',88.45,'KYX-8888',4);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-29 15:15:00','2018-12-20 15:15:00','ToDo','Small',88.45,'KYX-8888',5);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-30 15:15:00','2018-12-15 15:15:00','ToDo','Small',88.45,'KYX-8888',5);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-29 15:15:00','2018-12-16 15:15:00','ToDo','Small',88.45,'KYX-8888',6);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-28 15:15:00','2018-12-17 15:15:00','ToDo','Small',88.45,'KYX-8888',3);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-27 15:15:00','2018-12-18 15:15:00','ToDo','Small',88.45,'KYX-8888',1);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-26 15:15:00','2018-12-19 15:15:00','ToDo','Small',88.45,'KYX-8888',1);

