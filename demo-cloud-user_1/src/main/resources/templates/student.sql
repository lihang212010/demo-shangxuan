create table users( 
id varchar(20) primary key,
name varchar(20),
sex varchar(4),
major varchar(20));
insert into users(id,name,sex,major) values ("5006160001","催问题","男","计算机信息技术");
insert into users(id,name,sex,major) values ("5006160002","为大头","男","计算机信息技术");
insert into users(id,name,sex,major) values ("5006160003","孙与","女","物联网");
insert into users(id,name,sex,major) values ("5006160004","出大坑","男","物联网");
insert into users(id,name,sex,major) values ("5006160005","赵小","女","物联网");
insert into users(id,name,sex,major) values ("5006160006","虚假","男","计算机信息技术");
insert into users(id,name,sex,major) values ("5006160007","张三","男","网络安全");
insert into users(id,name,sex,major) values ("5006160008","李四","男","计算机信息技术");
insert into users(id,name,sex,major) values ("5006160009","王无","男","计算机信息技术");
insert into users(id,name,sex,major) values ("5006160010","玩哇","男","计算机信息技术");
insert into users(id,name,sex,major) values ("5006160011","无聊","男","网络安全");


ALTER TABLE users MODIFY name varchar(20) CHARACTER SET "utf8";
ALTER TABLE users MODIFY sex varchar(4) CHARACTER SET "utf8";
ALTER TABLE users MODIFY major varchar(20) CHARACTER SET "utf8";














