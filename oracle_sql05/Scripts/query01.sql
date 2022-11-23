/*
 *	SEQUENCE 객체
 *	  - 번호 발생기 객체
 *	  - 정수값을 순차적으로 생성하는 객체
 *	  - PRIMARY KEY로 사용하는 번호(ID) 등에 사용하여
 *		정수값을 생성하기 위한 용도로 많이 사용
 */
CREATE SEQUENCE SEQ1
 	 	  START WITH 10 /*10부터 시작*/
	  INCREMENT BY 10	/*10씩 증가*/
	   MAXVALUE 200 	/*최대 100*/
	   MINVALUE -200	/*최소 -100*/
	      CYCLE			/*순환*/
	      CACHE 10;		/*미리 생성할 정수값 수량*/
	      
ALTER SEQUENCE SEQ1
	 INCREMENT BY 5
	  MAXVALUE 250
	  MINVALUE -100
	   NOCYCLE
	   NOCACHE;
	      
DROP SEQUENCE SEQ1;

SELECT SEQ1.NEXTVAL FROM DUAL; /*다음번호*/
SELECT SEQ1.CURRVAL FROM DUAL; /*현재번호*/

CREATE SEQUENCE SEQ_TEMP;
CREATE TABLE TEMP(
	   ID NUMBER PRIMARY KEY
);
INSERT INTO TEMP VALUES (SEQ_TEMP.NEXTVAL);
UPDATE TEMP 
   SET ID = SEQ_TEMP.NEXTVAL
 WHERE ID = 5;
SELECT * FROM TEMP;

/*
 *	NEXTVAL, CURRVAL 을 사용할 수 있는 명령어
 *	   1. SELECT 문(서브쿼리 아님)
 *	   2. INSERT 문의 VALUES 절
 *	   3. INSERT 문의 SET 절
 *
 *	NEXTVAL, CURRVAL을 사용할 수 없는 명령어
 *	   1. VIEW를 사용하는 SELECT
 *     2. DISTINCT 키워드가 있는 SELECT
 *     3. GROUP BY, HAVING, ORDER BY 가 있는 SELECT
 *     4. SELECT, DELETE, UPDATE의 서브쿼리
 *     5. CREATE TABLE, ALTER TABLE 에서 사용하는 DEFAULT 값
 */