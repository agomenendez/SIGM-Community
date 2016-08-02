--/*************************/
--/* Versi�n 4.7->4.8      */
--/*************************/

-- Insertar la versi�n actual de bd
INSERT INTO AGINFOSISTEMA (NOMBRE,VALOR,FECHAACTUALIZACION) VALUES ('VERSIONBD','4.7->4.8',CURRENT TIMESTAMP);


--Fecha devoluci�n en prorroga
ALTER TABLE ASGPPRORROGA ADD COLUMN FECHAFINPRORROGA TIMESTAMP;

--Motivo por el cual se solicita la prorroga
ALTER TABLE ASGPPRORROGA ADD COLUMN MOTIVOPRORROGA VARCHAR(512);


DROP INDEX ASGFELIMSELUDOC1;
DROP INDEX ASGFELIMSELUDOC2;

--Modificar el nombre de la tabla ASGFELIMSELUDOC por ASGFELIMUDOCCONS
RENAME ASGFELIMSELUDOC TO ASGFELIMUDOCCONS;

-- Tabla: ASGFELIMSELUDOC
CREATE INDEX ASGFELIMUDOCCONS1 ON ASGFELIMUDOCCONS (IDELIMINACION);
CREATE INDEX ASGFELIMUDOCCONS2 ON ASGFELIMUDOCCONS (IDUDOC);


CREATE TABLE ASGFELIMSELUDOC(
    IDELIMINACION VARCHAR(32) NOT NULL,
    IDUDOC VARCHAR(32) NOT NULL,
    IDFONDO VARCHAR(32),
    CODREFERENCIA VARCHAR(1024),
    CODIGO VARCHAR(128),
    SIGNATURAUDOC VARCHAR(32),
    EXPEDIENTEUDOC VARCHAR(256),
    TITULO VARCHAR(1024),
    CODSISTPRODUCTOR VARCHAR(16),
    TIPODOCUMENTAL VARCHAR(254),
    IDUINSTALACION VARCHAR(32),
    UBICACION VARCHAR(512),
    FECHAINIUDOC TIMESTAMP,
    FECHAFINUDOC TIMESTAMP,
    NUMERO VARCHAR(10)
);

-- Tabla: ASGFELIMSELUDOC
CREATE INDEX ASGFELIMSELUDOC1 ON ASGFELIMSELUDOC (IDELIMINACION);
CREATE INDEX ASGFELIMSELUDOC2 ON ASGFELIMSELUDOC (IDUDOC);

-- Tabla: ASGFUNIDADDOC
CREATE INDEX ASGFUNIDADDOC4 ON ASGFUNIDADDOC(IDFONDO);










