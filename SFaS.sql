/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kritiqual
 * Created: Dec 26, 2022
 */

USE master
GO

DROP DATABASE IF EXISTS SFaS
GO

CREATE DATABASE SFaS
GO

USE SFaS
GO

------- Table -------
-- Account --
CREATE TABLE Account (
    Username VARCHAR(25) CONSTRAINT pk_Username PRIMARY KEY,
    Password VARCHAR(16) NOT NULL,
    AccType INT NOT NULL DEFAULT 0 -- 0: Student, 1: admin, 2: Teacher
)
GO
-- Teacher --
CREATE TABLE Teacher (
    TeacherID VARCHAR(15) CONSTRAINT pk_TchID PRIMARY KEY,
    TeacherName NVARCHAR(25) NOT NULL,
    TeacherPos NVARCHAR(20),
    TeacherTel VARCHAR(11),
    TeacherFct NVARCHAR(20)
)
GO

CREATE TABLE ClassMDL (
    ClassName VARCHAR(25) CONSTRAINT pk_ClassName PRIMARY KEY,
    TeacherName VARCHAR(25) NOT NULL
)
GO

------- Insert data -------
INSERT INTO Account (Username, Password, AccType)
VALUES
    ('admin', 'adm123', 1),
    ('teacher', 'tch122', 0);
GO

INSERT INTO Teacher
VALUES
    ('1', 'Teacher A', 'Prof', '0123456789', 'Computer Science'),
    ('2', 'Teacher B', 'Prof', '0124356789', 'Electricity');
GO

INSERT INTO ClassMDL
VALUES
    ('Computer Sciene', 'Teacher A'),
    ('Electricity', 'Teacher B');
GO

