/*
 * 	아래의 구문을 CASE 표현식을 사용하는 SELECT 문으로 변경하시오. (20점)
	  - MERIT_RATING(인사고가)에 따라 BONUS(성과급)을 조회한다.
 */
SELECT MERIT_RATING
	 , SALARY
	 , DECODE(MERIT_RATING, 'A', SALARY * 0.2, 'B', SALARY * 0.15, 'C', SALARY * 0.1, 0) BONUS
  FROM EMPLOYEE;
  
SELECT MERIT_RATING
	 , SALARY
	 , CASE MERIT_RATING
	 		WHEN 'A' THEN SALARY * 0.2
	 		WHEN 'B' THEN SALARY * 0.15
	 		WHEN 'C' THEN SALARY * 0.1
	 		ELSE 0
	   END AS BONUS
  FROM EMPLOYEE;

/*
  	직원의 급여를 인상하고자 한다
	직급코드가 J7인 직원은 급여의 8%를 인상하고,
	직급코드가 J6인 직원은 급여의 7%를 인상하고,
	직급코드가 J5인 직원은 급여의 5%를 인상한다.
	그 외 직급의 직원은 3%만 인상한다.

	직원 테이블(EMP)에서 직원명(EMPNAME), 직급코드(JOBCODE), 급여(SALARY), 인상급여(위 조건)을
	조회하세요(단, DECODE를 이용해서 출력하시오.) (20점)​
 */
SELECT EMPNAME 직원명
	 , JOBCODE 직급코드
	 , SALARY 급여
	 , DECODE(JOBCODE, 'J7', SALARY * 1.08
	 				 , 'J6', SALARY * 1.07
	 				 , 'J8', SALARY * 1.05
	 				 , SALARY * 1.03) 인상급여
  FROM EMP;

 
/*
	검색조건
	
	DEPT_CODE가 D9이거나 D6이고 SALARY이 300만원 이상이고 BONUS가 있고
	남자이고 이메일주소가 _ 앞에 3글자 있는
	사원의 EMP_NAME, EMP_NO, DEPT_CODE, SALARY를 조회
	
	작성된 쿼리구문
	SELECT EMP_NAME, EMP_NO, DEPT_CODE, SALARY
	FROM EMPLOYEE
	WHERE DEPT_CODE='D9' OR DEPT_CODE='D6' AND SALARY > 3000000
	AND EMAIL LIKE '____%' AND BONUS IS NULL;
 */
SELECT EMP_NAME
	 , EMP_NO
	 , DEPT_CODE
	 , SALARY
  FROM EMPLOYEE
 WHERE (DEPT_CODE = 'D9' OR DEPT_CODE = 'D6') AND SALARY >= 3000000 
 		AND EMAIL LIKE '___\_%' ESCAPE '\'
 		AND BONUS IS NOT NULL
 		SUBSTR(EMP_NO, 8, 1) = 1;
--1. SALARY가 300만원 이상인데 300만원 초과를 조회 중이다.
--2. 보너스가 있는 사원 조회인데 없는 사원을 조회하고 있다.
--3. 남자 조회하는 구문이 빠졌다.
--4. 이메일 조회 조건에 '_'가 들어가므로 ESCAPE 사용해야 한다.
--5. OR에 우선 연산 처리를 해야한다.

/*
	SELECT * FROM EMPLOYEE WHERE BONUS = NULL AND MANAGER_ID !=NULL;
 */
SELECT * 
  FROM EMPLOYEE
 WHERE BONUS IS NULL AND MANAGER_ID IS NOT NULL;
--NULL은 IS NULL / IS NOT NULL 연산자로 비교해야 한다.