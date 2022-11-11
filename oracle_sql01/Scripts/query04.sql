/*
 *	함수
 *	  - 문자 함수 : 문자열에서 일부 문자열만 잘라내거나, 공백제거, 대소문자변환, 변경 등 기능
 *	  - 숫자 함수 : 소수점 처리를 위한 기능
 *	  - 날짜 함수 : 날짜 타입에서 년, 월, 일 등의 정보 처리 위한 기능
 *	  - 형변환 함수 : 문자를 숫자로, 숫자를 문자로, 날짜 형식의 문자를 날짜로, 날짜를 문자로
 *				   변환하기 위한 기능
 *	  - 그룹 함수 : 조회된 결과의 집합을 사용하여 전체조회 레코드 수, 최대값, 최소값 등의 기능
 */

/*
 *	문자 함수
 */
SELECT EMAIL
	 , LENGTH(EMAIL) AS 문자열길이
  FROM EMPLOYEES;
  
SELECT JOB_ID
	 , INSTR(JOB_ID, '_') AS "언더바(_)문자위치"
  FROM EMPLOYEES;
  
SELECT JOB_ID
	 , SUBSTR(JOB_ID, 0, 2) AS 접두사
  FROM EMPLOYEES;
  
SELECT FIRST_NAME || ' ' || LAST_NAME AS 이름
	 , UPPER(FIRST_NAME || ' ' || LAST_NAME) AS 대문자
	 , LOWER(FIRST_NAME || ' ' || LAST_NAME) AS 소문자
	 , INITCAP(FIRST_NAME || ' ' || LAST_NAME) AS 단어첫문자만대문자
	 , CONCAT(FIRST_NAME, LAST_NAME) AS 결합
  FROM EMPLOYEES;
  
SELECT EMAIL
	 , LPAD(EMAIL, 20) AS "왼쪽에패딩(공백)추가"
	 , RPAD(EMAIL, 20) AS "오른쪽에패딩(공백)추가"
	 , LPAD(EMAIL, 20, 'x') AS "왼쪽에패딩(x)추가"
	 , RPAD(EMAIL, 20, 'x') AS "오른쪽에패딩(x)추가"
  FROM EMPLOYEES;
  
SELECT TRIM(LPAD(EMAIL, 20)) AS "여백제거"
	 , LTRIM(LPAD(EMAIL, 20, 'X'), 'X') AS "왼쪽 특정문자제거"
	 , RTRIM(RPAD(EMAIL, 20, 'X'), 'X') AS "오른쪽 특정문자제거"
  FROM EMPLOYEES;
  
 SELECT PHONE_NUMBER AS 전화번호
 	  , REPLACE(PHONE_NUMBER, '.', '-') AS "변경"
   FROM EMPLOYEES;
   
/*
 *	숫자 함수
 */
 --- DUAL은 테스트용 테이블 (저장 내용 없음)
SELECT ABS(-10) AS 절대값
	 , MOD(5,2) AS 나머지
	 , ROUND(12.345, 1) AS 반올림1
	 , ROUND(12.356, 1) AS 반올림2
	 , ROUND(12.341, 2) AS 반올림3
	 , ROUND(12.356, 2) AS 반올림4
	 , FLOOR(12.345) AS 버림1
	 , FLOOR(12.745) AS 버림2
	 , TRUNC(12.345, 1) AS 버림3
	 , TRUNC(12.345, 2) AS 버림4
	 , CEIL(12.345) AS 올림
  FROM DUAL;

/*
 *	날짜 함수
 */
SELECT SYSDATE AS "시스템날짜"
	 , SYSTIMESTAMP AS "시스템타임스탬프"
  FROM DUAL;
  
SELECT EXTRACT(YEAR FROM SYSDATE) AS 연
	 , EXTRACT(MONTH FROM SYSDATE) AS 월
	 , EXTRACT(DAY FROM SYSDATE) AS 일
	 , EXTRACT(HOUR FROM SYSTIMESTAMP) AS 시
	 , EXTRACT(MINUTE FROM SYSTIMESTAMP) AS 분
	 , EXTRACT(SECOND FROM SYSTIMESTAMP) AS 초
  FROM DUAL;
  
