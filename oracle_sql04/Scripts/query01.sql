/*
 *	JOIN
 *	  - 하나 이상의 테이블에서 데이터를 조회하기 위해 사용하는 구문
 *	  - 결과는 하나의 Record Set으로 반환된다.
 *	  - UNION, UNION ALL 등과 같은 집합 연산과는 다르게
 *		열에 대한 결합으로 결과가 나오게 된다.
 *	  - JOIN을 사용하는 테이블에 공통 열 값에 대해 결합을 수행하게 된다.
 */
SELECT * FROM EMPLOYEES;
SELECT * FROM DEPARTMENTS;

/* 표준 JOIN 구문 */
SELECT EMP.EMPLOYEE_ID
	 , EMP.FIRST_NAME
	 , EMP.LAST_NAME
	 , EMP.DEPARTMENT_ID 
	 , DEPT.DEPARTMENT_NAME 
  FROM EMPLOYEES EMP
  JOIN DEPARTMENTS DEPT
	ON EMP.DEPARTMENT_ID = DEPT.DEPARTMENT_ID
 WHERE DEPT.DEPARTMENT_NAME LIKE '%IT%';

/* ORACLE 전용 JOIN 구문 */
SELECT *
  FROM EMPLOYEES E, DEPARTMENTS D
 WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID;

SELECT *
  FROM EMPLOYEES 
  JOIN DEPARTMENTS 
 USING (DEPARTMENT_ID);
 
SELECT E.EMPLOYEE_ID
	 , E.FIRST_NAME
	 , E.LAST_NAME
	 , E.JOB_ID 
	 , J.JOB_TITLE 
  FROM EMPLOYEES E
  JOIN JOBS J
    ON E.JOB_ID = J.JOB_ID;
    
SELECT E.EMPLOYEE_ID
	 , E.FIRST_NAME
	 , E.LAST_NAME
	 , E.JOB_ID
	 , J.JOB_TITLE
	 , E.DEPARTMENT_ID
	 , D.DEPARTMENT_NAME
  FROM EMPLOYEES E
  JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID 
  JOIN JOBS J 
    ON E.JOB_ID = J.JOB_ID;
    
/*
 *	INNER JOIN
 *	  - JOIN 구문의 가장 기본이 되는 조인 방법
 *	  - JOIN 결합 조건에 해당하는 행에 대해서만 결합을 수행하고
 *		결합 조건에 해당하지 않는 경우 결합을 하지 않는다.
 */
   
/*
 *	OUTER JOIN : INNER JOIN과 다르게 결합 조건에 해당하지 않는 경우에도 Record Set에 포함
 *	  - LEFT OUTER JOIN
 *			결합 조건에 해당하는 값이 없어도 
 *			왼쪽 테이블의 데이터는 전부 Record Set에 포함된다.
 *	  - RIGHT OUTER JOIN
 *			결합 조건에 해당하는 값이 없어도 
 *			오른쪽 테이블의 데이터는 전부 Record Set에 포함되낟.
 *	  - FULL OUTER JOIN
 *			LEFT OUTER JOIN과 RIGHT OUTER JOIN이 결합된 형태
 */
SELECT E.EMPLOYEE_ID
	 , E.FIRST_NAME
	 , E.LAST_NAME
	 , E.DEPARTMENT_ID
	 , D.DEPARTMENT_NAME
  FROM EMPLOYEES E
  LEFT OUTER JOIN DEPARTMENTS D 
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;
   
SELECT E.EMPLOYEE_ID
	 , E.FIRST_NAME
	 , E.LAST_NAME
	 , D.DEPARTMENT_ID
	 , D.DEPARTMENT_NAME
  FROM EMPLOYEES E
  FULL OUTER JOIN DEPARTMENTS D 
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;
   
/*
 *	CROSS JOIN
 *	  - 카데시안 곱(Cartesian Product)이라고도 한다.
 *	  - JOIN하는 모든 테이블의 행들이 맵핑된 데이터의 결과로 반환한다.
 *	  - A 테이블 10행, B 테이블 5행 -> A * B = 50행
 */
/*
 *	NON_EQU JOIN
 *
 *	SELF JOIN
 */