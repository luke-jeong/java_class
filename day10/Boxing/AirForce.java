package Override;

public class AirForce extends Unit{

	public AirForce(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> �̷�");
		System.out.println(this.getName() + " >> ���߰��� ������");
	}
	
	public void bombing() {
		System.out.println(this.getName() + " >> ����");
	}

}
