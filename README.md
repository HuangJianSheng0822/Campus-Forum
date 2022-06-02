# 简介
## 背景
每所高校都有这样一个团体——帮帮酱，通过它，你可以你给即将迈入学校大门的新生介绍母校之美，可以给同学院、专业的学弟学妹讲解你的学习经历，可以说出你的生活遭遇，可以给心爱的母校留下最后的祝福，可以寻找丢失的东西，在这里，你甚至可以对你喜欢的人表白。然而，传统的方式为你将所要表达的信息发给帮帮酱，然后帮帮酱通过qq空间这一社交平台发布，众所周知，qq空间会随着有新内容的发布，旧的内容会及其不易寻找，同时他具有空间局限性，只能好友查收。
因此我们设计了校悦站，在这里，你可以自己发布各种合法内容，同时它不像百度贴吧具有很多广告。我们设计了多个模块，在吐槽专区，你可以寻找志同道合的朋友，也可以吐露你的心声；赏金猎人包含二手交易和跑腿交易两项内容里，二手交易这一栏中，你可以发布你不需要但对其他人很有用的物品，特别是旧书，在跑腿交易里，你可以通过帮助他人而赚取一定的金钱，在表白墙里，你可以吐露自己的任何心声，给自己加油打气，给喜欢的人表白；当你丢了东西或者捡到东西时，你可以在找主人这栏里寻找你所丢失的物品或者寻找你所捡到东西的主人；总之，他包含很多功能
## 关键技术
该项目采用前后端分离模式，后端使用了ssm框架，前端使用了html,css,js,jquery,ui库采用了layui，并且采用了百度富文本编辑器，前端通过ajax向后端请求数据，后端返回数据均为json数据
## 项目截图
![image](https://user-images.githubusercontent.com/91519206/171579279-6eb4e2bb-9623-47f5-9d47-a6e612d4d5cf.png)
![image](https://user-images.githubusercontent.com/91519206/171579343-a41a1f2f-bd4f-4fb6-9566-2f556563b205.png)
![image](https://user-images.githubusercontent.com/91519206/171579413-1810901d-4968-48f8-9744-7c7f7daf9af2.png)
![image](https://user-images.githubusercontent.com/91519206/171579502-1fc9cc34-15af-4b68-b96d-a5cf06578ddf.png)
![image](https://user-images.githubusercontent.com/91519206/171579555-af0119dc-f11b-4a08-929f-564e2376d3d8.png)
# 数据库

```
/******************************************/
/*   DatabaseName = test   */
/*   TableName = action   */
/******************************************/
CREATE TABLE `action` (
  `con_id` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '跑腿任务id',
  `user_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户id',
  `begin_time` datetime NOT NULL COMMENT '发布日期',
  `people` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '接单的人',
  `people_time` datetime DEFAULT NULL COMMENT '接单的时间',
  `end_time` datetime DEFAULT NULL COMMENT '完成时间',
  `kind` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '类型',
  `description` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '描述',
  `money` double(3,1) NOT NULL COMMENT '金额',
  `expected_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '期望时间',
  `address_count` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址索引',
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='跑腿行为表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = address   */
/******************************************/
CREATE TABLE `address` (
  `address_count` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址索引',
  `user_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户id',
  `user_name` varchar(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '联系人姓名',
  `user_number` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '联系方式',
  `user_address` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址',
  KEY `id` (`address_count`,`user_id`) USING BTREE,
  KEY `indexName` (`address_count`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='地址表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = blog   */
/******************************************/
CREATE TABLE `blog` (
  `con_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '内容id',
  `user_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户id',
  `date` datetime NOT NULL COMMENT '发布日期',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '标题',
  `image` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '封面',
  `content` text CHARACTER SET utf8 COLLATE utf8_bin COMMENT '具体内容',
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='吐槽表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = comment   */
/******************************************/
CREATE TABLE `comment` (
  `con_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所要评论的内容id',
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `user_comment` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户评论'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = lostpropertysearch   */
/******************************************/
CREATE TABLE `lostpropertysearch` (
  `id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '失物id',
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  `date` datetime NOT NULL COMMENT '发布日期',
  `status` int(1) NOT NULL COMMENT '状态',
  `type` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型',
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址',
  `contant` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `lost_time` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '丢失时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='失物寻找表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = love   */
/******************************************/
CREATE TABLE `love` (
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `love_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容id',
  `date` datetime NOT NULL COMMENT '发布日期',
  `is_anonymous` int(1) NOT NULL COMMENT '是否匿名',
  `description` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  PRIMARY KEY (`love_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='表白墙表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = revert   */
/******************************************/
CREATE TABLE `revert` (
  `conId` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '失物id',
  `userId` varchar(36) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户id',
  `date` datetime NOT NULL COMMENT '发布日期',
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '类型',
  `pickup_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '拾取图片',
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地址',
  `contant` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '内容',
  `image` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '图片',
  `description` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '内容',
  PRIMARY KEY (`conId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='拾取失物表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = rewardmoney   */
/******************************************/
CREATE TABLE `rewardmoney` (
  `con_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容id',
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '封面',
  `price` double(3,1) NOT NULL COMMENT '金额',
  `kind` int(1) NOT NULL COMMENT '类型',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `begin_date` datetime NOT NULL COMMENT '发布日期',
  `correct` int(1) NOT NULL COMMENT '审核是否通过',
  `recipient` int(6) DEFAULT NULL COMMENT '接受的人',
  `end_date` datetime DEFAULT NULL COMMENT '结束日期',
  PRIMARY KEY (`con_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='二手交易表'
;

/******************************************/
/*   DatabaseName = test   */
/*   TableName = user   */
/******************************************/
CREATE TABLE `user` (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `password` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `school` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学校',
  PRIMARY KEY (`id`,`school`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表'
;

```
