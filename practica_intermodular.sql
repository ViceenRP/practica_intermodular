drop database if exists practica_intermodular;
create database practica_intermodular;
use practica_intermodular;
create table Sol(
	nombre varchar(3) primary key,
    tipo varchar(10),
    radio float,
    temperatura float,
    distancia_tierra float,
    composicion varchar(200),
    fecha_creacion date not null
);

create table planetas (
    nombre varchar(100) primary key,
    radio float,
    distancia_sol float,
    periodo_orbital float,
    temperatura float,
    tipo varchar(100),
    num_satelites int,
    fecha_creacion date not null
);

create table satelites (
	nombre varchar(100) primary key,
    planeta varchar(100),
    radio float,
    distancia_planeta float,
    periodo_orbital float,
    temperatura float,
    tipo varchar(100),
    fecha_creacion date not null
);

DELIMITER //
CREATE TRIGGER fecha_creacion_sol
BEFORE INSERT ON Sol
FOR EACH ROW
BEGIN
  -- SET NEW.Fecha_Creacion = CURDATE();
  SET NEW.fecha_Creacion = sysdate();
END;
//
CREATE TRIGGER fecha_creacion_planetas
BEFORE INSERT ON planetas
FOR EACH ROW
BEGIN
  SET NEW.fecha_Creacion = sysdate();
END;
//
CREATE TRIGGER fecha_creacion_satelites
BEFORE INSERT ON satelites
FOR EACH ROW
BEGIN
  SET NEW.fecha_Creacion = sysdate();
END;
//
-- Trigger que actualiza el número de satélites
CREATE TRIGGER actualiza_num_satelites
AFTER INSERT ON Satelites
FOR EACH ROW
BEGIN
  DECLARE numero INT;
  SELECT COUNT(*) INTO numero FROM Satelites WHERE planeta = NEW.planeta;
  UPDATE Planetas SET num_satelites = numero WHERE nombre = NEW.planeta;
END;
//
DELIMITER ;

insert into Sol (nombre, tipo, radio, temperatura, distancia_tierra, composicion) values
('Sol', 'G2V', 696340, 5500, 149.6, '74% Hidrógeno, 24% Helio, 2% Otros');

insert into planetas (nombre, radio, distancia_sol, periodo_orbital, temperatura, tipo) values
('Mercurio', 2439.7, 57.9, 88, 167, 'Rocoso'),
('Venus', 6051.8, 108.2, 225, 464, 'Rocoso'),
('Tierra', 6371, 149.6, 365.25, 15, 'Rocoso'),
('Marte', 3389.5, 227.9, 687, -65, 'Rocoso'),
('Júpiter', 69911, 778.5, 4333, -110, 'Gaseoso'),
('Saturno', 58232, 1429.4, 10759, -140, 'Gaseoso'),
('Urano', 25362, 2870.9, 30687, -195, 'Gaseoso'),
('Neptuno', 24622, 4498.3, 60190, -200, 'Gaseoso');

insert into satelites (nombre, planeta, radio, distancia_planeta, periodo_orbital, temperatura, tipo) values
('Luna', 'Tierra', 1737.4, 384400, 27.3, -53, 'Sólido/Rocoso'),
('Fobos', 'Marte', 11.1, 9378, 0.3, -40, 'Sólido/Rocoso'),
('Deimos', 'Marte', 6.2, 23460, 1.3, -40, 'Sólido/Rocoso'),
('Ío', 'Júpiter', 1821.6, 421700, 1.8, -143, 'Sólido/Rocoso'),
('Europa', 'Júpiter', 1560.8, 670900, 3.5, -160, 'Sólido/Hielo'),
('Ganimedes', 'Júpiter', 2634.1, 1070400, 7.2, -163, 'Sólido/Hielo'),
('Calisto', 'Júpiter', 2410.3, 1882700, 16.7, -139, 'Sólido/Hielo'),
('Titán', 'Saturno', 2575.5, 1222000, 15.9, -179, 'Sólido/Hielo'),
('Encélado', 'Saturno', 252.1, 238000, 1.4, -201, 'Sólido/Hielo'),
('Titania', 'Urano', 788.4, 435900, 8.7, -203, 'Sólido/Hielo'),
('Oberón', 'Urano', 761.4, 583500, 13.5, -203, 'Sólido/Hielo');
select * from satelites;