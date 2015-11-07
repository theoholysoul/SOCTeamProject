# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                        integer,
  user_name                 varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  affiliation               varchar(255),
  email                     varchar(255),
  password                  varchar(255))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

