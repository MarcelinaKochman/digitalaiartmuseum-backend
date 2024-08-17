CREATE TABLE image (
  id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  creation_date TIMESTAMP without time zone DEFAULT now(),
  image_url VARCHAR(2083) NOT NULL,
  image_prompt VARCHAR(20),
  sref_number INTEGER
);