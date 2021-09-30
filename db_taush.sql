# Create DB
Drop database `dbtausch`;

CREATE DATABASE IF NOT EXISTS `dbtausch`;

# Create product table
CREATE TABLE `dbtausch`.`tausch-productos` (
	`id` INT auto_increment NOT NULL,
	`disponible` INT DEFAULT 1 NOT NULL,
	`nombre` varchar(50) NOT NULL,
	`categoria` varchar(50) NOT NULL,
	`cantidad` INT unsigned NOT NULL,
	`medida` varchar(30) NOT NULL,
	`direccion` varchar(100) NOT NULL,
	`ciudad` varchar(30) NOT NULL,
	`id_usuario` INT unsigned NOT NULL,
	`fecha_publicacion` date  NOT NULL,
	`fecha_disponible` date NOT NULL,
	`descripcion` VARCHAR(200) DEFAULT "" NOT NULL,
	`estado` varchar(20) NOT NULL,
	`imagen` varchar(100) NULL,
	PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_bin;
CREATE INDEX tausch_producto_id_IDX USING BTREE ON `dbtausch`.`tausch-productos` (id,nombre,id_usuario,estado,categoria);


# Create user table
CREATE TABLE `dbtausch`.`tausch-usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eliminado` int NOT NULL DEFAULT '0',
  `nombre` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `username` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `tipo_documento` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `documento_identidad` int unsigned NOT NULL DEFAULT '0',
  `email` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `telefono` int unsigned NOT NULL DEFAULT '0',
  `fecha_nacimiento` date  NOT NULL,
  `contrasena` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `contrasena_recuperacion` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `tausch_usuarios_id_IDX` (`id`,`username`,`documento_identidad`,`email`) USING BTREE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_bin;

# add admin user
INSERT INTO `dbtausch`.`tausch-usuarios`(eliminado, nombre, apellido, username, tipo_documento, documento_identidad, email, telefono, fecha_nacimiento, contrasena, contrasena_recuperacion)
VALUES(0, 'admin', 'tausch', 'admin', 'cc', 1, 'admin@tausch.com', 3214567890, STR_TO_DATE('1-01-2012', '%d-%m-%Y'), 'admin-tausch', 0);