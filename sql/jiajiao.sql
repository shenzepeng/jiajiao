/*
Navicat MySQL Data Transfer

Source Server         : http://47.102.113.146
Source Server Version : 50557
Source Host           : 47.102.113.146:3306
Source Database       : jiajiao

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2019-04-23 22:34:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `teacher_id` bigint(20) NOT NULL,
  `time` varchar(255) DEFAULT NULL,
  `words` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '梅女士', '2', '2019-02-18 20:44', '不错啊');
INSERT INTO `comment` VALUES ('2', '梅女士', '2', '2019-02-18 20:45', ' 下次继续让你带我们孩子');
INSERT INTO `comment` VALUES ('3', '', '2', '2019-02-18 21:24', '不错');
INSERT INTO `comment` VALUES ('4', '', '2', '2019-02-18 21:24', '挺好的');
INSERT INTO `comment` VALUES ('5', '', '2', '2019-02-18 21:25', '明年');
INSERT INTO `comment` VALUES ('6', '', '2', '2019-02-18 21:25', '我朋友咯');
INSERT INTO `comment` VALUES ('7', '', '2', '2019-02-18 21:25', '你只需要');
INSERT INTO `comment` VALUES ('8', '', '2', '2019-02-18 21:26', '了的');
INSERT INTO `comment` VALUES ('9', '梅女士', '4', '2019-02-18 21:28', '还可以');
INSERT INTO `comment` VALUES ('10', '梅女士', '4', '2019-02-18 21:29', '挺好的');
INSERT INTO `comment` VALUES ('11', '', '2', '2019-02-18 21:32', '我以前');
INSERT INTO `comment` VALUES ('12', '梅女士', '4', '2019-02-18 21:33', '下挖去');
INSERT INTO `comment` VALUES ('13', '梅女士', '4', '2019-02-18 21:33', '崇文区·1');
INSERT INTO `comment` VALUES ('14', '', '2', '2019-02-18 21:35', '一下');
INSERT INTO `comment` VALUES ('15', '', '2', '2019-02-18 21:35', '娱乐无极限');
INSERT INTO `comment` VALUES ('16', '', '2', '2019-02-18 21:35', '重口味心理学');
INSERT INTO `comment` VALUES ('17', '', '2', '2019-02-18 21:35', '一下');
INSERT INTO `comment` VALUES ('18', '', '2', '2019-02-18 21:35', '能力有限');
INSERT INTO `comment` VALUES ('19', '', '2', '2019-02-18 21:36', '一下咯');
INSERT INTO `comment` VALUES ('20', '', '2', '2019-02-18 21:36', '娱乐无极限');
INSERT INTO `comment` VALUES ('21', '', '2', '2019-02-18 21:39', '下挖去');
INSERT INTO `comment` VALUES ('22', '', '3', '2019-02-18 21:49', '一下咯');
INSERT INTO `comment` VALUES ('23', '', '3', '2019-02-18 21:49', '还以为');
INSERT INTO `comment` VALUES ('24', '', '3', '2019-02-18 21:51', '据统计');
INSERT INTO `comment` VALUES ('25', '', '3', '2019-02-18 21:51', '看起来');
INSERT INTO `comment` VALUES ('26', '', '4', '2019-02-18 21:54', 'dwq');
INSERT INTO `comment` VALUES ('27', '', '4', '2019-02-18 21:54', 'dwq');
INSERT INTO `comment` VALUES ('28', '', '3', '2019-02-18 21:53', '你那里');
INSERT INTO `comment` VALUES ('29', '', '4', '2019-02-18 21:54', '666');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `needs` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '111', '汉中市汉台区', '20', '男', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1577759731,3108671782&fm=27&gp=0.jpg', '王先生', '  需要一位高中数学家教', '111', '13645698678', '80/天', ' 2019-2-18 19:35');
INSERT INTO `student` VALUES ('2', '111', '汉中市汉台区', '20', '男', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3174587418,3091728117&fm=111&gp=0.jpg', ' 王先生', ' 需要数学家教一个', '111', '1524598322', '100/天', '2019-2-18 19:55');
INSERT INTO `student` VALUES ('3', '222', '汉中市汉台区', '20', '男', 'http://47.102.113.146/sringmvcphoto-1.0-SNAPSHOT/upload/b4353136-6877-4bea-a6be-a662fb4fe412.jpg', '汪先生', '数学家教', '222', '4561237891', '100/天', '2019-02-18 20:27');
INSERT INTO `student` VALUES ('4', '666', '汉中市汉台区', '20', '男', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3174587418,3091728117&fm=111&gp=0.jpg', ' 李先生', ' 需要数学家教一个', '666', '1524598322', '100/天', '2019-2-18 19:55');
INSERT INTO `student` VALUES ('5', ' 222', '汉中市', '20', '男', 'https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1149405025,2223252423&fm=179&app=42&f=PNG?w=121&h=140', '  李先生', ' 需要初中数学老师', '222', '15289457869', '1500/月', '2019-2-18');
INSERT INTO `student` VALUES ('6', ' 222', '汉中市', '20', '男', 'https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1149405025,2223252423&fm=179&app=42&f=PNG?w=121&h=140', '  李先生', ' 需要初中数学老师', '222', '15289457869', '1500/月', '2019-2-18');
INSERT INTO `student` VALUES ('7', '555', '汉中市', '22', '女', 'http://47.102.113.146/sringmvcphoto-1.0-SNAPSHOT/upload/560f8c11-309f-45c6-b1d0-2a9836dd5a04.jpg', '梅女士', '初中数学', '555', '18796543265', '100/天', '2019-02-18 20:44');

-- ----------------------------
-- Table structure for `student_publish`
-- ----------------------------
DROP TABLE IF EXISTS `student_publish`;
CREATE TABLE `student_publish` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `class_room` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student_publish
-- ----------------------------
INSERT INTO `student_publish` VALUES ('1', '汉中市汉台区', '20', '  需要一位高中数学家教', '男', '13645698678', '80/天', '  需要一位高中数学家教', ' 2019-2-18 19:35');
INSERT INTO `student_publish` VALUES ('2', '', '', '', '', '', '', '', '');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `career` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `family_teacher_experience` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('5', '111', '2019-02-15', '老师', '喜欢从事教学工作', '2年数学家教经验', '男', 'http://47.102.113.146/sringmvcphoto-1.0-SNAPSHOT/upload/dbf802b3-c7a0-486d-ad2b-4659f0e49b39.jpg', '王先生', '222', '1520456620', '100/天', '高中数学·', '2019-02-18 20:24');
INSERT INTO `teacher` VALUES ('6', '  777', '1896-10-23', '老师', '热爱教学', '2年英语家教经验', '男', 'http://60.208.18.178:40001/Uploads/course/5be39b18ebc90.png', '张强', '777', '18975641269', '100/天', '英语', ' 2019-2-18 20::50');
INSERT INTO `teacher` VALUES ('7', '222', '2019-02-07', '老师', '热爱教学行业', '2年初中物理家教经验', '男', 'http://47.102.113.146/sringmvcphoto-1.0-SNAPSHOT/upload/47627e6d-49ee-488f-9daf-983fee16ef0d.jpg', '李先生', '222', '152252699', '2000/月', '物理', '2019-02-18 20:42');

-- ----------------------------
-- Table structure for `teacher_publish`
-- ----------------------------
DROP TABLE IF EXISTS `teacher_publish`;
CREATE TABLE `teacher_publish` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` varchar(255) DEFAULT NULL,
  `degree` varchar(255) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of teacher_publish
-- ----------------------------
INSERT INTO `teacher_publish` VALUES ('2', null, '老师', '2年初中物理家教经验', '男', '152252699', '2000/月', '物理', '2019-02-18 20:42');
INSERT INTO `teacher_publish` VALUES ('3', null, '老师', '2年数学家教经验', '男', '1520456620', '100/天', '高中数学·', '2019-02-18 20:24');
INSERT INTO `teacher_publish` VALUES ('4', null, '老师', '2年数学家教经验', '男', '1520456620', '100/天', '高中数学·', '2019-02-18 20:24');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('9', '111', '222', 'teacher');
INSERT INTO `user` VALUES ('10', '222', '222', 'student');
INSERT INTO `user` VALUES ('11', '888', '888', 'administrator');
INSERT INTO `user` VALUES ('12', '222', '222', 'teacher');
INSERT INTO `user` VALUES ('13', '555', '555', 'student');
INSERT INTO `user` VALUES ('14', '1518064032', '123', 'student');
