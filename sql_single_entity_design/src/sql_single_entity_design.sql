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