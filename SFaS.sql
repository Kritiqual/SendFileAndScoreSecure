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
    AccID INT IDENTITY(1,1) PRIMARY KEY,
    Username VARCHAR(25) NOT NULL,
    Password VARCHAR(16) NOT NULL,
    IsAdmin INT NOT NULL DEFAULT 0 -- 1: Admin, 0: Teacher
)

-- Teacher --
CREATE TABLE Teacher (
    TeacherID VARCHAR(15) PRIMARY KEY,
    TeacherName NVARCHAR(25) NOT NULL,
    TeacherPos NVARCHAR(20),
    TeacherTel VARCHAR(11),
    TeacherFct NVARCHAR(20)
)

-- Class --
CREATE TABLE ClassMDL (
    ClassID BIGINT IDENTITY(1,1) PRIMARY KEY,
    ClassName VARCHAR(25) NOT NULL,
    TeacherName VARCHAR(25) NOT NULL
)

-- Student --
CREATE TABLE Student (
    StuID INT IDENTITY(1,1) PRIMARY KEY,
    StuName VARCHAR(25) NOT NULL,
    StuTel VARCHAR(10),
    StuDoB DATE NOT NULL,
    StuHome VARCHAR(50) NOT NULL,
    StuClass VARCHAR(25) NOT NULL,
    StuFaculty VARCHAR(25) NOT NULL,
    StuGPA FLOAT NOT NULL
)

------- Insert data -------
-- Account --
INSERT INTO Account
VALUES
    ('admin', 'adm@123', 1),
    ('teacher', 'tch@123', 0);

-- Teacher --
INSERT INTO Teacher
VALUES
    ('1', 'Teacher A', 'Prof', '0123456789', 'Computer Science'),
    ('2', 'Teacher B', 'Prof', '0124356789', 'Electricity');

-- Class --
INSERT INTO ClassMDL
VALUES
    ('Computer Sciene', 'Teacher A'),
    ('Electricity', 'Teacher B');

-- Student --
INSERT INTO Student
VALUES
    ('Student A', '0123456789', '01/01/1990', 'Hai Duong', 'IT', 'IT', 3.71),
    ('Student B', '0223344556', '02/02/2002', 'Ha Noi', 'Mechanic', 'Electric', 2.1),
    ('Student C', '0334455800', '12/09/2005', 'Ho Chi Minh', 'Computer Science', 'IT', 1.55);

