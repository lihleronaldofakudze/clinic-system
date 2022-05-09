
-- @BLOCK
CREATE DATABASE 902007953_902008707_902008569_902008955_902007968;

-- @BLOCK
CREATE TABLE role (
    role_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    role_title TEXT NOT NULL,
    role_description VARCHAR(255) NOT NULL
);

-- @BLOCK
CREATE TABLE user (
    user_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_role_id INTEGER NOT NULL,
    user_name TEXT NOT NULL,
    user_email VARCHAR(255) NOT NULL,
    user_dob VARCHAR(255) NOT NULL,
    user_address VARCHAR(100) NOT NULL,
    user_username VARCHAR(50) NOT NULL,
    user_password VARCHAR(25) NOT NULL,
    FOREIGN KEY (user_role_id) REFERENCES role(role_id)
);

-- @BLOCK
CREATE TABLE doctor (
    doctor_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    doctor_name TEXT NOT NULL UNIQUE,
    doctor_mobile INTEGER,
    doctor_email VARCHAR(80) NULL,
    doctor_address VARCHAR(80),
    doctor_password VARCHAR(80),
    doctor_username VARCHAR(80)
);

-- @BLOCK
CREATE TABLE nurse (
    nurse_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nurse_name TEXT NOT NULL UNIQUE,
    nurse_mobile INTEGER,
    nurse_email VARCHAR(80) NULL,
    nurse_address VARCHAR(80),
    nurse_password VARCHAR(80),
    nurse_username VARCHAR(80)
);

-- @BLOCK
CREATE TABLE patient (
    patient_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    patient_name TEXT NOT NULL UNIQUE,
    patient_mobile INTEGER,
    patient_email VARCHAR(80) NULL,
    patient_address VARCHAR(80),
    patient_password VARCHAR(80),
    patient_username VARCHAR(80)
);

-- @BLOCK
CREATE TABLE appointment (
    appointment_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    appointment_number INTEGER NOT NULL,
    appointment_type VARCHAR(20) NOT NULL,
    appointment_description VARCHAR(20) NOT NULL,
    appointment_date VARCHAR(20) NOT NULL,
    appointment_doctor_id INTEGER NOT NULL,
    FOREIGN KEY (appointment_doctor_id) REFERENCES doctor(doctor_id)
);


CREATE TABLE clinic (
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    doctor_id INTEGER NOT NULL,
    clinic_type VARCHAR(255) NOT NULL,
    clinic_description VARCHAR(255) NOT NULL,
    clinic_name VARCHAR(255) NOT NULL,
    clinic_place VARCHAR(255) NOT NULL,
    clinic_address VARCHAR(255) NOT NULL,
    FOREIGN KEY (doctor_id) REFERENCES doctor(doctor_id)
);

CREATE TABLE test (
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    test_name VARCHAR(255) NOT NULL,
    test_type VARCHAR(255) NOT NULL,
    test_description VARCHAR(255) NOT NULL,
    patient_id INTEGER NOT NULL,
    test_cost VARCHAR(255) NOT NULL,
    test_report VARCHAR(255) NOT NULL,
    FOREIGN KEY (patient_id) REFERENCES patient(patient_id)
);


-- INNER JOIN
SELECT *
FROM appointment
INNER JOIN doctor
ON appointment.appointment_doctor_id = doctor.doctor_id;

-- Views
CREATE VIEW specific_owner_id AS
SELECT car_number, type, category
FROM cars
WHERE owner_id = 24;


-- Store Procedure
DELIMITER $$

CREATE PROCEDURE GetAllRoles()
BEGIN
	SELECT *  FROM roles;
END $$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE GetAllPatients()
BEGIN
	SELECT *  FROM patient;
END $$

DELIMITER ;


DELIMITER $$

CREATE PROCEDURE GetAllAppointments()
BEGIN
	SELECT *  FROM appointment;
END $$

DELIMITER ;
