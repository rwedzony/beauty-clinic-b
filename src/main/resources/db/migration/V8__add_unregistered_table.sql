CREATE TABLE T_UNREGISTEREDUSERS
(
    id           serial,
    first_name   varchar(255),
    last_name    varchar(255),
    phone_number varchar(20),
    email        varchar(255),
    PRIMARY KEY (id)
);