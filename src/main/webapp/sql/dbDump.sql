/**
 * CREATE DB
 */
DROP DATABASE IF EXISTS shopping_db;
CREATE DATABASE shopping_db;

/**
 * CREATE TABLES 
 */
DROP TABLE IF EXISTS `shopping_db`.`user_role`;


CREATE TABLE  `shopping_db`.`user_role` (
  `id` bigint(20) NOT NULL auto_increment,
  `created` datetime default NULL,
  `created_by` varchar(255) default NULL,
  `updated` datetime default NULL,
  `updated_by` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `role_name` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `UK_jyy1ia186jxs085pd7ry00blj` (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `shopping_db`.`user`;

CREATE TABLE  `shopping_db`.`user` (
  `id` bigint(20) NOT NULL auto_increment,
  `created` datetime default NULL,
  `created_by` varchar(255) default NULL,
  `updated` datetime default NULL,
  `updated_by` varchar(255) default NULL,
  `api_key` longtext,
  `email` longtext,
  `first_name` longtext,
  `last_name` longtext,
  `lockout` bit(1) default NULL,
  `password` longtext NOT NULL,
  `user_name` longtext NOT NULL,
  `user_roles_id` bigint(20) default NULL,
  `api_key_expire_time` datetime default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_awwvp0c5hrwy562edgihbqbra` (`user_roles_id`),
  CONSTRAINT `FK_awwvp0c5hrwy562edgihbqbra` FOREIGN KEY (`user_roles_id`) REFERENCES `user_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*
 * INSERT INTO USER_ROLE
 */
INSERT INTO user_role VALUES (1,null,null,null,null,'admin role','ADMIN');
INSERT INTO user_role VALUES (2,null,null,null,null,'user role','USER');

/*
 * INSERT INTO USER
 */
INSERT INTO USER VALUES(1,null,null,null,null,null,'vishnuawasthi121@gmail.com','Vishnu','Awasthi',false,'Secure*123','vishnuawasthi',1,null);

INSERT INTO USER VALUES(2,null,null,null,null,null,'ravi.kumar@gmail.com','ravi','kumar',false,'User*123','ravi.kumar',2,null);










