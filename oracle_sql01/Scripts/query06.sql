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
 
/*
 *	HAVING 절
 *		- 그룹에 대한 조건절로 사용한다.
 *		- WHERE 절에서 사용하는 조건으로 GROUP으로 묶이기 전의 조건으로 사용됨.
 */
SELECT DEPARTMENT_ID
	 , COUNT(DEPARTMENT_ID) 부서별총원
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
HAVING COUNT(DEPARTMENT_ID) < 5; 

SELECT SUBSTR(PHONE_NUMBER, 1, 3) AS 전화번호앞자리
	 , COUNT(*) AS 수량
  FROM EMPLOYEES
 GROUP BY SUBSTR(PHONE_NUMBER, 1, 3)
HAVING COUNT(*) >= 20; 

/*
 *	30명 이상 근무 부서의 전화번호 앞자리 사용 회선수 집계
 */
SELECT DEPARTMENT_ID 
	 , SUBSTR(PHONE_NUMBER, 1, 3) AS 전화번호앞자리
	 , COUNT(SUBSTR(PHONE_NUMBER, 1, 3)) AS 회선수
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID, SUBSTR(PHONE_NUMBER, 1, 3)
HAVING COUNT(DEPARTMENT_ID) >= 30; 

/*
 *	커미션을 지급 받는 사원의 직무 분포
 */
SELECT JOB_ID
	 , COUNT(JOB_ID) AS 사원수
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL 
 GROUP BY JOB_ID;
 
SELECT JOB_ID
	 , COMMISSION_PCT 
	 , COUNT(*) AS 인원
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL 
 GROUP BY JOB_ID, COMMISSION_PCT ;
 
/*
 *	ROLLUP : 그룹별 집계를 위한 함수
 *			 그룹으로 묶기 위한 조건이 1개 이상인 경우 사용하여
 *			 ROLLUP에 작성된 컬럼 순서대로 그룹을 1개씩 추가하여 묶어가며
 *			 집계에 사용한다.
 */
SELECT JOB_ID
	 , COMMISSION_PCT 
	 , COUNT(*) AS 인원
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL 
 GROUP BY ROLLUP(JOB_ID, COMMISSION_PCT);

/*
 *	CUBE : 그룹별 집계를 위한 함수
 *		   그룹으로 묶기 위한 조건이 1개 이상인 경우 사용하여
 *		   조합 가능한 모든 그룹에 대한 집계와 총 집계
 */
SELECT JOB_ID
	 , COMMISSION_PCT 
	 , COUNT(*) AS 인원
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL 
 GROUP BY CUBE(JOB_ID, COMMISSION_PCT)
 ORDER BY 1 NULLS LAST, 2 NULLS LAST;

/*
 *	GROUPING : ROLLUP, CUBE로 집계한 결과에 대해 어떠한 조합으로
 *			   그룹을 묶엇는지 알 수 있도록 도와주는 함수
 *			   함수의 반환값이 0이면 그룹에 포함된 것이며, 1이면 안된 것
 */
SELECT JOB_ID
	 , COMMISSION_PCT 
	 , COUNT(*) AS 인원
	 , CASE WHEN GROUPING(JOB_ID) = 0 AND GROUPING(COMMISSION_PCT) = 1 THEN '직무그룹'
	 		WHEN GROUPING(COMMISSION_PCT) = 0 AND GROUPING(JOB_ID) = 1 THEN '커미션그룹'
	 		WHEN GROUPING(COMMISSION_PCT) = 0 AND GROUPING(JOB_ID) = 0 THEN '직무/커미션그룹'
	 		ELSE '총계'
 		END AS 그룹부분
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL 
 GROUP BY CUBE(JOB_ID, COMMISSION_PCT);