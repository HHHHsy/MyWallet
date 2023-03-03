/*
SQLyog Community v13.1.4  (64 bit)
MySQL - 8.0.25 : Database - demo_wallet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo_wallet` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `demo_wallet`;

/*Table structure for table `details` */

DROP TABLE IF EXISTS `details`;

CREATE TABLE `details` (
  `d_id` int NOT NULL AUTO_INCREMENT,
  `wallet_id` varchar(255) NOT NULL,
  `change_amount` decimal(10,2) NOT NULL,
  `status` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `remark` varchar(32) NOT NULL,
  `balance` decimal(10,2) NOT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `details` */

insert  into `details`(`d_id`,`wallet_id`,`change_amount`,`status`,`remark`,`balance`,`create_time`) values 
(1,'XXikun121',200.02,'0','购买xx',4102.40,'2023-03-03 11:40:41'),
(2,'XXikun121',200.01,'0','购买xx',3902.39,'2023-03-03 11:43:54'),
(3,'XXikun121',200.01,'收入','购买xx',3702.38,'2023-03-03 12:08:24'),
(4,'XXikun121',200.01,'支出','购买xx',3502.37,'2023-03-03 12:15:11'),
(5,'XXikun121',100.00,'收入','充值100',3602.37,'2023-03-03 12:16:13'),
(6,'XXikun121',100.00,'收入','充值100',3702.37,'2023-03-03 12:16:35'),
(7,'XXikun121',100.00,'收入','充值100',3802.37,'2023-03-03 03:58:36'),
(8,'XXikun121',100.00,'收入','充值100',3902.37,'2023-03-03 03:58:57'),
(9,'XXikun121',10.00,'支出','消费10元',3892.37,'2023-03-03 04:00:04'),
(10,'XXikun121',10.00,'支出','消费10元',3882.37,'2023-03-03 04:00:07');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) NOT NULL,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`user_id`,`name`,`password`) values 
(1,'Hsy12345','黄先生','123456');

/*Table structure for table `wallet` */

DROP TABLE IF EXISTS `wallet`;

CREATE TABLE `wallet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `wallet_id` varchar(255) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  `money` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `wallet` */

insert  into `wallet`(`id`,`wallet_id`,`user_id`,`money`) values 
(1,'XXikun121','Hsy12345',3882.37);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
