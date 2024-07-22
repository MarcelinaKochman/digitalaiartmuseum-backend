CREATE TABLE page_visit (
  id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  creation_date TIMESTAMP without time zone DEFAULT now()
);