INSERT INTO clients (first_name, last_name, mailing_address, city, state, zip_code, phone, email) VALUES('SARAH', 'JONES', '1111 MAIN STREET', 'ALBUQUERQUE','NEW MEXICO','87123', '505.205.5169','JONES.SARAH@XYZ.COM');
INSERT INTO clients (first_name, last_name, mailing_address, city, state, zip_code, phone, email) VALUES('John', 'Smith', '112 CENTRAL AVENUE', 'ALBUQUERQUE','NEW MEXICO','87123', '505.757.2525','SMITH.JOHN@XYZ.COM');
INSERT INTO clients (first_name, last_name, mailing_address, city, state, zip_code, phone, email) VALUES('MAXINE', 'STEVENS', '1510 MAIN STREET', 'ALBUQUERQUE','NEW MEXICO','87123', '505.655.7482','STEVENS.MAXINE@XYZ.COM');

INSERT INTO PETS (client_id, pet_name, pet_species, pet_breed, pet_age, pet_gender, pet_fixed) VALUES(1, 'MAX', 'DOG', 'DOBERMAN', 4, 'MALE', TRUE); 
INSERT INTO PETS (client_id, pet_name, pet_species, pet_breed, pet_age, pet_gender, pet_fixed) VALUES(1, 'BABY', 'CAT', 'AMERICAN LONGHAIR', 8, 'FEMALE', TRUE); 
INSERT INTO PETS (client_id, pet_name, pet_species, pet_breed, pet_age, pet_gender, pet_fixed) VALUES(2, 'SONNY', 'DOG', 'MIXED BREED', 1, 'MALE', TRUE); 
INSERT INTO PETS (client_id, pet_name, pet_species, pet_breed, pet_age, pet_gender, pet_fixed) VALUES(3, 'BELLA', 'DOG', 'PYRENES', 3, 'FEMALE', TRUE);

INSERT INTO BILLING (client_id, pet_id, balance_due) VALUES (1, 2, 300.57); 
INSERT INTO BILLING (client_id, pet_id, balance_due) VALUES (1, 1, 00.00); 
INSERT INTO BILLING (client_id, pet_id, balance_due) VALUES (2, 3, 50.57); 
INSERT INTO BILLING (client_id, pet_id, balance_due) VALUES (3, 4, 100.17); 

INSERT INTO APPOINTMENTS (pet_id, scheduled_appt) VALUES (1, '2022-01-22 03:45:00');
INSERT INTO APPOINTMENTS (pet_id, scheduled_appt) VALUES (2, '2021-12-28 08:45:00');
INSERT INTO APPOINTMENTS (pet_id, scheduled_appt) VALUES (3, '2022-02-22 10:30:00');
INSERT INTO APPOINTMENTS (pet_id, scheduled_appt) VALUES (4, '2021-11-29 11:45:00');

INSERT INTO SERVICES (pet_id, appt_type, description) VALUES (1, 'exam', 'well pet exam');
INSERT INTO SERVICES (pet_id, appt_type, description) VALUES (2, 'surgery', 'knee surgery');
INSERT INTO SERVICES (pet_id, appt_type, description) VALUES (3, 'exam', 'asthma exam');
INSERT INTO SERVICES (pet_id, appt_type, description) VALUES (4, 'vaccines', 'yearly vaccines');

INSERT INTO appointment_services (appointment_id, service_id) VALUES (1, 1);
INSERT INTO appointment_services (appointment_id, service_id) VALUES (2, 2);
INSERT INTO appointment_services (appointment_id, service_id) VALUES (3, 3);
INSERT INTO appointment_services (appointment_id, service_id) VALUES (4, 4);












