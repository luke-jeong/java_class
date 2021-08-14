package Boxing;

public class Unit {
	private String name;

	// 생성자가 정의되어있다.
	public Unit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 이 메서드를 재정의한다.
	public void attack() {
		System.out.println( this.name + " >> 공격준비");
		System.out.println( this.name + " >> 공격준비 완료" );
	}
	
	public void parent() {
		System.out.println("Unit 클래스에만 정의된 메서드");
	}
	
	
	
}
