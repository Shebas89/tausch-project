-- public."tausch-user" definition

-- Drop table

-- DROP TABLE public."tausch-user";

CREATE TABLE public."tausch-user" (
	id serial4 NOT NULL,
	eliminado int4 NOT NULL,
	nombre varchar NOT NULL,
	apellido varchar NOT NULL,
	username varchar NOT NULL,
	tipo_documento varchar NOT NULL,
	documento_identidad int8 NOT NULL,
	email varchar NOT NULL,
	telefono int8 NOT NULL,
	fecha_nacimiento date NOT NULL,
	contrasena varchar NOT NULL,
	contrasena_recuperacion int4 NOT NULL
);
CREATE INDEX tausch_user_username_idx ON public."tausch-user" USING btree (username, email, contrasena);

INSERT INTO public."tausch-user"
(eliminado, nombre, apellido, username, tipo_documento, documento_identidad, email, telefono, fecha_nacimiento, contrasena, contrasena_recuperacion)
VALUES(0, 'admin', 'tausch', 'admin', 'cc', 1, 'admin@tausch.com', 3214567890, '1-01-2012', 'admin-tausch', 0);


-- public."tausch-producto" definition

-- Drop table

-- DROP TABLE public."tausch-producto";

CREATE TABLE public."tausch-producto" (
        id serial4 NOT NULL,
        disponible int4 NOT NULL,
        nombre varchar NOT NULL,
        categoria varchar NOT NULL,
        cantidad int NOT NULL,
        medida varchar NOT NULL,
        direccion varchar NOT NULL,
        ciudad varchar NOT NULL,
        id_usuario int NOT NULL,
        fecha_publicacion date NOT NULL,
        fecha_disponible date NOT NULL,
		descripcion varchar NOT null,
		estado varchar NOT null,
        imagen varchar NOT NULL
);
