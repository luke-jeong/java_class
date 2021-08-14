package Boxing;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 부모 클래스에 대한 객체 배열을 생성하고,
		 * 배열의 요소에 자식 클래스 객체를 할당하면,
		 * 자동으로 암묵적 형변환이 이루어져
		 * 순서나 종류에 상관없이 배열에 저장할 수 있다.
		 */
		
		// 부대 지정
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군1호");
		units[1] = new AirForce("공군2호");
		units[2] = new Navy("해군1호");
		units[3] = new Army("육군1호");
		units[4] = new Army("육군2호");
		
		// 부대 일괄 공격
		for( int i = 0; i<units.length; i++ ) {
			units[i].attack();
		}
	}

}







