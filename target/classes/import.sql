-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)



INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('123456789','Mary','Lyraki', 'Mlyr', 'Kifisias 15', 'mlyr@email.com', '12345678', 'Toyota', 'ABC-1234', 'Admin');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('987654321','Emmanouil','Fragkakis', 'Emfrag', 'Kifisias 17', 'emmfrag@email.com', '1234asdc', 'Nissan', 'ABD-1854', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('582963471','Eleni','Papadopoulou', 'Elenp',  'Kifisias 19', 'elpap@email.com', '1234gdhf', 'Audi', 'ABC-1984', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('753216489','Giannis','Ioannou', 'Ggi', 'Kifisias 21', 'iong@email.com', '1d23vd4', 'BMW', 'AGD-1234', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('545689203','Vasilis','Stratis', 'Vasst','Kifisias 23', 'vasstr@email.com', '1as2fds34', 'Citroen', 'ASC-7834', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('785198263','Christos','Mpekris', 'Chmpe', 'Kifisias 25', 'chmpek@email.com', '143rfd234', 'Toyota', 'ACD-6534', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('481237597','Spyros','Diakos', 'Spykos', 'Kifisias 125', 'spdiak@email.com', '1dsfcm234', 'Suzuki', 'MBC-8734', 'Owner');
INSERT INTO OWNER (taxRegNum, firstName, lastName, userName, address, email, password, carBrand, carPlate, userType) VALUES ('485219637','Ema','Papadaki', 'Empap','Kifisias 157', 'empap@email.com', '12gdh5634', 'Mazda', 'FBD-4574', 'Admin');

INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ladia','2018-11-26 15:15:00','2018-12-25 15:15:00','ToDo','Small',88.50,'ABC-1234',1);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('lastixa','2018-11-27 15:15:00','2018-12-23 15:15:00','ToDo','Small',108.00,'ABD-1854',2);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('takakia','2018-11-28 15:15:00','2018-12-22 15:15:00','ToDo','Small',50.90,'ABC-1984',3);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('ftero','2018-11-29 15:15:00','2018-12-21 15:15:00','ToDo','Small',65.00,'AGD-1234',4);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('diskos','2018-11-29 15:15:00','2018-12-20 15:15:00','ToDo','Small',120.00,'ASC-7834',5);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('frena','2018-11-30 15:15:00','2018-12-15 15:15:00','Ready','Small',154.00,'ACD-6534',6);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('timoni','2018-11-29 15:15:00','2018-12-16 15:15:00','Ready','Small',25.00,'MBC-8734',7);
INSERT INTO Repairs (description,registrationDayOfRepair, finishDayOfRepair,repairStatus,repairType,serviceCost,plateNumber,ownerId) VALUES ('saloni','2018-11-28 15:15:00','2018-12-17 15:15:00','Ready','Small',215.00,'FBD-4574',8);


