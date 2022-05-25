/*
Navicat MySQL Data Transfer

Source Server         : Flowers
Source Server Version : 80025
Source Host           : localhost:3306
Source Database       : jetbrain

Target Server Type    : MYSQL
Target Server Version : 80025
File Encoding         : 65001

Date: 2022-05-25 23:41:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for application
-- ----------------------------
DROP TABLE IF EXISTS `application`;
CREATE TABLE `application` (
  `job` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `record` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `isMain` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `nation` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `birth` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `school` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `webside` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `isN` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `isM` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `zhengming` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `yanzheng` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `zhushi` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `ageless` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `isAllow` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `agree` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of application
-- ----------------------------
INSERT INTO `application` VALUES ('我是学生', '大学生', '是', '1684757099@qq.com', '申亚威', '中国大陆', '1999-10-27', '安徽三联学院', 'sanlian.com', '有', '是', 'xxx.png', 'xxx.stu.com', '3DF34HU366J5I6H346J35', '我是中国人', '否', '同意', '同意', '1');
INSERT INTO `application` VALUES ('我是学生', '大学生', '是', 'xcvd@zz.com', '立袖子', '乌克兰', '1996-12-01', '安徽三联学院', 'sanlian.com', '有', '是', '', 'xxx.stu.com', '3DF34HU366J5I6H346J35', '我是学生', '否', '同意', '同意', '17');
INSERT INTO `application` VALUES ('我是学生', '硕士研究生/博士研究生', '否', 'acacaz@zz.com', '立新兰', '中国大陆', '2016-08-25', '安徽三联学院', 'sanlian.com', '无', '否', 'homework.html', 'xxx.stu.com', '3DF34HU366J5I6xxxxxxx', '我是三联人', '否', '同意', '同意', '18');
