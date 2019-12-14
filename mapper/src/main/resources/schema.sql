drop table if exists t_company;
drop table if exists t_role;
drop table if exists t_user;

create table t_company (
  id int primary key auto_increment,
  name varchar(250)
);

create table t_role (
  id int primary key auto_increment,
  name varchar(50),
  description varchar(200)
);

create table t_user (
  id int primary key auto_increment,
  username varchar(50),
  password varchar(20),
  email varchar(100),
  companyId int
);

insert into t_company (id, name) values (1, '浦发银行');
insert into t_company (id, name) values (2, '平安银行');
insert into t_company (id, name) values (3, '民生银行');

insert into t_role (id, name, description) values (1, '超级管理员', '拥有系统的最高管理权限');
insert into t_role (id, name, description) values (2, '普通管理员', '拥有系统的普通管理权限');
insert into t_role (id, name, description) values (3, '超级会员', '拥有系统的最高用户权限');
insert into t_role (id, name, description) values (4, '普通会员', '拥有系统的普通用户权限');

insert into t_user (id, username, password, email, companyId) values (1, 'zhangsan', 'zs', 'zhangsan@sina.com', 1);
insert into t_user (id, username, password, email, companyId) values (2, 'lisi', 'ls', 'lisi@sina.com', 2);





