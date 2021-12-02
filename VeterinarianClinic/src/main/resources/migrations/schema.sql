create database if not exists veterinarian_clinic;

use veterinarian_clinic;

DROP Table IF exists appointment_services;
DROP TABLE IF EXISTS services;
DROP TABLE IF EXISTS appointments;
DROP TABLE IF EXISTS billing;
DROP TABLE IF EXISTS pets;
DROP TABLE IF EXISTS clients;


CREATE TABLE clients (
  id int(40) NOT null auto_increment,
  first_name varchar(40) NOT NULL,
  last_name varchar(45) NOT NULL, 
  mailing_address varchar(45) NOT NULL,
  city varchar(20) NOT NULL,
  state varchar (10) NOT NULL,
  zip_code int(10) NOT NULL,
  phone varchar(20) NOT NULL,
  email varchar(40) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE pets (
  id int(40) NOT NULL AUTO_INCREMENT,
  client_id int(40) NOT NULL,
  pet_name varchar(40) NOT NULL,
  pet_species varchar(40) NOT NULL,
  pet_breed varchar(40) NOT NULL,
  pet_age int(10) NOT NULL,
  pet_gender varchar(10) NOT NULL,
  pet_fixed boolean NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (client_id) references clients(id)
);

CREATE TABLE billing (
  appointment_id int(40) NOT NULL auto_increment,
  client_id int(40) NOT NULL,
  pet_id int(40) NOT NULL,
  balance_due decimal(10) NOT NULL,
  PRIMARY KEY (appointment_id),
  FOREIGN KEY (pet_id) references pets(id),
  FOREIGN KEY  (client_id) references clients(id)
 
);

CREATE TABLE appointments (
  id int(40) NOT NULL auto_increment,
  pet_id int(40) NOT NULL,
  scheduled_appt DATETIME NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY(pet_id) references pets(id)
);

CREATE TABLE services (
  id int(40) NOT NULL auto_increment,
  pet_id int(40)NOT NULL,
  appt_type ENUM ('EXAM','SURGERY','VACCINES', 'NAIL TRIM'),
  description varchar(40) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (pet_id) references pets(id)
  );

CREATE TABLE appointment_services (
  appointment_id int(40) NOT NULL,
  service_id int(40) NOT NULL,
  FOREIGN KEY (appointments_id) references appointments,
  FOREIGN Key (service_id) references services(id)
  );

  
 
  
  
  
  