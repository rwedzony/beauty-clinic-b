

--initialization

DROP TABLE IF EXISTS offer CASCADE;
DROP TABLE IF EXISTS spec_connection CASCADE;
DROP TABLE IF EXISTS medical_record CASCADE;
DROP TABLE IF EXISTS reservation CASCADE;
DROP TABLE IF EXISTS department CASCADE;
DROP TABLE IF EXISTS patient CASCADE;
DROP TABLE IF EXISTS doctor CASCADE;
DROP TABLE IF EXISTS role CASCADE;
DROP TABLE IF EXISTS specialization CASCADE;



--Patient Table
CREATE TABLE patient
(
    id SERIAL,
    first_name varchar(255)    NOT NULL,
    last_name  varchar(255)    NOT NULL,
    email  varchar(255)    NOT NULL,
    password varchar(255) NOT NULL,
    pesel varchar(11) NOT NULL,
    entry_date date NOT NULL DEFAULT now(),

    PRIMARY KEY (id)
);


--Role Table
CREATE TABLE role
(
    id SERIAL,
    role_name varchar(255),

    PRIMARY KEY(id)

);

--Specialization Table

CREATE TABLE specialization
(
    id SERIAL,
    name varchar(255),

    PRIMARY KEY(id)
);

--Department Table

CREATE TABLE department
(
    id   SERIAL,
    name varchar(255) NOT NULL,

    PRIMARY KEY (id)
);


--Doctor Table

CREATE TABLE doctor
(
    id SERIAL,
    first_name varchar(255)    NOT NULL,
    last_name  varchar(255)    NOT NULL,
    email  varchar(255)    NOT NULL,
    password varchar(255) NOT NULL,
    id_role integer,
    id_department integer,
    entry_date date NOT NULL DEFAULT now(),

    PRIMARY KEY(id),
    CONSTRAINT fk_role
        FOREIGN KEY(id_role) REFERENCES role(id)
            ON DELETE SET NULL,

    CONSTRAINT fk_department
        FOREIGN KEY(id_department) REFERENCES department(id)
            ON DELETE SET NULL

);


--Medical Record Table

CREATE TABLE medical_record
(
    id SERIAL,
    id_patient integer,
    id_doctor integer,
    id_department integer,
    disease varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    medicines  varchar(255) NOT NULL,
    entry_date date NOT NULL DEFAULT now(),

    PRIMARY KEY(id),

    CONSTRAINT fk_patient
        FOREIGN KEY(id_patient) REFERENCES patient(id)
            ON DELETE SET NULL,

    CONSTRAINT fk_doctor
        FOREIGN KEY(id_doctor) REFERENCES doctor(id)
            ON DELETE SET NULL,

    CONSTRAINT fk_department
        FOREIGN KEY(id_department) REFERENCES department(id)
            ON DELETE SET NULL
);

--Reservation Table

CREATE TABLE reservation
(
    id SERIAL,
    id_patient integer,
    id_doctor integer,
    start_date timestamp NOT NULL,
    end_date timestamp NOT NULL,
    entry_date date NOT NULL DEFAULT now(),

    PRIMARY KEY(id),

    CONSTRAINT fk_patient
        FOREIGN KEY(id_patient) REFERENCES patient(id)
            ON DELETE SET NULL,

    CONSTRAINT fk_doctor
        FOREIGN KEY(id_doctor) REFERENCES doctor(id)
            ON DELETE SET NULL

);



--Spec Connection Table
CREATE TABLE spec_connection
(
    id SERIAL,
    id_specialization integer,
    id_doctor integer,

    PRIMARY KEY(id),

    CONSTRAINT fk_doctor
        FOREIGN KEY(id_doctor) REFERENCES doctor(id)
            ON DELETE SET NULL,

    CONSTRAINT fk_specialization
        FOREIGN KEY(id_specialization) REFERENCES specialization(id)
            ON DELETE SET NULL
);

--offer table
CREATE TABLE offer
(
    id SERIAL,
    id_department integer,
    offer_name varchar (255) NOT NULL,
    price REAL NOT NULL,

    PRIMARY KEY(id),

    CONSTRAINT fk_department
        FOREIGN KEY(id_department) REFERENCES department(id)
            ON DELETE SET NULL

);

-- entry inserts to database:


--roles
insert into role(role_name) values ('ROLE_DOCTOR'),
                                    ('ROLE_ADMIN');

--specializations
insert into specialization(name) values ('plastic surgeon'),
                                   ('anesthesiologist'),
                                   ('surgeon'),
                                   ('neurologist');

--departments
insert into department(name) values ('Plastic Surgery');


--patients
insert into patient(first_name, last_name, email, password, pesel) values('Jan',
                                                                          'Nowak',
                                                                          'jnowak@wp.pl',
                                                                          'jnowak',
                                                                          '86061633515'),

                                                                          ('Marzena',
                                                                          'Kowalska',
                                                                          'mkowalska@wp.pl',
                                                                          'mkowalska',
                                                                          '96081097325');
--doctors
insert into doctor(first_name, last_name, email, password, id_role,id_department) values('Zenon',
                                                                          'Chytry',
                                                                          'zchytry@klinika.pl',
                                                                          'zchytry',
                                                                          1,
                                                                          1
                                                                          ),

                                                                          ('Marina',
                                                                          'Chwastek',
                                                                          'mchwastek@klinika.pl',
                                                                          'mchwastek',
                                                                          2,
                                                                          1);

--spec_connections
insert into spec_connection(id_doctor,id_specialization) values (1,1),
                                        (1,2),
                                        (2,3);


--offer
insert into offer(id_department, offer_name, price) values (1,'breast enlargement',1234.4);



--reservation
insert into reservation(id_patient, id_doctor, start_date, end_date,entry_date) values (1,1,now(),now(),now()),
                                                                                       (2,2,now(),now(),now());

--medical record
insert into medical_record(id_patient, id_doctor, id_department, disease, description, medicines) values (
                                                                                                         1,
                                                                                                         2,
                                                                                                         1,
                                                                                                         'small breast xD',
                                                                                                         'need to be enlarge',
                                                                                                         'massage'
                                                                                                          );


