/*建表*/
CREATE TABLE `book` (
	`book_id` INT(16) NOT NULL AUTO_INCREMENT COMMENT '编号',
	`book_name` VARCHAR(16) NOT NULL COMMENT '书名',
	`type1` INT(2) NOT NULL COMMENT '学术类',
	`type2` INT(2) NOT NULL COMMENT '文学类',
	`type3` INT(2) NOT NULL COMMENT '心理类',
	`type4` INT(2) NOT NULL COMMENT '社会科学类',
	`if_borrow` INT(4) NOT NULL COMMENT '是否被借阅',
	`history` VARCHAR(512) NOT NULL COMMENT '借阅历史',
	PRIMARY KEY(`book_id`)
)ENGINE = INNODB DEFAULT CHARSET=utf8

CREATE TABLE `student` (
	`student_id` INT(16) NOT NULL AUTO_INCREMENT COMMENT '学号',
	`student_psw` VARCHAR(16) NOT NULL COMMENT '密码',
	`borrow_list` VARCHAR(128) COMMENT '在借列表',
	`borrow_history` VARCHAR(512) COMMENT '借阅历史',
	PRIMARY KEY(`student_id`)
)ENGINE = INNODB DEFAULT CHARSET=utf8

CREATE TABLE `teacher` (
	`teacher_id` INT(16) NOT NULL AUTO_INCREMENT COMMENT '工号',
	`teacher_psw` VARCHAR(16) NOT NULL COMMENT '密码',
	`borrow_list` VARCHAR(128) COMMENT '在借列表',
	`borrow_history` VARCHAR(512) COMMENT '借阅历史',
	PRIMARY KEY(`teacher_id`)
)ENGINE = INNODB DEFAULT CHARSET=utf8

CREATE TABLE `admin` (
	`admin_id` INT(16) NOT NULL AUTO_INCREMENT COMMENT '账号',
	`admin_psw` VARCHAR(16) NOT NULL COMMENT '密码',
	PRIMARY KEY(`admin_id`)
)ENGINE = INNODB DEFAULT CHARSET=utf8

/*单条插入*/
INSERT INTO teacher (teacher_psw, borrow_list, borrow_history) VALUES (123456, "《Java程序语言设计》", "教师201910098239于2020-10-28借阅")
INSERT INTO admin (admin_psw) VALUES (123456)
/*批量插入*/
INSERT INTO
book (book_id, book_name, type1, type2, type3, type4, if_borrow, history)
VALUES
(2, "《数据结构基础》", 1, 0, 0, 0, 1, "学生201910098239于2020-10-28借阅"),
(3, "《算法导论》", 1, 0, 0, 0, 1, "学生201910098239于2020-10-28借阅"),
(4, "《TCP/IP图解》", 1, 0, 0, 0, 1, "学生201910098239于2020-10-28借阅"),
(5, "《概率论与数理统计》", 1, 0, 0, 0, 1, "学生201910098239于2020-10-28借阅"),
(6, "《高等数学》", 1, 0, 0, 0, 1, "学生201910098239于2020-10-28借阅"),
(7, "《离散数学》", 1, 0, 0, 0, 1, "学生201910098239于2020-10-28借阅");
INSERT INTO
student (student_psw, borrow_list, borrow_history)
VALUES
(123456, "《算法导论》", "于2020-10-28借阅《算法导论》"),
(123456, "《TCP/IP图解》", "于2020-10-28借阅《TCP/IP图解》"),
(123456, "《高等数学》", "于2020-10-28借阅《高等数学》"),
(123456, "《概率论与数理统计》", "于2020-10-28借阅《概率论与数理统计》"),
(123456, "《离散数学》", "于2020-10-28借阅《离散数学》");