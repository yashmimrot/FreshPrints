CREATE TABLE USER
                   ID CHAR(20) PRIMARY KEY     NOT NULL,
                    USER_NAME          VARCHAR(30)   NOT NULL,
                    PASSWORD     VARCHAR(12)   NOT NULL,
                    CONTACT        VARCHAR(12)   NOT NULL,
                    FULL_NAME         VARCHAR(30)   NOT NULL,
                    EMAIL           VARCHAR(30)   NOT NULL;

CREATE TABLE ORDER
                   ID CHAR(20) PRIMARY KEY     NOT NULL,
                    ORDER_NUMBER          VARCHAR(15) NOT NULL,
                    ORDER_DATE     DATE  NOT NULL,
                    DESCRIPTION    VARCHAR(100)  NOT NULL;


CREATE TABLE ITEM
                   ID CHAR(20) PRIMARY KEY     NOT NULL,
                    ITEM_NAME          VARCHAR(15) NOT NULL,
                    DESCRIPTION    VARCHAR(100)  NOT NULL;
