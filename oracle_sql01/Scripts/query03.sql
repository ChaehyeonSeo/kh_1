--- 사원 정보 테이블
SELECT * FROM EMPLOYEES;
 --- 부서 정보 테이블
SELECT * FROM DEPARTMENTS;
 --- 직급/직무 정보 테이블
SELECT * FROM JOBS;
 --- 지점 정보 테이블
SELECT * FROM LOCATIONS;
 --- 국가 정보 테이블
SELECT * FROM COUNTRIES;
--- 대륙 정보 테이블
SELECT * FROM REGIONS ;

/*
 *	사원 테이블에서 SALARY 정보가 3,000 이하인 사원의 사번(EMPLOYEE_ID)
 *	이름(FIRST_NAME + LAST_NAME)을 조회하세요.
 */
SELECT EMPLOYEE_ID 사번
	 , FIRST_NAME || ' ' || LAST_NAME 이름
  FROM EMPLOYEES
 WHERE SALARY <= 3000;
 
/*
 *	DEPARTMENT_ID가 50인 사원의 사번, 이름, 직무 조회
 */
SELECT EMPLOYEE_ID 사번
	 , FIRST_NAME || ' ' || LAST_NAME 이름
	 , JOB_ID 직무
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 50;
 
/*
 *	부서 테이블에서 DEPARTMENT_NAME의 값이 IT가 포함된 결과 조회
 *	부서ID, 부서명 컬럼만 Record Set에 반환
 */
SELECT DEPARTMENT_ID 부서ID
	 , DEPARTMENT_NAME 부서명
  FROM DEPARTMENTS
 WHERE DEPARTMENT_NAME LIKE '%IT%';
 
/*
 *	직무 테이블에서 JOB_TITLE의 값에 Manager가 포함된 결과 조회
 *	직무ID, 직무명 컬럼만 반환
 */
SELECT JOB_ID 직무ID
	 , JOB_TITLE 직무명
  FROM JOBS 
 WHERE JOB_TITLE LIKE '%Manager%';

/*
 *	사원 테이블에서 MANAGER_ID 컬럼만을 조회할 때 중복된 결과값이 나오지 않게 조회
 */
SELECT DISTINCT MANAGER_ID
  FROM EMPLOYEES;
  
/*
 *	사원 테이블에서 EMAIL 컬럼을 출력할 때 "@emp.co.kr"이 추가로 붙어서 나오게 하세요.
 */
SELECT EMAIL || '@emp.co.kr' AS EMAIL
  FROM EMPLOYEES;

SELECT * FROM EMPLOYEES;
/*
 *	사원 테이블에서 전화번호 형식이 XXX.XXX.XXXX에 해당하는 정보만 Record Set으로 반환되게 하세요.
 */
SELECT EMPLOYEE_ID AS 사번
     , FIRST_NAME || ' ' || LAST_NAME AS 이름
     , PHONE_NUMBER AS 전화번호
  FROM EMPLOYEES
 WHERE PHONE_NUMBER LIKE '___.___.____';
/*
 *	사원 테이블에서 COMMISSION_PCT가 NULL이 아닌 데이터들만 조회되게 하고 
 *	SALARY를 출력할 때 COMMISSION_PCT가 포함된 SALARY 결과 출력
 */
SELECT SALARY + (COMMISSION_PCT * SALARY) AS SALARY
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL;