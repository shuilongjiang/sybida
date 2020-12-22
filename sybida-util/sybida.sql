/*
 Navicat Premium Data Transfer

 Source Server         : ssa
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : jianghaoyu.world:3306
 Source Schema         : sybida

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 22/12/2020 15:56:43
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
) ENGINE = InnoDB AUTO_INCREMENT = 60 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sybida_company
-- ----------------------------
DROP TABLE IF EXISTS `sybida_company`;
CREATE TABLE `sybida_company`  (
  `company_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `company_user_id` int(11) NULL DEFAULT NULL,
  `company_mark_id` int(10) UNSIGNED NULL DEFAULT NULL,
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
  `company_picture` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_is_view` tinyint(3) UNSIGNED NULL DEFAULT NULL,
  `company_alter_time` datetime(0) NULL DEFAULT NULL,
  `company_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`company_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sybida_company_mark
-- ----------------------------
DROP TABLE IF EXISTS `sybida_company_mark`;
CREATE TABLE `sybida_company_mark`  (
  ` mark_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `mark_teacher_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mark_ercode_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mark_alter_date` datetime(0) NULL DEFAULT NULL,
  `mark_null1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mark_null2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (` mark_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sybida_news
-- ----------------------------
DROP TABLE IF EXISTS `sybida_news`;
CREATE TABLE `sybida_news`  (
  `news_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `news_user_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `news_test` varchar(800) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_picture` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_send_time` datetime(0) NULL DEFAULT NULL,
  `news_read_people` int(10) UNSIGNED NULL DEFAULT NULL,
  `news_alter_time` datetime(0) NULL DEFAULT NULL,
  `news_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `news_null2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`news_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sybida_offer
-- ----------------------------
DROP TABLE IF EXISTS `sybida_offer`;
CREATE TABLE `sybida_offer`  (
  `offer_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `offer_student_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `offer_company` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `offer_contact` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `offer_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `offer_study_id` int(11) NULL DEFAULT NULL,
  `offer_datetime` datetime(0) NULL DEFAULT NULL,
  `offer_practice_salary` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `offer_really_salary` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `offer_hiredate` datetime(0) NULL DEFAULT NULL,
  `offer_alter_time` datetime(0) NULL DEFAULT NULL,
  `offer_null1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `offer_null2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`offer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 149 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 81 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sybida_vitae_evaluate
-- ----------------------------
DROP TABLE IF EXISTS `sybida_vitae_evaluate`;
CREATE TABLE `sybida_vitae_evaluate`  (
  `vitae_evaluate_id` int(10) UNSIGNED NOT NULL,
  `vitae_evaluate_comment` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_evaluate_user_id` int(10) UNSIGNED NULL DEFAULT NULL,
  `vitae_evaluate_picture` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_evaluate_time` datetime(0) NULL DEFAULT NULL,
  `vitae_evaluate_alter_time` datetime(0) NULL DEFAULT NULL,
  `vitae_evaluate_null1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vitae_evaluate_null2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
