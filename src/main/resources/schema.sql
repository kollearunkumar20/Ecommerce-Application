DROP TABLE IF EXISTS users, product, category;

CREATE TABLE IF NOT EXISTS users (
    username VARCHAR(255) NOT NULL PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    issubscribed BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS category (
    categoryid BIGINT PRIMARY KEY,
    categoryname VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS product (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    brand VARCHAR(255),
    price DOUBLE PRECISION NOT NULL,
    imageurl VARCHAR(255),
    rating DOUBLE PRECISION NOT NULL,
    description VARCHAR(255),
    category_id BIGINT NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(categoryid)
);
