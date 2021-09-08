CREATE TABLE T_APPOINTMENTS
(
    id      serial,
    user_id integer,
    date    timestamp,
    PRIMARY KEY (id)
);