/*
 Navicat Premium Data Transfer

 Source Server         : 3308
*/

SET NAMES utf8mb4;

DROP DATABASE IF EXISTS `sbs`;
CREATE SCHEMA `sbs`;
USE `sbs`;

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for records
-- ----------------------------
DROP TABLE IF EXISTS `records`;
CREATE TABLE `records`  (
  `id` VARCHAR(32) NOT NULL COMMENT '自增id',
  `count` int(11) DEFAULT 0 COMMENT '次数',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '表' ROW_FORMAT = Dynamic;

-- INSERT INTO `records` VALUES('1927da2878b64b7f82fd8a041beb9935', 0);

SET FOREIGN_KEY_CHECKS = 1;
