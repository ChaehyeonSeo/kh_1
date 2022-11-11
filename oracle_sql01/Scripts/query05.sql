/*
 *	EMPLOYEES 테이블의 직원이름, 이메일, 전화번호, 고용일을 조회한다.
 *		- 직원이름은 성과 이름을 하나의 컬럼으로 만들기
 *		- 이메일 뒤에는 "@employees.co.kr"
 *		- 전화번호의 구분자는 . 대신 - 사용
 *		- 고용일은 xxxx년 xx월 xx일 형식으로 출력
 */
SELECT FIRST_NAME || ' ' || LAST_NAME AS 직원이름
	 , EMAIL || '@employees.co.kr' AS 이메일
	 , REPLACE(PHONE_NUMBER, '.', '-') AS 전화번호
	 , TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"') AS 고용일
  FROM EMPLOYEES;
 
/*
 *	EMPLOYEES 테이블에서 직원이름, 급여, 연봉 조회
 *		- 연봉은 급여*12개월
 *		- 천단위 구분 표시
 */
SELECT FIRST_NAME || ' ' || LAST_NAME AS 직원이름
	 , TRIM(TO_CHAR(SALARY, '999,999')) AS 급여
	 , TRIM(TO_CHAR(SALARY*12, '999,999')) AS 연봉
  FROM EMPLOYEES;
 
/*
 *	EMPLOYEES 테이블에서 전화번호가 011로 시작하는 직원의
 *	성과 이름, 사원번호, 전화번호 조회
 *		- 성과 이름은 한 컬럼으로 만들어 출력
 *		- 전화번호에서 011과 마지막 번호를 제외한 나머지 번호는 * 문자로 숨김처리
 */
SELECT FIRST_NAME || ' ' || LAST_NAME AS 직원이름
	 , EMPLOYEE_ID 사원번호
	 , REPLACE(PHONE_NUMBER, SUBSTR(PHONE_NUMBER, 5, 7), '**.****') AS 전화번호
  FROM EMPLOYEES
 WHERE PHONE_NUMBER LIKE '011%';

/*
 * 	EMPLOYEES 테이블에서 2000년도에 고용된 직원을 조회한다.
 * 		- 성과 이름은 한 컬럼으로 만들어 출력
 * 		- 고용일은 XXXX년 XX월 XX일 형식으로 출력
 */
SELECT FIRST_NAME || ' ' || LAST_NAME AS 직원이름
	 , TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"') AS 고용일
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN '2000-01-01' AND '2000-12-31';
/*
 * 	EMPLOYEES 테이블에서 HIRE_DATE를 기준으로 1999년 12월 31일까지의 근무개월 수가
 * 	60개월 이상인 직원 조회
 * 		- 성과 이름은 한 컬럼으로 만들어 출력
 * 		- 고용일은 XXXX년 XX월 XX일 형식으로 출력
 * 		- 근무개월 수도 출력
 */
SELECT FIRST_NAME || ' ' || LAST_NAME AS 직원이름
	 , TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"') AS 고용일
	 , FLOOR(MONTHS_BETWEEN('1999-12-31', HIRE_DATE)) AS 근무개월
  FROM EMPLOYEES
 WHERE MONTHS_BETWEEN('1999-12-31', HIRE_DATE) >= 60;

/*
 * 	LOCATIONS 테이블에서 우편번호가 5자리 숫자 또는 4자리 숫자로 되어있는 지점을 조회
 */
SELECT *
  FROM LOCATIONS
 WHERE LENGTH(POSTAL_CODE)=5 OR LENGTH(POSTAL_CODE)=4;