package Override;

public class Unit {
	private String name;

	// �����ڰ� ���ǵǾ��ִ�.
	public Unit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// �� �޼��带 �������Ѵ�.
	public void attack() {
		System.out.println( this.name + " >> �����غ�");
		System.out.println( this.name + " >> �����غ� �Ϸ�" );
	}
	
	
	
	
	
}
