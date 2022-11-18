package kr.co.view;

import java.util.ArrayList;

import kr.co.db.vo.EmployeeVO;

public class EmployeeView {

	public void print(ArrayList<EmployeeVO> datas) {
		for(EmployeeVO emp: datas) {
			this.print(emp);
		}
	}
	
	public void print(EmployeeVO data) {
		System.out.println(data);
	}

}
