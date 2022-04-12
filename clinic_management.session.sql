
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
    appointment_doctor_id INTEGER NOT NULL,
    appointment_patient_id INTEGER NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    appointment_status VARCHAR(20) NOT NULL,
    FOREIGN KEY (appointment_doctor_id) REFERENCES doctor(doctor_id),
    FOREIGN KEY (appointment_patient_id) REFERENCES patient(patient_id)
);
