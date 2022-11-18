package kr.co.demo04;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import kr.co.db.connection.OracleConnection;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		OracleConnection oc = new OracleConnection("localhost:1521/XEPDB1", "dev01");
		
		int empId = 207;
		String jobId = "IT_PROG";
		Date hireDate = new Date(new java.util.Date().getTime());
		
		String query = "INSERT INTO EMPLOYEES VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		// Statement 또는 PreparedStatement 객체 생성
		PreparedStatement pstat = oc.getPrepared(query);
		pstat.setInt(1, empId);
		pstat.setString(2, "길동");
		pstat.setString(3, "홍");
		pstat.setString(4, "HGILDONG");
		pstat.setString(5, "515.123.1234");
		pstat.setDate(6, hireDate);
		pstat.setString(7, jobId);
		pstat.setInt(8, 2800);
		pstat.setDouble(9, 0);
		pstat.setInt(10, 103);
		pstat.setInt(11, 60);
		
		int rs = oc.sendInsert();
		
		if(rs >= 1) {
			System.out.println(rs + "개 행이 반영되었습니다.");
		} else {
			System.out.println("0개 행이 반영되었습니다. (쿼리에 문제가 있는 것 같습니다. 다시 확인하세요.)");
		}
		
		oc.close();
	}

}
