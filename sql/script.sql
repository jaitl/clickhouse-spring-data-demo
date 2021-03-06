CREATE DATABASE spring_demo;

CREATE TABLE spring_demo.items
(
    item_id String,
    timestamp DateTime64,
    data String,
    list Array(String)
)
ENGINE = MergeTree()
PRIMARY KEY (item_id);
