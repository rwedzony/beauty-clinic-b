CREATE TABLE T_REGISTERED_USER
(
    REGISTERED_USER_ID serial,
    FIRST_NAME varchar(255),
    LAST_NAME  varchar(255),
    PHONE_NUMBER  varchar(20),
    ADDRESS  varchar(255),
    CITY  varchar(255),
    POSTCODE  varchar(10),
    EMAIL  varchar(255),
    PASSWORD varchar(255),
    PRIMARY KEY(id)
);