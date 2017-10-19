use test;
drop table if exists task;
create table task(
id int(11) not null auto_increment,
description varchar(255),
due_date datetime not null default current_timestamp,
is_done bit(1) not null default 0,
primary key (id))
engine = InnoDB
default character set = utf8;

insert into task (description) values ("one"),
("two"),
("three"),
("four"),
("five"),
("six"),
("seven"),
("eight"),
("nine"),
("ten"),
("eleven"),
("twelve"),
("threteen"),
("forteen"),
("fiveteen"),
("sixteen");