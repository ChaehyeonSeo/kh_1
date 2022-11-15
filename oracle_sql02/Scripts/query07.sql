SELECT * FROM EMPLOYEES;
/*
 *	부서별 평균, 최대, 최소 급여를 집계한 DEPT_SALARY_STATICS 테이블 만들어 데이터 추가
 */
CREATE TABLE DEPT_SALARY_STATICS
AS
SELECT DEPARTMENT_ID 부서
	 , FLOOR(AVG(SALARY)) AS 평균
	 , MAX(SALARY) 최대
	 , MIN(SALARY) 최소
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID;
SELECT * FROM DEPT_SALARY_STATICS;

/*
 *	직급별 평균, 최대, 최소 급여를 집계한 JOB_SALARY_STATICS 테이블 만들어 데이터 추가
 */
CREATE TABLE JOB_SALARY_STATICS
AS
SELECT JOB_ID 직급
	 , FLOOR(AVG(SALARY)) AS 평균
	 , MAX(SALARY) 최대
	 , MIN(SALARY) 최소
  FROM EMPLOYEES 
 GROUP BY JOB_ID;
SELECT * FROM JOB_SALARY_STATICS;

/*
 *	직급 ID에 'MGR'이 접미사로 붙은 JOB_SALARY_STATICS에 평균, 최대, 최소 급여를 +500 수정
 */
UPDATE JOB_SALARY_STATICS 
   SET 평균 = 평균 + 500
   	 , 최대 = 최대 + 500
   	 , 최소 = 최소 + 500
 WHERE 직급 LIKE '%MGR';
SELECT * FROM JOB_SALARY_STATICS;

/*
 *	연도별 입사 인원을 파악하기 위한 HIRE_FOR_YEAR 테이블을 만들어 데이터 추가
 *	(인원 파악이 주목적이기 때문에 연도와 인원수만 저장할 수 있으면 됨)
 */
CREATE TABLE HIRE_FOR_YEAR
AS
SELECT EXTRACT(YEAR FROM HIRE_DATE) AS "입사 연도"
	 , COUNT(*) AS "입사 인원"
  FROM EMPLOYEES
 GROUP BY EXTRACT(YEAR FROM HIRE_DATE);
SELECT * FROM HIRE_FOR_YEAR;

/*
 *	부서별/직급별 평균, 최대, 최소 급여를 저장한 테이블에
 *	COMMISSION_PCT까지 반영한 데이터가 저장될 수 있도록 기존 정보 수정
 */

UPDATE DEPT_SALARY_STATICS
   SET (평균, 최대, 최소) = (SELECT FLOOR(AVG(SALARY * (1 + COMMISSION_PCT)))
   								  , MAX(SALARY * (1 + COMMISSION_PCT))
   								  , MIN(SALARY * (1 + COMMISSION_PCT))
   							   FROM EMPLOYEES
 						   GROUP BY DEPARTMENT_ID);
   	
UPDATE JOB_SALARY_STATICS
   SET (평균, 최대, 최소) = (SELECT FLOOR(AVG(SALARY * (1 + COMMISSION_PCT)))
   								  , MAX(SALARY * (1 + COMMISSION_PCT))
   								  , MIN(SALARY * (1 + COMMISSION_PCT))
   							   FROM EMPLOYEES
 						   GROUP BY JOB_ID);