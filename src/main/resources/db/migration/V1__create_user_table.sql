
CREATE TABLE APPUSER
(
    id serial,
    first_name varchar(255),
    last_name  varchar(255),
    phoneNumber  varchar(255),
    address  varchar(255),
    city  varchar(255),
    postcode  varchar(255),
    email  varchar(255),
    password varchar(255),
    PRIMARY KEY(id)
)