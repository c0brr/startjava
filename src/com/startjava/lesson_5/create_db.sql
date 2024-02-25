\connect robots

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
id         SERIAL PRIMARY KEY,
model_name TEXT,
mark       CHAR(6),
height     REAL,
weight     INTEGER,
status     TEXT,
origin     TEXT,
launch     DATE,
kaiju_kill INTEGER
);

\include_relative init_db.sql

\include_relative queries.sql