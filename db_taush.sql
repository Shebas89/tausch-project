# Create DB
CREATE DATABASE IF NOT EXISTS `dbtausch`;

# Create product tble
CREATE TABLE `dbtausch`.`tausch-productos` (
	`id` INT auto_increment NOT NULL,
	`disponible` INT DEFAULT 1 NOT NULL,
	`nombre` varchar(100) NOT NULL,
	`categoria` varchar(100) NOT NULL,
	`cantidad` INT NOT NULL,
	`medida` INT NOT NULL,
	`direccion` varchar(100) NOT NULL,
	`ciudad` varchar(30) NOT NULL,
	`id_usuario` INT NOT NULL,
	`fecha_publicacion` varchar(100) DEFAULT 0 NOT NULL,
	`fecha_disponible` varchar(100) DEFAULT 0 NOT NULL,
	`descripcion` VARCHAR(100) DEFAULT "" NOT NULL,
	`estado` varchar(100) NOT NULL,
	`imagen` varchar(100) NULL,
	PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_bin;
CREATE INDEX tausch_producto_id_IDX USING BTREE ON `dbtausch`.`tausch-productos` (id,nombre,id_usuario,estado,categoria);


# Create user table
CREATE TABLE `dbtausch`.`tausch-usuarios` (
	id INT auto_increment NOT NULL,
	eliminado INT DEFAULT 0 NOT NULL,
	nombre varchar(100) NOT NULL,
	apellido varchar(100) NOT NULL,
	username varchar(100) NOT NULL,
	typo_documento INT DEFAULT 0 NOT NULL,
	documento_identidad INT DEFAULT 0 NOT NULL,
	email varchar(100) NOT NULL,
	telefono INT DEFAULT 0 NOT NULL,
	descripcion VARCHAR(100) NULL,
	contrasena varchar(20) NOT NULL,
	contrasena_recuperacion INT NULL,
	PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_bin;
CREATE INDEX tausch_usuarios_id_IDX USING BTREE ON `dbtausch`.`tausch-usuarios` (id,username,documento_identidad,email);
