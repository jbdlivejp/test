drop database if exists sampledb2;
create database sampledb2;
use sampledb2;

create table sample_table(
user_no int,
user_name varchar(255),
user_age int,
user_mail varchar(255)
);

insert into sample_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample_table values(2,"Sato",39,"yyy@google.com");
insert into sample_table values(3,"Harada",44,"zzz@yahoo.co.jp");


