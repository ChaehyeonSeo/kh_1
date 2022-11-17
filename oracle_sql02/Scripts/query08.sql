/*
 *	가계부 작성을 위한 테이블
 *
 *	ID, 입/출금 구분, 금액, 날짜, 지출구분, 비고 정보 저장
 *	  - ID는 레코드를 식별하기 위한 식별값으로 사용
 *	  - 입/출금 구분은 입금의 경우 'I', 출금의 경우 'O'로 사용
 *	  - 지출구분은 식비, 교통비, 통신비, 물품구입비 등 정해진 항목 안에서 사용
 *		정해진 항목 안에서 사용할 수 있도록 지출구분 테이블을 별도로 만들어 참조
 *	  - 비고에는 지출구분으로 작성할 수 없는 상세 내용 작성
 *
 *	지출구분 테이블에는 CODE, 항목 정보 저장
 *	  - CODE는 지출항목에 대응할 수 있는 5자리 영문자값 사용
 *	  - 항목에는 식비, 교통비, 통신비 등 정해진 값 작성
 *
 *	최근 1년 간의(월마다 최소 5개 데이터를 뽑아서) 지출내역을 참고하여 데이터 추가
 *	모든 데이터 추가 후에는 다음 작업 추가로 진행
 *	 1. 월별 지출액 합계
 *	 2. 월별 지출항목별 합계
 *	 3. 고정지출비 테이블을 별도로 생성하여 식비, 교통비, 통신비에 해당하는 항목들만 따로 저장
 *	 4. 통신비로 추가한 항목을 세분화하여 통신비(기기값) 항목을 새로 추가하고 모든 통신비에서
 *		통신비(기기값)에 해당하는 비용을 따로 추가하도록 합니다.
 *		(기존 통신비에는 통신비(기기값)에 해당하는 금액을 제합니다.)
 *		정해진 기기값이 없으면 통신비의 40%가 기기값인 것으로 하세요.
 */
--지출구분 테이블 작성
CREATE TABLE 지출구분(
	   CODE		CHAR(5 CHAR) CONSTRAINT 지출구분_CODE_PK PRIMARY KEY
	 , 항목		VARCHAR2(50 CHAR) CONSTRAINT 지출구분_항목_NN NOT NULL
);
--지출구분 데이터 입력
INSERT INTO 지출구분(CODE, 항목) VALUES('0000A', '급여');
INSERT INTO 지출구분 VALUES('0000B', '교통비');
INSERT INTO 지출구분 VALUES('0000C', '통신비');
INSERT INTO 지출구분 VALUES('0000D', '식비');
INSERT INTO 지출구분 VALUES('0000E', '물품구입비');
SELECT * FROM 지출구분;

--가계부 테이블 작성
CREATE TABLE 가계부 (
	   ID		NUMBER 
	 , 입출금	CHAR(1 CHAR)	
	 , 금액		NUMBER				
	 , 날짜		DATE				
	 , 지출구분 CHAR(5)
	 , 비고		VARCHAR2(100 CHAR)
	 , CONSTRAINT 가계부_ID_PK PRIMARY KEY(ID)
	 , CONSTRAINT 가계부_입출금_CK CHECK(입출금 IN('I', 'O'))
	 , CONSTRAINT 가계부_지출구분_FK FOREIGN KEY(지출구분) REFERENCES 지출구분(CODE)
);
SELECT * FROM 가계부 ORDER BY 1;

--가계부 데이터 추가
INSERT INTO 가계부 VALUES(1, 'I', 1000000, TO_DATE('20220101'), '0000A', NULL);
INSERT INTO 가계부 VALUES(2, 'O', 8000, TO_DATE('20220101'), '0000D', NULL);
INSERT INTO 가계부 VALUES(3, 'O', 1500, TO_DATE('20220102'), '0000B', '지하철');
INSERT INTO 가계부 VALUES(4, 'O', 9000, TO_DATE('20220102'), '0000D', '샌드위치');
INSERT INTO 가계부 VALUES(5, 'O', 2000, TO_DATE('20220102'), '0000E', '노트');
INSERT INTO 가계부 VALUES(6, 'O', 100000, TO_DATE('20220104'), '0000C', NULL);
INSERT INTO 가계부 VALUES(7, 'I', 3500000, TO_DATE('2022-02-01'), '0000A', NULL);
INSERT INTO 가계부 VALUES(8, 'O', 50000, TO_DATE('20220207'), '0000E', '충전기');
INSERT INTO 가계부 VALUES(9, 'O', 20000, TO_DATE('20220209'), '0000D', '점심');
INSERT INTO 가계부 VALUES(10, 'O', 3500, TO_DATE('20220212'), '0000D', '김밥');
INSERT INTO 가계부 VALUES(11, 'O', 63000, TO_DATE('20220228'), '0000B', '후불교통');
INSERT INTO 가계부 VALUES(12, 'O', 25000, TO_DATE('20220216'), '0000B', '택시');
INSERT INTO 가계부 VALUES(13, 'O', 100000, TO_DATE('20220204'), '0000C', NULL);
INSERT INTO 가계부 VALUES(14, 'I', 3500000, TO_DATE('20220304'), '0000A', NULL);
INSERT INTO 가계부 VALUES(15, 'O', 5200, TO_DATE('20220306'), '0000D', '커피');
INSERT INTO 가계부 VALUES(16, 'O', 4500, TO_DATE('20220306'), '0000E', '종이컵');
INSERT INTO 가계부 VALUES(17, 'O', 50000, TO_DATE('20220307'), '0000B', 'KTX');
INSERT INTO 가계부 VALUES(18, 'O', 100000, TO_DATE('20220313'), '0000C', NULL);
INSERT INTO 가계부 VALUES(19, 'O', 13000, TO_DATE('20220329'), '0000D', NULL);
INSERT INTO 가계부 VALUES(20, 'O', 200000, TO_DATE('20220312'), '0000E', '모니터');
SELECT * FROM 가계부 ORDER BY 1;

--월별 지출액 합계
SELECT EXTRACT(MONTH FROM 날짜) 월
	 , SUM(금액) AS 월별지출합계
  FROM 가계부
 WHERE 입출금 = 'O'
 GROUP BY EXTRACT(MONTH FROM 날짜)
 ORDER BY 1;
  
--월별 지출항목별 합계
SELECT EXTRACT(MONTH FROM 날짜) 월
	 , 지출구분
	 , SUM(금액)
  FROM 가계부
 WHERE 입출금 = 'O'
 GROUP BY ROLLUP(EXTRACT(MONTH FROM 날짜), 지출구분)
 ORDER BY 1;
 
--고정지출비 테이블 생성
CREATE TABLE 고정지출비
AS;
SELECT EXTRACT(MONTH FROM 날짜) 월
	 , 지출구분
	 , SUM(금액)
  FROM 가계부
 WHERE 입출금 = 'O' AND 지출구분 IN ('0000D', '0000B', '0000C')
 GROUP BY ROLLUP(EXTRACT(MONTH FROM 날짜), 지출구분)
 ORDER BY 1;

--통신비 세분화


--테이블 삭제
DROP TABLE 가계부;
DROP TABLE 지출구분;
DROP TABLE 고정지출비;