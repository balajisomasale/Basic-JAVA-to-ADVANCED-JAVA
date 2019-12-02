


CREATE SCHEMA IF NOT EXISTS `emp-schema`;
USE `emp-schema`;
CREATE TABLE IF NOT EXISTS `emp-schema`.`employee` (
    `em_id` INT NOT NULL AUTO_INCREMENT,
    `em_first_name` VARCHAR(100) NULL,
    `em_last_name` VARCHAR(100) NULL,
    `em_date_of_birth` DATE NULL,
    `em_salary` DECIMAL(20) NULL,
    `em_department_name` VARCHAR(100) NULL,
    `em_de_id` INT NULL,
    PRIMARY KEY (`em_id`),
    CONSTRAINT `em_de_fk` FOREIGN KEY (`em_de_id`)
        REFERENCES `emp-schema`.`department` (`de_id`)
        ON DELETE NO ACTION ON UPDATE NO ACTION
)  ENGINE=INNODB;
  
  
  
SELECT 
    *
FROM
    employee;
  
 
  
CREATE TABLE IF NOT EXISTS `emp-schema`.`department` (
    `de_id` INT NOT NULL AUTO_INCREMENT,
    `de_address` VARCHAR(100) NULL,
    `de_city` VARCHAR(100) NULL,
    `de_pin_code` DECIMAL NULL,
    `de_contact_number` DECIMAL NULL,
    PRIMARY KEY (`de_id`)
)  ENGINE=INNODB;
    
    
    

  
  
SELECT 
    *
FROM
    `emp-schema`.`department`;
  drop schema `emp-schema`;
  
  
  
CREATE TABLE IF NOT EXISTS `emp-schema`.`skill` (
    `skill_id` INT NOT NULL AUTO_INCREMENT,
    `skill_name` VARCHAR(100) NULL,
    PRIMARY KEY (`skill_id`)
)  ENGINE=INNODB;
    
SELECT 
    *
FROM
    `skill`;
  
CREATE TABLE IF NOT EXISTS `emp-schema`.`tree` (
    `tree_em_id` INT NOT NULL,
    `tree_skill_id` INT NOT NULL,
    CONSTRAINT `tree_em_id_fk` FOREIGN KEY (`tree_em_id`)
        REFERENCES `emp-schema`.`employee` (`em_id`),
    CONSTRAINT `tree_skill_id_fk` FOREIGN KEY (`tree_skill_id`)
        REFERENCES `emp-schema`.`skill` (`skill_id`)
)  ENGINE=INNODB;
SELECT 
    *
FROM
    tree;
  
  
    
  