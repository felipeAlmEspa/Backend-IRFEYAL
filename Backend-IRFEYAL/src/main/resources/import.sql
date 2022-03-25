INSERT INTO clientes (nombre,apellido,email,fecha) VALUES ('pepe','rojas','pepe@gmial.com','10-10-2021');
INSERT INTO clientes (nombre,apellido,email,fecha) VALUES ('carlos','rojas','carlos@gmial.com','10-10-2021');
INSERT INTO clientes (nombre,apellido,email,fecha) VALUES ('geovanny','rojas','geovanny@gmial.com','10-10-2021');
INSERT INTO clientes (nombre,apellido,email,fecha) VALUES ('romel','rojas','romel@gmial.com','10-10-2021');
INSERT INTO clientes (nombre,apellido,email,fecha) VALUES ('fher','rojas','fher@gmial.com','10-10-2021');

INSERT INTO pais (pais) VALUES ('Ecuador');

INSERT INTO provincia (provincia) VALUES ('AZUAY'), ('LOJA'), ('CAÑAR'), ('COTOPAXI'), ('TUNGURAGUA'), ('CARCHI'), ('CHIMBORAZO'), ('EL ORO'), ('GUAYAS');

INSERT INTO canton (canton) VALUES ('CUENCA'), ('GIRON'), ('CATAMAYO'), ('AZOGUES'), ('BIBLIAN'), ('GUAYAQUIL'), ('RIOBAMBA'), ('TULCAN'), ('AMBATO'), ('QUITO');

INSERT INTO parroquia (parroquia) VALUES ('BELLAVISTA'), ('EL BATAN'), ('MONAY'), ('SAN BLAS'), ('BORRERO'), ('SAN FRANCISCO'), ('PUNIN'), ('FLORES'), ('BOLIVAR'), ('ROCAFUERTE');


INSERT INTO rol (descripcion) VALUES ('administrador'), ('coordinador administrativo'), ('coordinador de desarrollo institucional'), ('docente'), ('estudiante'), ('gerente'), ('secretaria'), ('tutor');


INSERT INTO genero (genero) VALUES ('MASCULINO'), ('FEMENINO'), ('OTRO');

INSERT INTO usuario (id_usuario, contrasenia,est_usuario,usuario,id_persona) VALUES (1, '1234','activo','secre',1);
INSERT INTO persona(apellido,cedula,fecha_nacimiento,nombre,id_direccion, id_genero) VALUES ('Orellana','200356492','12/12/1996','Laura',1,2);
INSERT INTO empresa (empresa,id_usuario) VALUES ('irfeyal',1);
INSERT INTO direccion (av_principal,av_secundaria,id_canton,id_empresa,id_pais,id_parroquia,id_provincia) VALUES ('AV. DE LAS AMERICAS','LUIS CORDERO',1,1,1,1,1);






