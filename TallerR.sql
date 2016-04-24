CREATE TABLE asociado (
nombre VARCHAR(20),
PRIMARY KEY (nombre)
);

CREATE TABLE Registradora (
        Id INTEGER NOT NULL,
        Id_asociado VARCHAR(20),
        Fecha DATE,
        PRIMARY KEY (Id),
        FOREIGN KEY (Id_asociado) REFERENCES Asociado (nombre)
);

