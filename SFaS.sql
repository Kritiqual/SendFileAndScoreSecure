/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kritiqual
 * Created: Dec 26, 2022
 */

USE master

DROP DATABASE IF EXISTS SFaS

CREATE DATABASE SFaS

USE SFaS

------- Table -------

-- Account --
CREATE TABLE Account (
    Username VARCHAR(25) CONSTRAINT pk_Username PRIMARY KEY,
    Password VARCHAR(16) NOT NULL,
    AccType INT NOT NULL DEFAULT 0
)
--> Insert data
INSERT INTO Account (Username, Password, AccType)
VALUES
    ('admin', 'adm123', 1),
    ('teacher', 'tch122', 2),
    ('student', 'std123', 0);

SELECT * FROM Account

