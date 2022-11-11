SELECT * FROM EMPLOYEES;

---	1. 1980년대 입사자, 1990년대 입사자, 2000년대 입사자의 수를 구하시오.
SELECT SUBSTR(TO_CHAR(HIRE_DATE, 'YYYY'), 1, 3) AS "입사 연도"
	 , 
  FROM EMPLOYEES
 GROUP BY SUBSTR;

---	2. DEPARTMENT_ID가 50, 80, 100인 부서의 평균 급여를 구하시오.


---	3. 연도 구분 없이 1사분기, 2사분기, 3사분기, 4분기 별 입사자의 수를 구하시오.


---	4. 급여액이 10,000 이상인 사원이 어느 부서에 많이 있는지 확인할 수 있는 조회 구문 작성

