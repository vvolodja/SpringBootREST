DROP SCHEMA IF EXISTS postgres;

CREATE SCHEMA postgres;

DROP TABLE IF EXISTS contacts;

CREATE TABLE contacts (
  id SERIAL PRIMARY KEY,
  name varchar(255) default NULL
);




