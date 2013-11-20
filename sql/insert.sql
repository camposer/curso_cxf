DELETE FROM persona;
INSERT INTO persona(id, nombre, apellido) VALUES(1, 'Rodolfo', 'Campos');
INSERT INTO persona(id, nombre, apellido) VALUES(2, 'Oscar', 'Cano');
INSERT INTO persona(id, nombre, apellido) VALUES(3, 'Fulanito', 'Detal');

DELETE FROM ordenador;
INSERT INTO ordenador(persona_id, nombre, serial) VALUES(1, 'Uno1', '11');
INSERT INTO ordenador(persona_id, nombre, serial) VALUES(1, 'Uno2', '12');
INSERT INTO ordenador(persona_id, nombre, serial) VALUES(2, 'Dos1', '21');
INSERT INTO ordenador(persona_id, nombre, serial) VALUES(3, 'Tres1', '31');
INSERT INTO ordenador(persona_id, nombre, serial) VALUES(3, 'Tres2', '32');
INSERT INTO ordenador(persona_id, nombre, serial) VALUES(3, 'Tres3', '33');