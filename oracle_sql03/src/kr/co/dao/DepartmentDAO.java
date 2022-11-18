package kr.co.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.db.connection.OracleConnection;
import kr.co.db.vo.DepartmentVO;

public class DepartmentDAO {
	
	private OracleConnection oc;
	
	public DepartmentDAO() throws ClassNotFoundException, SQLException {
		this.oc = new OracleConnection("localhost:1521/XEPDB1", "dev01");
	}

	public ArrayList<DepartmentVO> selectALL() {
		String query = "SELECT * FROM EMPLOYEES";
		
		ArrayList<DepartmentVO> deptArray = new ArrayList<DepartmentVO>();
		
		try {
			this.oc.getPrepared(query);
			ResultSet rs = this.oc.sendSelect();
			
			while (rs.next()) {
				DepartmentVO dep = new DepartmentVO();
				dep.setDeptId(rs.getInt("DEPARTMENT_ID"));
				dep.setManagerId(rs.getInt("MANAGER_ID"));
				deptArray.add(dep);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deptArray;
	}

}
