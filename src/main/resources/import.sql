/* Populate tables */
/*VEHICULOS*/
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at) VALUES(1, 'PAD718', '1', '2', '1', '2018-01-20');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at) VALUES(2, 'SUM722', '1', '3', '1', '2018-02-05');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at) VALUES(3, 'SND234', '2', '1', '2', '2018-02-18');
/*PERSONAS*/
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(1, 'CARLOS', 'ZANOTELLI', '28627552', '2018-01-01');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(2, 'JUAN', 'MOLINA', '14785666', '2018-01-02');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(3, 'MARIO', 'CARLOTTI', '22478555', '2018-02-01');
/*TIPO_VEHICULO*/
INSERT INTO tipo_vehiculos (id, tipo_vehic) VALUES(1, 'AUTO');
INSERT INTO tipo_vehiculos (id, tipo_vehic) VALUES(2, 'MOTO');
INSERT INTO tipo_vehiculos (id, tipo_vehic) VALUES(3, 'CAMIONETA');
INSERT INTO tipo_vehiculos (id, tipo_vehic) VALUES(4, 'CAMION');
INSERT INTO tipo_vehiculos (id, tipo_vehic) VALUES(5, 'UTILITARIO');
INSERT INTO tipo_vehiculos (id, tipo_vehic) VALUES(99, 'OTRO');
/*MARCA_VEHICULO*/
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(1, 'AUDI');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(2, 'CHEVROLET');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(3, 'BMW');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(4, 'FIAT');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(5, 'PEUGEOT');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(6, 'VOLVO');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(7, 'CITROEN');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(8, 'CHRYSLER');
INSERT INTO marca_vehiculos (id, marca_vehic) VALUES(99, 'OTRO');
/*DESCRIPCION_VEHICULO*/
INSERT INTO desc_vehiculos (id, desc_vehic) VALUES(1, 'SEDAN 3 PUERTAS');
INSERT INTO desc_vehiculos (id, desc_vehic) VALUES(2, 'SEDAN 4 PUERTAS');
INSERT INTO desc_vehiculos (id, desc_vehic) VALUES(3, 'MOTO MAS DE 100CC');
INSERT INTO desc_vehiculos (id, desc_vehic) VALUES(4, 'MOTO MENOS DE 100CC');
INSERT INTO desc_vehiculos (id, desc_vehic) VALUES(5, 'UTILITARIO 2 EJES');
INSERT INTO desc_vehiculos (id, desc_vehic) VALUES(6, 'UTILITARIO MULTI EJES');
INSERT INTO desc_vehiculos (id, desc_vehic) VALUES(99, 'OTRO');
/*ESTADO_DEUDA*/
INSERT INTO estado_deudas (id, desc_deuda) VALUES(1, 'IMPAGA');
INSERT INTO estado_deudas (id, desc_deuda) VALUES(2, 'PAGA');
INSERT INTO estado_deudas (id, desc_deuda) VALUES(3, 'ANULADA');
INSERT INTO estado_deudas (id, desc_deuda) VALUES(4, 'BAJA');
INSERT INTO estado_deudas (id, desc_deuda) VALUES(99, 'OTRO');