/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/11/10 00:23:48                          */
/*==============================================================*/


drop table if exists sys_conpon_table;

drop table if exists sys_goodsDetail_table;

drop table if exists sys_goods_table;

drop table if exists sys_orders_table;

drop table if exists sys_receive_addr;

drop table if exists sys_score_table;

drop table if exists sys_user_table;

/*==============================================================*/
/* Table: sys_conpon_table                                      */
/*==============================================================*/
create table sys_conpon_table
(
   id                   varchar(32) not null,
   userId               varchar(32),
   code                 int,
   came                 varchar(32),
   money                float,
   sale                 float,
   primary key (id)
);

/*==============================================================*/
/* Table: sys_goodsDetail_table                                 */
/*==============================================================*/
create table sys_goodsDetail_table
(
   id                   varchar(32) not null,
   goodsId              varchar(32) not null,
   goodsDetail          varchar(2048),
   goodsImgPath         varchar(2048),
   primary key (id)
);

alter table sys_goodsDetail_table comment '商品详情';

/*==============================================================*/
/* Table: sys_goods_table                                       */
/*==============================================================*/
create table sys_goods_table
(
   id                   varchar(32) not null,
   goodsName            varchar(256),
   goodsTypeCode        int,
   goodsTypeName        varchar(128),
   goodsDetail          varchar(1024),
   goodsFrom            varchar(128),
   goodsPrice           float,
   goodsImgPath         varchar(256),
   goodsStock           int,
   goodsSales           int,
   used                 int,
   primary key (id)
);

alter table sys_goods_table comment '包含商品图片地址';

/*==============================================================*/
/* Table: sys_orders_table                                      */
/*==============================================================*/
create table sys_orders_table
(
   id                   varchar(32) not null,
   ordersNum            varchar(32),
   userId               varchar(32),
   goodsId              varchar(32),
   goodsNum             int,
   goodsPrice           float,
   goodsMoney           float,
   ordersDate           date,
   payDate              date,
   deliverDate          date,
   receiveDate          date,
   consignee            varchar(32),
   phone                varchar(11),
   address              varchar(128),
   used                 int,
   primary key (id)
);

/*==============================================================*/
/* Table: sys_receive_addr                                      */
/*==============================================================*/
create table sys_receive_addr
(
   ID                   varchar(32) not null,
   用户ID                 varchar(32),
   name                 varchar(32),
   phone                varchar(11),
   address              varchar(128),
   primary key (ID)
);

/*==============================================================*/
/* Table: sys_score_table                                       */
/*==============================================================*/
create table sys_score_table
(
   id                   varchar(32) not null,
   userId               varchar(32),
   goodsId              varchar(32),
   evaluate             varchar(1024),
   score                float,
   used                 int,
   primary key (id)
);

/*==============================================================*/
/* Table: sys_user_table                                        */
/*==============================================================*/
create table sys_user_table
(
   id                   varchar(32) not null,
   loginName            varchar(64),
   loginPassword        varchar(64),
   userName             varchar(64),
   realName             varchar(64),
   identityNum          varchar(18),
   userAddr             varchar(128),
   userSexCode          varchar(1),
   userSexName          varchar(8),
   userPhone            varchar(11),
   userMoney            float,
   userMonetary         float,
   userImgPath          varchar(256),
   userCreateDate       date,
   primary key (id)
);

