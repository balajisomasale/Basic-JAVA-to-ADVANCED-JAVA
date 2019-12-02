
CREATE SCHEMA IF NOT EXISTS `library`;
USE `library`;
CREATE TABLE IF NOT EXISTS `library`.`book` (
    `bk_id` INT NOT NULL AUTO_INCREMENT,
    `bk_title` VARCHAR(100) NULL,
    `bk_author_name` VARCHAR(100) NULL,
    `bk_price` decimal(20) NULL,
    `bk_publisher` varchar(20) NULL,
    `bk_isbn` VARCHAR(100) NULL,
   
    PRIMARY KEY (`bk_id`)
   
        
)  ENGINE=INNODB;

select * from book;

create table `library`.`subscriber`(
`sr_id` INT NOT NULL AUTO_INCREMENT,
 `sr_name` VARCHAR(40) NULL,
 `sr_address` VARCHAR(40) NULL,
 `sr_contact_ number` INT(20) NULL,
 
 PRIMARY KEY (`sr_id`)
 
 
 )
 ENGINE=INNODB;
 
 drop table book_lending;
 create table `library`.`book_lending`(
 
 `bkl_bk_id` INT NOT NULL,
 `bkl_sr_id` INT NOT NULL,
 `bkl_date_id` DATE NULL,
 
 
    CONSTRAINT `bkl_sr_id_fk` FOREIGN KEY (`bkl_sr_id`)
        REFERENCES `library`.`subscriber` (`sr_id`),
        CONSTRAINT `bkl_bk_id_fk` FOREIGN KEY (`bkl_bk_id`)
        REFERENCES `library`.`book` (`bk_id`)
       
 
 ) ENGINE=INNODB;
 select * from `book_lending`;
 
 