SELECT ADD_MONTHS(SYSDATE, 1) AS "1개월뒤"
     , ADD_MONTHS(SYSDATE, 2) AS "2개월뒤"
     , ADD_MONTHS(SYSDATE, 3) AS "3개월뒤"
  FROM DUAL;
  
SELECT LAST_DAY(ADD_MONTHS(SYSDATE, 1)) AS "다음달 마지막 일자"
  FROM DUAL;

SELECT NEXT_DAY(SYSDATE, 1) AS "다음 일요일"
	 , NEXT_DAY(SYSDATE, 2) AS "다음 월요일" 
	 , NEXT_DAY(SYSDATE, 3) AS "다음 화요일" 
	 , NEXT_DAY(SYSDATE, 4) AS "다음 수요일" 
	 , NEXT_DAY(SYSDATE, 5) AS "다음 목요일" 
	 , NEXT_DAY(SYSDATE, 6) AS "다음 금요일" 
	 , NEXT_DAY(SYSDATE, 7) AS "다음 토요일"
  FROM DUAL;
  
SELECT MONTHS_BETWEEN(SYSDATE, ADD_MONTHS(SYSDATE, 5)) AS 개월차
  FROM DUAL;
  
SELECT SYSDATE 현재날짜
	 , SYSDATE + 10 "10일뒤"
	 , SYSDATE - 10 AS "10일전"
	 , SYSDATE + INTERVAL '15' DAY "15일뒤"
	 , SYSDATE - INTERVAL '15' DAY AS "15일전"
	 , SYSDATE + INTERVAL '5' MONTH AS "5개월전"
	 , SYSDATE - INTERVAL '5' MONTH AS "5개월전"
	 , SYSDATE + INTERVAL '2' YEAR AS "2년뒤"
	 , SYSDATE - INTERVAL '2' YEAR AS "2년전"
  FROM DUAL;
  
SELECT SYSTIMESTAMP + INTERVAL '5' HOUR AS "5시간뒤"
	 , SYSTIMESTAMP - INTERVAL '5' HOUR AS "5시간전"
	 , SYSTIMESTAMP + INTERVAL '50' MINUTE AS "50분뒤"
	 , SYSTIMESTAMP - INTERVAL '50' MINUTE AS "50분전"
	 , SYSTIMESTAMP + INTERVAL '50' SECOND AS "50초뒤"
	 , SYSTIMESTAMP - INTERVAL '50' SECOND AS "50초전"
  FROM DUAL;
  
/*
 *	형변환 함수 
 *		TO_CHAR(숫자 또는 날짜값) : 문자 타입으로 변환
 *		TO_NUMBER(문자) : 숫자 타입으로 변환
 *		TO_DATE(숫자 또는 문자) : 날짜 타입으로 변환
 */
SELECT '문자타입'
	 , 1234 AS 숫자타입
	 , SYSDATE AS 날짜타입
  FROM DUAL;
  
SELECT TO_CHAR(100)
	 , TO_CHAR(123.456)
	 , TO_CHAR(SYSDATE)
	 , TO_CHAR(123456, '999,999')
	 , TO_CHAR(123456.789, '999,999.9999')
	 , TO_CHAR(123456, '000,000,000')
  FROM DUAL;
 
SELECT TO_CHAR(SYSDATE)
	 , TO_CHAR(SYSDATE, 'YYYYMMDD')
	 , TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS')
	 , TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS')
	 , TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일" HH24"시" MI"분" SS"초"')
  FROM DUAL;
  
SELECT TO_NUMBER('1234')
	 , TO_NUMBER('12.34')
	 , TO_NUMBER('123,456', '999,999')
  FROM DUAL;
  
SELECT TO_DATE(20221111)
	 , TO_DATE('20221111')
	 , TO_DATE('2022-11-11')
	 , TO_DATE('2022/11/11')
	 , TO_DATE('2022.11.11')
	 , TO_DATE('2022년 11월 11일', 'YYYY"년" MM"월" DD"일"')
  FROM DUAL;
  
