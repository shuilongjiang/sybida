/*
 Navicat Premium Data Transfer

 Source Server         : yucheng
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : jianghaoyu.world:3306
 Source Schema         : sybida

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 02/12/2020 19:40:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sybida_audition
-- ----------------------------
DROP TABLE IF EXISTS `sybida_audition`;
CREATE TABLE `sybida_audition`  (
  `audition_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `audition_student_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `audition_site` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `audition_time` datetime(0) NULL DEFAULT NULL,
  `audition_situation` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `audition_study_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `audition_finish` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `audition_firm` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `audition_alter_time` datetime(0) NULL DEFAULT NULL,
  `audition_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `audition_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`audition_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_audition
-- ----------------------------
INSERT INTO `sybida_audition` VALUES (1, 4, '苏州', '2020-12-17 19:32:52', NULL, 1, NULL, '中国联通', NULL, NULL, NULL);
INSERT INTO `sybida_audition` VALUES (2, 8, '苏州', '2020-12-16 19:34:19', NULL, 1, NULL, '中国移动', NULL, NULL, NULL);
INSERT INTO `sybida_audition` VALUES (3, 9, '北京', '2021-01-01 19:35:08', NULL, 2, NULL, '阿里', NULL, NULL, NULL);
INSERT INTO `sybida_audition` VALUES (4, 10, '苏州', '2020-12-09 19:35:30', NULL, 1, NULL, '网易', NULL, NULL, NULL);
INSERT INTO `sybida_audition` VALUES (5, 12, '新疆', '2020-12-02 19:36:00', NULL, 2, NULL, '快手', NULL, NULL, NULL);
INSERT INTO `sybida_audition` VALUES (6, 13, '北京', '2020-12-23 19:36:26', NULL, 2, NULL, '搜狐', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sybida_class
-- ----------------------------
DROP TABLE IF EXISTS `sybida_class`;
CREATE TABLE `sybida_class`  (
  `class_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `class_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `class_teach_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `class_manager_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `class_study_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `class_time` datetime(0) NULL DEFAULT NULL,
  `class_is_graduate` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `class_alter_time` datetime(0) NULL DEFAULT NULL,
  `class_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `class_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`class_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_class
-- ----------------------------
INSERT INTO `sybida_class` VALUES (1, '01', 1, 2, 1, '2020-11-04 22:31:47', 1, '2020-11-03 22:31:56', NULL, NULL);
INSERT INTO `sybida_class` VALUES (2, '02', 3, 2, 1, '2020-11-04 22:33:57', 1, '2020-11-18 22:34:00', NULL, NULL);
INSERT INTO `sybida_class` VALUES (3, '03', 1, 5, 2, '2020-11-04 22:34:43', 0, '2020-11-04 22:34:47', NULL, NULL);
INSERT INTO `sybida_class` VALUES (4, '04', 1, 5, 2, '2020-11-03 22:43:53', 0, '2020-11-11 22:43:56', NULL, NULL);

-- ----------------------------
-- Table structure for sybida_company
-- ----------------------------
DROP TABLE IF EXISTS `sybida_company`;
CREATE TABLE `sybida_company`  (
  `company_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `company_name` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_end_time` datetime(0) NULL DEFAULT NULL,
  `company_start_time` datetime(0) NULL DEFAULT NULL,
  `company_study_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `company_web` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_require` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_salary` int(10) UNSIGNED NULL DEFAULT NULL,
  `company_mailbox` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_wechat` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_introduce` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_user_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `company_picture` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_is_view` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `company_alter_time` datetime(0) NULL DEFAULT NULL,
  `company_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`company_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_company
-- ----------------------------
INSERT INTO `sybida_company` VALUES (1, '阿里巴巴', '2020-11-19 22:12:37', NULL, NULL, NULL, '北京', '态度良好', 10000, '123456@qq.com', NULL, NULL, '大公司，很厉害', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (2, '腾讯', '2020-11-04 22:12:40', NULL, NULL, NULL, '深圳', '态度良好', 20000, '154664@qq.com', NULL, NULL, '大公司，厉害', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (3, '字节跳动', '2020-11-01 22:12:43', NULL, NULL, NULL, '上海', '态度好', 50000, '456133@qq.com', NULL, NULL, '大公司厉害', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (4, '百度', '2020-12-05 22:12:46', NULL, NULL, NULL, '北京', '素质好', 60000, '5466123@qq.com', NULL, NULL, '大厂厉害', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (5, '中国联通', '2020-11-06 22:12:50', NULL, NULL, NULL, '苏州', '大专以上学历', 20000, '646546@qq.com', NULL, NULL, '国企厉害', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (6, '中国移动', '2020-10-30 22:12:53', NULL, NULL, NULL, '苏州', '大专以上学历', 30000, '63355@qq.com', NULL, NULL, '国企厉害', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (7, '网易', '2020-11-03 22:12:56', NULL, NULL, NULL, '苏州', '大专以上学历', 50000, '64664123@163.com', NULL, NULL, '大厂大公司', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (8, '美团', '2020-11-22 22:12:59', NULL, NULL, NULL, '重庆', '大专以上学历', 30000, '645465@qq.com', NULL, NULL, '工资高待遇好', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (9, '快手', '2020-11-14 22:13:03', NULL, NULL, NULL, '新疆', '大专以上学历', 10000, '6794133@126.com', NULL, NULL, '好公司五险一金', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (10, '抖音', '2020-11-04 22:13:07', NULL, NULL, NULL, '黑龙江', '大专以上学历', 10000, '8465454@126.com', NULL, NULL, '好公司前景好', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (11, '谷歌', '2020-11-04 22:15:28', NULL, NULL, NULL, '洛杉矶', '大专以上学历，大专优先', 5000, '6454656@126.com', NULL, NULL, '外国公司好', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_company` VALUES (12, '搜狐', '2020-11-05 22:17:33', NULL, NULL, NULL, '北京', '大专以上学历', 200000, '445546@126.com', NULL, NULL, '五险一金', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sybida_job
-- ----------------------------
DROP TABLE IF EXISTS `sybida_job`;
CREATE TABLE `sybida_job`  (
  `job_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `job_student_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `job_firm` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `job_contact` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `job_weal` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `job_end_time` datetime(0) NULL DEFAULT NULL,
  `job_study_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `job_picture` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `job_alter_time` datetime(0) NULL DEFAULT NULL,
  `job_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `job_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`job_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_job
-- ----------------------------
INSERT INTO `sybida_job` VALUES (1, 4, '网易', NULL, '五险一金', NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_job` VALUES (2, 8, '腾讯', NULL, '五险一金', NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_job` VALUES (3, 9, '快手', NULL, '五险一金', NULL, 2, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_job` VALUES (4, 10, '百度', NULL, '五险一金', NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_job` VALUES (5, 12, '阿里', NULL, '五险一金', NULL, 2, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_job` VALUES (6, 13, '搜狐', NULL, '五险一金', NULL, 2, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sybida_news
-- ----------------------------
DROP TABLE IF EXISTS `sybida_news`;
CREATE TABLE `sybida_news`  (
  `news_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `news_user_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `news_test` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_picture` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_send_time` datetime(0) NULL DEFAULT NULL,
  `news_read_people` int(10) UNSIGNED NULL DEFAULT NULL,
  `news_alter_time` datetime(0) NULL DEFAULT NULL,
  `news_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`news_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_news
-- ----------------------------
INSERT INTO `sybida_news` VALUES (1, 4, '你好', NULL, '2021-01-08 19:40:29', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_news` VALUES (2, 8, '您好', NULL, '2020-12-25 19:40:52', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_news` VALUES (3, 9, 'hello', NULL, '2020-12-11 19:41:07', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_news` VALUES (4, 10, '你好朋友', NULL, '2020-12-11 19:41:28', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_news` VALUES (5, 12, '666', NULL, '2020-12-24 19:41:49', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_news` VALUES (6, 13, '哦哦可以的', NULL, '2020-12-18 19:42:14', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sybida_receive
-- ----------------------------
DROP TABLE IF EXISTS `sybida_receive`;
CREATE TABLE `sybida_receive`  (
  `receive_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `receive_user_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `receive_is_read` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `receive_alter_time` datetime(0) NULL DEFAULT NULL,
  `receive_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receive_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_receive
-- ----------------------------
INSERT INTO `sybida_receive` VALUES (1, 1, 0, '2020-12-03 19:42:42', NULL, NULL);
INSERT INTO `sybida_receive` VALUES (2, 2, 0, '2020-12-18 19:42:55', NULL, NULL);
INSERT INTO `sybida_receive` VALUES (3, 3, 0, '2020-12-24 19:43:05', NULL, NULL);
INSERT INTO `sybida_receive` VALUES (4, 5, 0, '2020-12-31 19:43:13', NULL, NULL);
INSERT INTO `sybida_receive` VALUES (5, 6, 0, '2021-01-07 19:43:21', NULL, NULL);
INSERT INTO `sybida_receive` VALUES (6, 7, 0, '2020-12-30 19:43:31', NULL, NULL);

-- ----------------------------
-- Table structure for sybida_student
-- ----------------------------
DROP TABLE IF EXISTS `sybida_student`;
CREATE TABLE `sybida_student`  (
  `student_id` int(10) UNSIGNED NOT NULL,
  `student_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_sex` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_identity` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_is_graduation` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `student_school` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_specialty` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_wechat` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_mailbox` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_study_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `student_city` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_parent_phone` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_parent_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_urgent` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_phone` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_class_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `student_room` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_photo` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_alter_time` datetime(0) NULL DEFAULT NULL,
  `student_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_student
-- ----------------------------
INSERT INTO `sybida_student` VALUES (4, '崔金亮', '男', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, '15765732494', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_student` VALUES (8, '邓肖屏', '男', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, '13265487156', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_student` VALUES (9, '高圆', '女', NULL, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, '15789456123', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_student` VALUES (10, '江水', '男', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, '13306856062', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_student` VALUES (12, '李君', '男', NULL, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, '13245963541', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_student` VALUES (13, '水龙', '男', NULL, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, '15789456321', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sybida_study
-- ----------------------------
DROP TABLE IF EXISTS `sybida_study`;
CREATE TABLE `sybida_study`  (
  `study_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `study_aspect` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `study_introduce` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_authority` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `study_alter_time` datetime(0) NULL DEFAULT NULL,
  `study_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `study_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`study_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_study
-- ----------------------------
INSERT INTO `sybida_study` VALUES (1, 'java', 'javaee和各种框架', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_study` VALUES (2, 'web前端开发', 'html和css和vue等', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_study` VALUES (3, '大数据', '大数据牛逼', NULL, NULL, NULL, NULL);
INSERT INTO `sybida_study` VALUES (4, '全栈', '全栈牛逼', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sybida_teach
-- ----------------------------
DROP TABLE IF EXISTS `sybida_teach`;
CREATE TABLE `sybida_teach`  (
  `teach_id` int(10) UNSIGNED NOT NULL,
  `teach_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teach_sex` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teach_photo` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teach_study_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `teach_tel` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teach_wechat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teach_qq` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teach_alter_time` datetime(0) NULL DEFAULT NULL,
  `teach_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teach_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`teach_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_teach
-- ----------------------------
INSERT INTO `sybida_teach` VALUES (1, '李军', '男', '\\upload\\userphoto\\1.jpg', 1, '18888888888', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_teach` VALUES (2, '江水龙', '男', '\\upload\\userphoto\\2.jpg', 2, '13345678911', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_teach` VALUES (3, '高媛媛', '女', '\\upload\\userphoto\\3.jpg', 3, '13555353392', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_teach` VALUES (5, '张韬', '男', '\\upload\\userphoto\\4.jpg', 4, '13569874565', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_teach` VALUES (6, '张飞', '男', '\\upload\\userphoto\\2.jpg', 4, '15798789875', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sybida_teach` VALUES (7, '毛则栋', '男', '\\upload\\userphoto\\1.jpg', 4, '18765487987', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sybida_user
-- ----------------------------
DROP TABLE IF EXISTS `sybida_user`;
CREATE TABLE `sybida_user`  (
  `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_phone` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_password` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_note` int(10) UNSIGNED NULL DEFAULT NULL,
  `user_authority` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `user_alter_time` datetime(0) NULL DEFAULT NULL,
  `user_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_user
-- ----------------------------
INSERT INTO `sybida_user` VALUES (1, '李军', '18888888888', '123456', 1, NULL, '2020-12-09 19:55:32', NULL, NULL);
INSERT INTO `sybida_user` VALUES (2, '江水龙', '13345678911', '123456', 0, NULL, '2020-12-17 19:55:35', NULL, NULL);
INSERT INTO `sybida_user` VALUES (3, '高媛媛', '13555353392', '123456', 1, NULL, '2020-12-24 19:55:37', NULL, NULL);
INSERT INTO `sybida_user` VALUES (4, '崔金亮', '15765732494', '123456', 2, NULL, '2020-12-10 19:55:40', NULL, NULL);
INSERT INTO `sybida_user` VALUES (5, '张韬', '13569874565', '123456', 0, NULL, '2020-12-03 19:55:43', NULL, NULL);
INSERT INTO `sybida_user` VALUES (6, '张飞', '15798789875', '123456', 1, NULL, '2020-12-03 19:55:45', NULL, NULL);
INSERT INTO `sybida_user` VALUES (7, '毛则栋', '18765487987', '123456', 1, NULL, '2020-12-10 19:55:48', NULL, NULL);
INSERT INTO `sybida_user` VALUES (8, '邓肖屏', '13265487156', '123456', 2, NULL, '2020-12-18 19:55:52', NULL, NULL);
INSERT INTO `sybida_user` VALUES (9, '高圆', '15789456123', '123456', 2, NULL, '2020-12-17 19:55:54', NULL, NULL);
INSERT INTO `sybida_user` VALUES (10, '江水', '13306856062', '123456', 2, NULL, '2020-12-17 19:55:57', NULL, NULL);
INSERT INTO `sybida_user` VALUES (12, '李君', '13245963541', '123456', 2, NULL, '2020-12-09 19:56:00', NULL, NULL);
INSERT INTO `sybida_user` VALUES (13, '水龙', '15789456321', '123456', 2, NULL, '2020-12-11 19:56:03', NULL, NULL);

-- ----------------------------
-- Table structure for sybida_vitae
-- ----------------------------
DROP TABLE IF EXISTS `sybida_vitae`;
CREATE TABLE `sybida_vitae`  (
  `vitae_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `vitae_student_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_study_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_level` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_is_new` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_url` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_is_read` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `vitae_download_frequency` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_history_frequency` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_alter_time` datetime(0) NULL DEFAULT NULL,
  `vitae_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`vitae_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_vitae
-- ----------------------------
INSERT INTO `sybida_vitae` VALUES (1, 4, 1, '10', 0, NULL, 0, 1, 1, '2020-12-10 19:45:39', NULL, NULL);
INSERT INTO `sybida_vitae` VALUES (2, 8, 1, '9', 0, NULL, 0, 1, 1, '2020-12-17 19:46:19', NULL, NULL);
INSERT INTO `sybida_vitae` VALUES (3, 9, 2, '9', 0, NULL, 0, 1, 1, '2020-12-10 19:47:38', NULL, NULL);
INSERT INTO `sybida_vitae` VALUES (4, 10, 1, '10', 0, NULL, 0, 1, 1, '2020-12-10 19:48:09', NULL, NULL);
INSERT INTO `sybida_vitae` VALUES (5, 12, 2, '9', 0, NULL, 0, 1, 1, '2020-12-02 19:48:35', NULL, NULL);
INSERT INTO `sybida_vitae` VALUES (6, 13, 2, '10', 0, NULL, 0, 1, 1, '2020-12-16 19:49:03', NULL, NULL);

-- ----------------------------
-- Table structure for sybida_vitae_evaluate
-- ----------------------------
DROP TABLE IF EXISTS `sybida_vitae_evaluate`;
CREATE TABLE `sybida_vitae_evaluate`  (
  `vitae_evaluate_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_evaluate_comment` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_evaluate_user_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_evaluate_picture` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_evaluate_time` datetime(0) NULL DEFAULT NULL,
  `vitae_evaluate_alter_time` datetime(0) NULL DEFAULT NULL,
  `vitae_evaluate_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_evaluate_null2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sybida_vitae_evaluate
-- ----------------------------
INSERT INTO `sybida_vitae_evaluate` VALUES (1, '不错', 1, NULL, '2020-12-04 19:51:04', '2020-12-03 19:50:56', NULL, NULL);
INSERT INTO `sybida_vitae_evaluate` VALUES (2, '合理极了', 3, NULL, '2020-12-11 19:51:25', '2020-12-04 19:51:28', NULL, NULL);
INSERT INTO `sybida_vitae_evaluate` VALUES (3, '够用', 6, NULL, '2020-12-02 19:51:42', '2020-12-03 19:51:45', NULL, NULL);
INSERT INTO `sybida_vitae_evaluate` VALUES (4, '合理', 7, NULL, '2020-12-11 19:52:04', '2020-12-03 19:52:07', NULL, NULL);
INSERT INTO `sybida_vitae_evaluate` VALUES (5, '赞赞赞', 1, NULL, '2020-12-24 19:52:25', '2020-12-24 19:52:27', NULL, NULL);
INSERT INTO `sybida_vitae_evaluate` VALUES (6, '6666', 7, NULL, '2020-12-17 19:52:44', '2020-12-17 19:52:47', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
