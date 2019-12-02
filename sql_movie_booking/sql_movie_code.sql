-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`cinema_hall`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cinema_hall` (
  `ch_id` INT NOT NULL,
  `ch_name` VARCHAR(45) NULL,
  `ch_capacity` DECIMAL(20) NULL,
  `ch_city` VARCHAR(45) NULL,
  PRIMARY KEY (`ch_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`seat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`seat` (
  `seat_id` INT NOT NULL AUTO_INCREMENT,
  `seat_number` INT NULL,
  PRIMARY KEY (`seat_id`),
  CONSTRAINT `seat_id`
    FOREIGN KEY (`seat_id`)
    REFERENCES `mydb`.`cinema_hall` (`ch_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`movie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`movie` (
  `movie_id` INT NOT NULL AUTO_INCREMENT,
  `movie_release_date` DATE NULL,
  `movie_running_time` DECIMAL(45) NULL,
  `movie_rating` DECIMAL(45) NULL,
  `movie_genre` VARCHAR(45) NULL,
  `movie_language` VARCHAR(45) NULL,
  PRIMARY KEY (`movie_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`schedule_show`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`schedule_show` (
  `show_id` INT NOT NULL AUTO_INCREMENT,
  `show_ch_id` INT NOT NULL,
  `show_movie_id` INT NOT NULL,
  `show_time` TIME(40) NOT NULL,
  `show_active` VARCHAR(45) NULL,
  PRIMARY KEY (`show_id`),
  INDEX `show_ch_id_idx` (`show_ch_id` ASC),
  INDEX `show_movie_id_idx` (`show_movie_id` ASC),
  CONSTRAINT `show_ch_id`
    FOREIGN KEY (`show_ch_id`)
    REFERENCES `mydb`.`cinema_hall` (`ch_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `show_movie_id`
    FOREIGN KEY (`show_movie_id`)
    REFERENCES `mydb`.`movie` (`movie_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`bookings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`bookings` (
  `bookings_id` INT NOT NULL AUTO_INCREMENT,
  `bookings_ticket` INT NOT NULL,
  `bookings_date_id` INT NOT NULL,
  `bookings_show_date_id` INT NOT NULL,
  `bookings_seat_id` INT NOT NULL,
  PRIMARY KEY (`bookings_id`, `bookings_ticket`, `bookings_date_id`, `bookings_show_date_id`, `bookings_seat_id`),
  INDEX `bookings_seat_id_idx` (`bookings_seat_id` ASC),
  INDEX `bookings_ticket_idx` (`bookings_ticket` ASC),
  CONSTRAINT `bookings_seat_id`
    FOREIGN KEY (`bookings_seat_id`)
    REFERENCES `mydb`.`seat` (`seat_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `bookings_ticket`
    FOREIGN KEY (`bookings_ticket`)
    REFERENCES `mydb`.`schedule_show` (`show_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
