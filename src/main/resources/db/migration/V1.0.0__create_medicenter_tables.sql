CREATE TABLE doctor
(
    id             BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre         VARCHAR(255),
    apellido       VARCHAR(255),
    especialidad   VARCHAR(255),
    medical_center VARCHAR(255),
    email          VARCHAR(255) UNIQUE
);

CREATE TABLE paciente
(
    id             BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre         VARCHAR(255),
    apellido       VARCHAR(255),
    identificacion BIGINT UNIQUE,
    edad           INTEGER,
    telefono       VARCHAR(255)
);

CREATE TABLE citaMedica
(
    id                     BIGINT PRIMARY KEY AUTO_INCREMENT,
    paciente_identificacion BIGINT,
    especialidad             VARCHAR(255),
    doctor_id              BIGINT,
    paciente_id             BIGINT,
    FOREIGN KEY (doctor_id) REFERENCES doctor (id),
    FOREIGN KEY (paciente_id) REFERENCES paciente (id)
);
