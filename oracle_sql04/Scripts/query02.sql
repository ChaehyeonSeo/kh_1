/*
 *	DEPARTMENTS 테이블과 LOCATIONS 테이블을 사용하여 각 부서가 어느 지역에 위치하는지 알아내시오.
 */
SELECT D.DEPARTMENT_ID
	 , D.DEPARTMENT_NAME
	 , D.LOCATION_ID
	 , L.CITY
	 , L.STATE_PROVINCE
	 , L.COUNTRY_ID
  FROM DEPARTMENTS D
  JOIN LOCATIONS L 
    ON D.LOCATION_ID = L.LOCATION_ID;

/*
 *	지역별로 몇개의 부서가 배치되었는지 알아내시오.
 */
SELECT L.LOCATION_ID 
	 , COUNT(*) 부서수
  FROM DEPARTMENTS D
  JOIN LOCATIONS L 
    ON D.LOCATION_ID = L.LOCATION_ID
 GROUP BY D.LOCATION_ID;


/*
 *	지역별 사원수가 얼마나 되는지 알아보세요.
 */
SELECT L.LOCATION_ID
	 , COUNT(*) 사원수
  FROM DEPARTMENTS D
  JOIN LOCATIONS L 
    ON D.LOCATION_ID = L.LOCATION_ID 
  JOIN EMPLOYEES E
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
 GROUP BY D.LOCATION_ID;   
	 