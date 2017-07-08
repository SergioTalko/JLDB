CREATE TABLE USERS(
ID NUMBER NOT NULL ,
CONSTRAINT USERS_PK PRIMARY KEY (ID),
TYPE NVCHAR2(20) NOT NULL ,
EMAIL NVCHAR2(20) NOT NULL ,
PASSWORD NVCHAR2(20) NOT NULL ,
USER_NAME NVCHAR2(10),
PHONE NVCHAR2(20),
CITY NVCHAR2(30),
DATE_REGISTERED TIMESTAMP NOT NULL,
LAST_ACTIVE_DATE TIMESTAMP NOT NULL,
IS_ACTIVE NUMBER NOT NULL,
ATTIBUTES CLOB
);

CREATE SEQUENCE USERS_SEQ MINVALUE 1000 MAXVALUE 10000000000 START WITH 1001 INCREMENT BY 1;