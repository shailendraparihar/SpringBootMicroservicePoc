/* Create a database table `user` in `poc` schema 
and insert few rows with username and  password. Use Bcrypted password in password column*/

CREATE SCHEMA `poc`

CREATE TABLE `user`(
`id` int(10) NOT NULL AUTO_INCREMENT,
`username` VARCHAR(500) DEFAULT NULL,
`password` VARCHAR(500) DEFAULT NULL,
PRIMARY KEY (`id`)
)

