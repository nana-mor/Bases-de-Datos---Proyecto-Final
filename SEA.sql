


CREATE TABLE PROFESOR(
NumTrabajador VARCHAR(8) PRIMARY KEY,
Contrasena VARCHAR(25) NOT NULL,
Nombre VARCHAR(60) NOT NULL);

CREATE TABLE MATERIA(
ID VARCHAR(15) PRIMARY KEY,
Profesor VARCHAR(8),
Nombre VARCHAR(20) NOT NULL,
Semestre INTEGER NOT NULL,
Grupo VARCHAR(4) NOT NULL,
Salon VARCHAR(5) NOT NULL
);

CREATE TABLE ESTUDIANTE(
 NumCuenta VARCHAR(9) PRIMARY KEY, 
 Contrasena VARCHAR(25) NOT NULL, 
 Nombre VARCHAR(60),
 Apellidos VARCHAR(60)
 );


CREATE TABLE INSCRIPCION(
Materia VARCHAR(15) REFERENCES MATERIA(ID),
Estudiante VARCHAR(9) REFERENCES ESTUDIANTE(NumCuenta)
);

CREATE TABLE ACTIVIDAD(
ID INTEGER PRIMARY KEY,
Materia VARCHAR(15),
Nombre VARCHAR(30),
f_asig DATE,
f_limite DATE,
tipo VARCHAR(20)
);

CREATE TABLE ENTREGA(
Actividad INTEGER REFERENCES ACTIVIDAD(ID),
Estudiante VARCHAR(9) REFERENCES ESTUDIANTE(NumCuenta),
f_entrega DATE,
Calificacion INTEGER
);


----- 


INSERT INTO PROFESOR VALUES ("89654758","Fido74","Jesús Galindo Cuevas");
INSERT INTO PROFESOR VALUES ("86574895","Claudia123","Claudia Cristina Montes de Oca");
INSERT INTO PROFESOR VALUES ("87632514","Fido74","Liliana Gutiérrez Flores");
INSERT INTO MATERIA VALUES ("2403-BaDat","87632514","Bases de Datos","4","2403","A-424");
INSERT INTO MATERIA VALUES ("2254-CalII","89654758","Cálculo II","2","2254","A-423");
INSERT INTO MATERIA VALUES("2403-Proba","86574895","Probabilidad","4","2403","A-115");
INSERT INTO MATERIA VALUES("2401-Proba","86574895","Probabilidad","4","2401","A-405");
INSERT INTO ESTUDIANTE VALUES("316458789","wilde123","Diana","Luna Mora");
INSERT INTO ESTUDIANTE VALUES("421756984","chayan123","Dana","Amador Navarro");
INSERT INTO ESTUDIANTE VALUES("421854988","ola123","Misael","Ramos Navarrete");
INSERT INTO ESTUDIANTE VALUES("421783654","monaschinas123","Daniel","Segura Diaz");


INSERT INTO INSCRIPCION VALUES ("2403-BaDat","316458789");
INSERT INTO INSCRIPCION VALUES ("2403-BaDat","421756984");
INSERT INTO INSCRIPCION VALUES ("2403-BaDat","421854988");
INSERT INTO INSCRIPCION VALUES ("2403-BaDat","421783654");

INSERT INTO INSCRIPCION VALUES ("2254-CalII","421756984");

INSERT INTO INSCRIPCION VALUES ("2403-Proba","421756984");
INSERT INTO INSCRIPCION VALUES ("2403-Proba","316458789");

INSERT INTO INSCRIPCION VALUES ("2401-Proba","421854988");
INSERT INTO INSCRIPCION VALUES ("2401-Proba","421783654");

------

 SELECT ESTUDIANTE.Apellidos, ESTUDIANTE.Nombre, COUNT(MATERIA.Nombre)
 FROM ESTUDIANTE, MATERIA, INSCRIPCION
 WHERE (ESTUDIANTE.NumCuenta = INSCRIPCION.Estudiante) AND (MATERIA.ID = INSCRIPCION.Materia)
 GROUP BY ESTUDIANTE.NumCuenta;










