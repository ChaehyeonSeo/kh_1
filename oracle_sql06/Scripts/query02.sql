/*
 *	PROCEDURE
 *		- PL/SQL 구문을 PROCEDURE 객체로 만들어 재사용할 수 있도록 한다.
 *		- EXEC 명령어로 함수와 비슷하게 사용할 수 있다.
 *		- 외부 값을 프로시져 내부에 전달하거나 프로시져 내부에서 생성된 값을
 *		  외부에 반환하는 형식을 작성할 수 있다.
 */
CREATE OR REPLACE PROCEDURE PROC_SAMPLE1
IS
BEGIN 
	DBMS_OUTPUT.PUT_LINE('프로시져 동작!!!');
END;

BEGIN
	PROC_SAMPLE1;
END;		/* SQLPLUS에서는 EXEC PROC_SAMPLE1; */

/*
 *	프로시져에서 변수 선언
 */
CREATE OR REPLACE PROCEDURE PROC_SAMPLE2
IS 
	NUM NUMBER := 10;
BEGIN 
	DBMS_OUTPUT.PUT_LINE(NUM);
END;	/* 선택해서 실행해야 에러안남 */

/*
 * 	외부에서 값 전달받기
 */
CREATE OR REPLACE PROCEDURE PROC_SAMPLE3(X IN NUMBER)
IS 
	NUM NUMBER := 10;
BEGIN 
	DBMS_OUTPUT.PUT_LINE(NUM + X);
END;

BEGIN
	PROC_SAMPLE3(5);
END;

SELECT * FROM USER_PROCEDURES;
SELECT * FROM USER_ERRORS;	/* 에러확인 */