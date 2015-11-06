# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                        bigint not null,
  password                  varchar(255),
  email                     varchar(255),
  user_name                 varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  middle_initial            varchar(255),
  affiliation               varchar(255),
  title                     varchar(255),
  mailing_address           varchar(255),
  phone_number              varchar(255),
  fax_number                varchar(255),
  research_fields           varchar(255),
  highest_degree            varchar(255),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists user_seq;