/*
 *	NVL 함수 : NULL 데이터를 다른 값으로 변환
 */
SELECT COMMISSION_PCT
	 , NVL(COMMISSION_PCT, 0)
  FROM EMPLOYEES;
  
/*
 *	DECODE 함수 : 조건에 따라 사용하는 값을 변환
 *	DECODE(컬럼값, 조건1, 반환1, 조건2, 반환2, ..., 디폴트)
 *	디폴트 없고 해당 조건 없으면 NULL
 */
SELECT DECODE(REGION_ID, 1, '유럽', 2, '아메리카', '기타')
  FROM REGIONS;
  
/*
 *	CASE WHEN <조건식> THEN <반환값>
 *		 WHEN < ...  > THEN < ...  >
 *			...
 *		 ELSE <반환값>	-> 생략 가능
 *	END
 */
SELECT EMPLOYEE_ID 사번
	 , FIRST_NAME || ' ' || LAST_NAME AS 이름
	 , SALARY
	 , CASE WHEN SALARY >= 2000 AND SALARY < 5000 THEN '낮은급여'
	 		WHEN SALARY >= 5000 AND SALARY < 8000 THEN '적당한급여'
	 		WHEN SALARY >= 8000 AND SALARY < 15000 THEN '높은급여'
	 		WHEN SALARY >= 15000 THEN '매우 높은 급여'
	 	END AS 급여수준
  FROM EMPLOYEES;
  
/*
 *	그룹 함수
 *		- COUNT(컬럼명 또는 *) : 조화된 Record Set의 Record 수 반환
 *		- MAX(컬럼명) : 지정한 컬럼의 값 중 가장 큰값을 반환
 * 		- MIN(컬럼명) : 지정한 컬럼의 값 중 가장 작은값을 반환
 *     	- AVG(컬럼명) : 지정한 컬럼의 값들의 평균값을 반환
 *     	- SUM(컬럼명) : 지정한 컬럼의 값들의 총합을 반환
 */
SELECT COUNT(*) FROM EMPLOYEES WHERE SALARY >= 10000;
SELECT MAX(SALARY), MIN(SALARY), AVG(SALARY), SUM(SALARY) FROM EMPLOYEES;

/*
 *	GROUP BY 절
 * 		- 그룹 함수를 사용하여 그룹에 대한 집계를 나타낼 대
 * 		  전체 그룹이 아닌 특정 그룹에 대한 집계가 이루어질 수 있도록
 *		  그룹을 묶어주는 역할 수행
 */
SELECT DEPARTMENT_ID
	 , COUNT(DEPARTMENT_ID) 부서별총원
	 , MAX(SALARY) 부서별최고급여액
	 , MIN(SALARY) 부서별최저급여액
	 , ROUND(AVG(SALARY), 2) 부서별평균급여액
FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID;

SELECT SUBSTR(PHONE_NUMBER, 1, 3) AS 전화번호앞자리
	 , COUNT(*) AS 수량
  FROM EMPLOYEES
 GROUP BY SUBSTR(PHONE_NUMBER, 1, 3);
 
/*
 *	연도별 입사자 수
 */
SELECT EXTRACT(YEAR FROM HIRE_DATE) AS "입사 연도"
	 , COUNT(*) AS "입사자 수"
  FROM EMPLOYEES
 GROUP BY EXTRACT(YEAR FROM HIRE_DATE);

/*
 *	JOB_ID별 최고급여액, 최저급여액을 구하시오.
 *	COMMISION_PCT가 있는 경우 COMMISSION_PCT를 포함한 급여액
 */
SELECT JOB_ID
	 , MAX(SALARY * (1 + NVL(COMMISSION_PCT, 0))) 최고급여액
	 , MIN(SALARY * (1 + NVL(COMMISSION_PCT, 0))) 최저급여액
  FROM EMPLOYEES
 GROUP BY JOB_ID;