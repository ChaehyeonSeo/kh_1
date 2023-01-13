DROP TABLE BOOKMARK_T;

CREATE TABLE BOOKMARK_T (
	   id NUMBER PRIMARY KEY
	 , url VARCHAR2(100)
	 , name VARCHAR2(100)
);

INSERT INTO BOOKMARK_T VALUES(1, 'https://naver.com', '네이버');
INSERT INTO BOOKMARK_T VALUES(2, 'https://google.com', '구글');
INSERT INTO BOOKMARK_T VALUES(3, 'https://nate.com', '네이트');

UPDATE BOOKMARK_T 
   SET url = 'url'
     , name = 'name'
 WHERE id = 1;
 
SELECT id, url, name FROM BOOKMARK_T;

SELECT max(id) + 1 FROM BOOKMARK_T;