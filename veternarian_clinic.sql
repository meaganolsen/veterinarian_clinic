create database if not exists veternarian_clinic;

use veternarian_clinic;

DROP TABLE IF EXISTS services;
DROP TABLE IF EXISTS appointments;
DROP TABLE IF EXISTS billing;
DROP TABLE IF EXISTS pets;
DROP TABLE IF EXISTS clients;


CREATE TABLE clients (
  id int(40) NOT null auto_increment,
  pet_id int(40) NOT NULL,
  first_name varchar(40) NOT NULL,
  last_name varchar(45) NOT NULL, 
  mailing_address varchar(45) NOT NULL,
  city varchar(20) NOT NULL,
  state varchar (10) NOT NULL,
  zip_code int(10) NOT NULL,
  phone varchar(20) NOT NULL,
  email varchar(40) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (pet_id) references pets
);

CREATE TABLE pets (
  id int(40) NOT NULL AUTO_INCREMENT,
  client_id int(40) NOT NULL,
  pet_name varchar(40) NOT NULL,
  pet_species varchar(40) NOT NULL,
  pet_breed varchar(40) NOT NULL,
  pet_age int(10) NOT NULL,
  pet_gender varchar(10) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (client_id) references clients
);

CREATE TABLE billing (
  client_id int(40) NOT NULL,
  pet_id int(40) NOT NULL,
  balance_due decimal(10) NOT NULL,
  PRIMARY KEY (client_id),
  PRIMARY KEY (pet_id)
 
);

CREATE TABLE appointments (
  pet_id int(40) NOT NULL,
  schedule_appt date NOT NULL,
  delete_appt date NOT NULL,
  change_appt date NOT NULL,
  made_dateTime TIMESTAMP NOT NULL,
  PRIMARY KEY (pet_id)
);

CREATE TABLE services (
  pet_id int(40)NOT NULL,
  surgeries varchar(50),
  vaccines varchar(40) NOT NULL,
  PRIMARY KEY (pet_id)
  );
