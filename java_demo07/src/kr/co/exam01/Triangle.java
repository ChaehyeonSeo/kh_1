package kr.co.exam01;

public class Triangle extends Figure {
	
//	메서드 오버라이드
//		기존 부모 클래스가 가지고 있는 메서드를 자식에서 재정의하여 사용하는 것
//		기존 부모에 정의한 메서드명, 매개변수 타입/수, 반환타입이 동일해야한다.
//		접근제한자는 부모의 접근제한자보다 좁거나 같은 범위여야 한다.
//		final 키워드가 있는 메서드에 대해서는 오버라이드를 할 수 없다.
//		(멤버 변수에 대해 final 키워드를 사용하면 한 번 초기화 후
//		재할당을 할 수 없는 것과 동일하게 메서드에 대해서도 한 번 작성된
//		메서드를 재정의하여 사용할 수 없다.)
//		@Override : 메서드 오버라이드를 적용하는 메서드라는 것을
//					명시하기 위해 사용하는 어노테이션(Annotation)
//					(필수는 아니지만 항상 사용하여 오버라이드인지를
//					구분하게 만드는 것이 좋다.)
	@Override
	public double getArea() {
		double area = super.getArea();
		return area / 2;
	}

}
