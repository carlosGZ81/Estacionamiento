/* Populate tables */
/*VEHICULOS*/
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(1, 'PAD718', 'AUTO', 'CHEVROLET', 'SEDAN 3 PUERTAS', '2018-01-20', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(2, 'SUM722', 'CAMIONETA', 'VOLVO', 'UTILITARIO 2 EJES', '2018-02-05', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(3, 'SND234', 'MOTO', 'BMW', 'MOTO MAS DE 100CC', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(4, 'AA008RM', 'AUTO', 'FIAT', 'SEDAN 4 PUERTAS', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(5, 'TAD321', 'CAMION', 'MERCEDES', 'OTROS', '2018-02-18');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(6, 'JLP7001', 'MOTO', 'YAMAHA', 'MOTO MAS DE 100CC', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(7, 'AA001PA', 'AUTO', 'BMW', 'SEDAN 3 PUERTAS', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(8, 'TRT122', 'CAMIONETA', 'OTRO', 'MULTIEJE', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(9, 'TOP011', 'MOTO', 'HONDA', 'MOTO MAS DE 100CC', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(10, 'AB123ER', 'UTILITARIO', 'PEUGEOUT', 'MULTIEJE', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(11, 'SND234', 'MOTO', 'BMW', 'MOTO MAS DE 100CC', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(12, 'SND234', 'MOTO', 'BMW', 'MOTO MAS DE 100CC', '2018-02-18', '');
INSERT INTO vehiculos (id, dominio, tipo_vehic, marca_vehic, desc_vehic, create_at, foto) VALUES(13, 'SND234', 'MOTO', 'BMW', 'MOTO MAS DE 100CC', '2018-02-18', '');
/*PERSONAS*/
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(1, 'CARLOS', 'ZANOTELLI', '28627552', '2018-01-01');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(2, 'JUAN', 'MOLINA', '14785666', '2018-01-02');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(3, 'MARIO', 'CARLOTTI', '22478555', '2018-02-01');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(4, 'MARIA', 'ALDETE', '35478555', '2018-01-01');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(5, 'EDUARDO', 'SORTTINI', '45700811', '2018-01-02');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(6, 'ANA', 'PAEZ', '40120456', '2018-02-01');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(7, 'RAMIRO', 'PEREZ', '14785222', '2018-01-01');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(8, 'ADAN', 'PEPSI', '47011789', '2018-01-02');
INSERT INTO personas (id, nom_persona, ape_persona, dni, create_at) VALUES(9, 'LEONEL', 'CAMPOI', '21789001', '2018-02-01');
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
/*INGRESOS*/
INSERT INTO ingresos (id, vehiculo_id, fec_ing, fec_egre, fraccion_tiempo, valor_deuda, estado_Deuda, create_at) VALUES(1, 1, '2018-01-20', '2018-01-20', 2, 5, 'PAGADA', '2018-01-20');
INSERT INTO ingresos (id, vehiculo_id, fec_ing, fec_egre, fraccion_tiempo, valor_deuda, estado_Deuda, create_at) VALUES(2, 1, '2018-01-22', '2018-01-22', 4, 12.5, 'PAGADA', '2018-01-22');
INSERT INTO ingresos (id, vehiculo_id, fec_ing, fec_egre, fraccion_tiempo, valor_deuda, estado_Deuda, create_at) VALUES(3, 1, '2018-01-22', '2018-01-22', 8, 25, 'IMPAGA', '2018-01-22');
INSERT INTO ingresos (id, vehiculo_id, fec_ing, fec_egre, fraccion_tiempo, valor_deuda, estado_Deuda, create_at) VALUES(4, 3, '2018-01-25', '2018-01-25', 5, 12, 'PAGADA', '2018-01-25');
INSERT INTO ingresos (id, vehiculo_id, fec_ing, fec_egre, fraccion_tiempo, valor_deuda, estado_Deuda, create_at) VALUES(5, 2, '2018-01-28', '2018-01-28', 6, 15, 'PAGADA', '2018-01-28');
