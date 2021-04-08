
CREATE TABLE APPUSER
(
    id serial,
    first_name varchar(255),
    last_name  varchar(255),
    phone_number  varchar(20),
    address  varchar(255),
    city  varchar(255),
    postcode  varchar(10),
    email  varchar(255),
    password varchar(255),
    PRIMARY KEY(id)
);