SET SQL_SAFE_UPDATES = 0;
UPDATE user SET EMAIL= CONCAT(lower(nome),"@teste.com");