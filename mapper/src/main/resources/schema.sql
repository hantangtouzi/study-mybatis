drop table if exists t_role;
drop table if exists t_user;

create table t_role (
  id int primary key auto_increment,
  name varchar(50),
  description varchar(200)
);

create table t_user (
  id int primary key auto_increment,
  username varchar(50),
  password varchar(20),
  email varchar(100)
);

insert into t_role (id, name, description) values (1, '超级管理员', '拥有系统的最高管理权限');
insert into t_role (id, name, description) values (2, '普通管理员', '拥有系统的普通管理权限');
insert into t_role (id, name, description) values (3, '超级会员', '拥有系统的最高用户权限');
insert into t_role (id, name, description) values (4, '普通会员', '拥有系统的普通用户权限');

insert into t_user (id, username, password, email) values (1, 'zhangsan', 'zs', 'zhangsan@sina.com');
insert into t_user (id, username, password, email) values (2, 'lisi', 'ls', 'lisi@sina.com');





