drop table if exists t_user;

create table t_user
(
    id int(11) not null auto_increment,
    username varchar(20) not null,
    password varchar(20) not null,
    nickname varchar(20) not null,
    email varchar(30) not null,
    primary key(id)
);

insert into t_user(username, password, nickname, email)
values("mybatis", "mybatis", "mybatis", "mybatis@mvc.org");
insert into t_user(username, password, nickname, email)
values("mybatis", "mybatis", "mybatis", "mybatis@mvc.org");
insert into t_user(username, password, nickname, email)
values("mybatis", "mybatis", "mybatis", "mybatis@mvc.org");
insert into t_user(username, password, nickname, email)
values("mybatis", "mybatis", "mybatis", "mybatis@mvc.org");
insert into t_user(username, password, nickname, email)
values("mybatis", "mybatis", "mybatis", "mybatis@mvc.org");
