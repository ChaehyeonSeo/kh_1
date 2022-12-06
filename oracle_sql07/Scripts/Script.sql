CREATE OR REPLACE FUNCTION GETDNAME(
	   vdepartment_id IN departments.department_id%TYPE
) RETURN departments.department_name%TYPE
IS
  vdepartment_name departments.department_name%TYPE;
BEGIN
    SELECT department_name INTO vdepartment_name FROM departments
    WHERE department_id = vdepartment_id;
    RETURN vdepartment_name;
END;	  

CREATE OR REPLACE FUNCTION GETDNAME(
	   vdepartment_id IN departments.department_id%TYPE
) RETURN departments.department_name%TYPE
IS
  vdepartment_name departments.department_name%TYPE;
BEGIN
    SELECT department_name INTO vdepartment_name FROM departments
    WHERE department_id = vdepartment_id;
    RETURN vdepartment_name;
EXCEPTION
	WHEN NO_DATA_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('해당 부서 없음');
END;	  

SELECT GETDNAME(20) FROM DUAL;

SELECT * FROM USER_ERRORS;