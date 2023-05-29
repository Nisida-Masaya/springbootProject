create table issues (
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
summary VARCHAR(256) NOT NULl,
description VARCHAR(256) NOT NULl
);

create table users (
username VARCHAR(256) NOT NULl PRIMARY KEY,
password VARCHAR(256) NOT NULl
);

