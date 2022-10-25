package kr.co.exam03;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 	직원 관리 프로그램을 만들기 위해 다음의 객체 정보가 필요하다.
		 * 	  - 인턴 : 서류정리, 자료복사
		 *	  - 사원 : 자료조사, 문서작성, 인턴봐주기
		 *	  - 대리 : 자료조사, 문서작성, 업체와의통화, 사원이작성한문서검토
		 *	  - 과장 : 업체미팅, 외부출장
		 *
		 *	모든 객체는 이름, 나이 정보를 가지고 있으며 
		 *	각 객체마다 기본적으로 출근 및 퇴근, 점심, 야근을 수행한다.
		 *
		 *	위 관계를 파악하여 클래스의 상속, 오버로딩, 오버라이딩, 다형성을 활용해본다.
		 */
		Employee e1 = new Intern("홍길동", 24);
		Employee e2 = new Staff("박수원", 27);
		Employee e3 = new AssistantManager("최정원", 30);
		Employee e4 = new Manager("박고현", 35);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		Employee emps[] = new Employee[4];
		emps[0] = e1; emps[1] = e2;
		emps[2] = e3; emps[3] = e4;
		
		System.out.println(e3 instanceof Manager);
		System.out.println(e3 instanceof AssistantManager);
		System.out.println(e3 instanceof Staff);
		System.out.println(e3 instanceof Intern);
		System.out.println(e3 instanceof Employee);
		
		for(int i = 0; i < emps.length; i++) {
			if (emps[i] instanceof Manager) {
				((Manager)emps[i]).meetClient();
				((Manager)emps[i]).businessTrip();
				((Manager)emps[i]).callClient();
			} else if (emps[i] instanceof AssistantManager) {
				((AssistantManager)emps[i]).research();
				((AssistantManager)emps[i]).document();
				((AssistantManager)emps[i]).callClient();
			} else if (emps[i] instanceof Staff) {
				((Staff)emps[i]).research();
				((Staff)emps[i]).document();
				((Staff)emps[i]).careIntern();
			} else if (emps[i] instanceof Intern) {
				((Intern)emps[i]).filing();
				((Intern)emps[i]).fileCopy();
			}
		}
		
		System.out.println(e1);
		e1 = ((Intern)e1).elevate();
		System.out.println(e1);
		
	}

}
