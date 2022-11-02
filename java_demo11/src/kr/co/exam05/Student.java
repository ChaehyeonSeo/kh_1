package kr.co.exam05;

import java.util.Objects;

public class Student {
	public String name;
	public int year;
	public int classNum;
	public int studentNum;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(classNum, name, studentNum, year);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && Objects.equals(name, other.name) && studentNum == other.studentNum
				&& year == other.year;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + ", classNum=" + classNum + ", studentNum=" + studentNum
				+ "]";
	}
	
}
