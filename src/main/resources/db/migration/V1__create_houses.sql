CREATE TABLE houses (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  price INTEGER NOT NULL,
  square_footage INTEGER,
  street_address VARCHAR(255) NOT NULL,
  city VARCHAR(255) NOT NULL,
  state VARCHAR(2) NOT NULL,
  postal_code VARCHAR(255) NOT NULL,
  description TEXT
);