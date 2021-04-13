CREATE DATABASE spring_demo;

CREATE USER demo_user IDENTIFIED WITH double_sha1_password BY 'demo_user';

GRANT ALL PRIVILEGES ON spring_demo.* TO demo_user;

CREATE TABLE spring_demo.items
(
    item_id String,
    timestamp DateTime64,
    data String
)
ENGINE = MergeTree()
PRIMARY KEY (item_id, timestamp);
