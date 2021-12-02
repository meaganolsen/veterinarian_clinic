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

INSERT INTO APPOINTMENTS (pet_id, scheduled_appt,appt_type) VALUES (1, 'JANUARY 15, 2022 3:45PM','NAIL TRIM');
INSERT INTO APPOINTMENTS (pet_id, scheduled_appt,appt_type) VALUES (2, 'JANUARY 15, 2022 4:00PM','EXAM');
INSERT INTO APPOINTMENTS (pet_id, scheduled_appt,appt_type) VALUES (3, 'DECEMBER 11, 2021 3:00PM','VACCINES');
INSERT INTO APPOINTMENTS (pet_id, scheduled_appt,appt_type) VALUES (4, 'NOVEMBER 20, 2021 3:45PM','EXAM');













