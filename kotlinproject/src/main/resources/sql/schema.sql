CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE IF NOT EXISTS messages (
    id                     VARCHAR(60)  DEFAULT uuid_generate_v1() PRIMARY KEY,
    text                   VARCHAR      NOT NULL
);