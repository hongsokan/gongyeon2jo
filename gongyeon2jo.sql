-- exerd에서 포워드 엔지니어링으로 ddl 생성
-- http://exerd.com:8081/help/index.jsp?topic=%2Fcom.tomato.exerdsam.help%2Fhtml%2Fgettingstarted%2FforwardEngineer%2FforwardEngineerTemp.html

drop table gongyeon2jo.credit;

drop table gongyeon2jo.performance;

drop table gongyeon2jo.review;

drop table gongyeon2jo.ticketing;

drop table gongyeon2jo.user;


create table if not exists gongyeon2jo.performance
(
    performance_id int not null,
    display_id     varchar(50) null,
    display_name   varchar(50) null,
    display_date    varchar(50) null,
    runtime        int null,
    company        varchar(100) null,
    price          varchar(50) null,
    story          varchar(1000) null,
    question    varchar(100) null,
    phone       varchar(100) null,
    announcement varchar(1000) null,
    poster      varchar(200) null
);

create table if not exists gongyeon2jo.ticketing
(
    ticketing_id   varchar(100) null,
    email          varchar(100) null,
    phonenumber    varchar(100) null,
    credit         varchar(100) null,
    left_credit    varchar(100) null,
    performance_id varchar(100) null,
    user_id         varchar(100) null
    );

create table if not exists gongyeon2jo.user
(
    user_id           varchar(100) null,
    email             varchar(100) null,
    name              varchar(100) null,
    password          varchar(100) null,
    birth             date         null,
    phone             varchar(100) null,
    create_dt         date         null,
    modified_dt       date         null,
    verification_code varchar(100) null,
    verify            tinyint      null,
    verify_expired_at date         null
);

create table if not exists gongyeon2jo.credit
(
    credit_id   varchar(100)    not null,
    email       varchar(100)    null,
    name       varchar(100)   null,
    password    varchar(100)    null,
    credit      varchar(100)    null,
    user_id     varchar(100)    null
);

create table if not exists gongyeon2jo.review
(
    review_id   varchar(100)     not null,
    email       varchar(100)    null,
    name        varchar(100)    null,
    comment     text        null,
    comment_date    date    null,
    user_id     varchar(100)    null
)