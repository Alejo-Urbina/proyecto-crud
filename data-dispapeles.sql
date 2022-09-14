CREATE TABLE  ClIENT (
  "document" NUMERIC(20) NOT NULL,
  "type_document" VARCHAR(40) NULL,
  "name" VARCHAR(40) NULL,
  "last_name" VARCHAR(100) NULL,
  "ago" NUMERIC NULL,
  "phone" NUMERIC NULL,
  "address" VARCHAR(80) NULL,
  PRIMARY KEY ("document"));
  
  INSERT INTO client VALUES (50102020, 'cedula', 'Leo', 'Messi', 32, 5,'Cl 1 # 11 - 11');

  SELECT * FROM client;