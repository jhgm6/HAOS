drop database if exists haos;
create database haos charset=utf8;
use haos;
create table admin(
  id varchar(20) primary key,
  password varchar(25),
  name varchar(20),
  gender int,
  birth DATE,
  phone varchar(11),
  address varchar(255),
  img varchar(255)
);

insert into admin(id, password) value ('admin','admin');

create table emp(
  id varchar(20) primary key,
  password varchar(25),
  name varchar(20),
  gender int,
  birth DATE,
  phone varchar(11),
  address varchar(255),
  img varchar(255)
);

insert into emp(id, password) value ('emp','emp');

create table cus(
  id varchar(20) primary key,
  name varchar(25),
  gender int,
  phone varchar(11),
  roomNum varchar(4),
  inTime Date,
  outTime Date,
  deposit float
);

create table room(
  roomNum varchar(4) primary key,
  type varchar(10),
  inTime Date,
  outTime Date,
  isUsed Boolean
);

create table roomType(
  id int primary key auto_increment,
  type varchar(10),
  price float,
  matIds varchar(20)
);

create table mat(
  id int primary key auto_increment,
  price float,
  name varchar(20)
);

create table record(
  id int  primary key auto_increment,
  roomNum varchar(4),
  type varchar(10),
  inTime Date,
  outTime Date,
  isUsed Boolean,
  cusId varchar(20),
  name varchar(25),
  gender int,
  deposit float,
  phone varchar(11)
);