drop database if exists study_mybatis_helloworld;
create database study_mybatis_helloworld;
use study_mybatis_helloworld;

drop table if exists t_user;

create table t_user (
	id bigint auto_increment,
	username varchar(1024),
	password varchar(256),
	primary key (id)
);

insert into t_user(id, username, password) values (1, 'a', 'a');
insert into t_user(id, username, password) values (2, 'b', 'b');