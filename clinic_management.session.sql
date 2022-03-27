-- @BLOCK
CREATE TABLE role (
    role_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    role_title TEXT NOT NULL,
    role_description VARCHAR(255) NOT NULL
);

-- @BLOCK
INSERT INTO role (role_id, role_title, role_description)
VALUES (
    0,
    'Administator',
    'Has All Access to All Functionalities'
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
INSERT INTO user (
    user_id,
    user_role_id,
    user_name,
    user_email,
    user_dob,
    user_address,
    user_username,
    user_password
  )
VALUES (
    0,
    1,
    'Lihle',
    'cloutdevelopers@gmail.com',
    '01/01/2020',
    'Mbabane',
    'clout',
    '0123456789'
  );