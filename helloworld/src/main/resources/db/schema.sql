drop table if exists t_user;

create table t_user (
    id int primary key auto_increment,
    name varchar(100),
    password varchar(100),
    age int
);

insert into t_user(id, name, password, age) values (null, 'zhangsan', '123', 20);
