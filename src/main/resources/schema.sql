drop table IF  EXISTS product; 
drop table category;
CREATE TABLE IF NOT EXISTS category (
    categoryid BIGINT  PRIMARY KEY,
    categoryname VARCHAR(255) NOT NULL
);
CREATE TABLE IF NOT EXISTS product (
    id BIGINT  PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    brand VARCHAR(255),
    price DOUBLE NOT NULL,
    imageurl VARCHAR(255),
    rating DOUBLE NOT NULL,
    category_id BIGINT NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(categoryid)
);
