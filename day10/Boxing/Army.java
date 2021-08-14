package Override;

public class Army extends Unit {

	public Army(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println( super.getName() + " >> ������� ������" );
	}
	
	public void tank() {
		System.out.println( this.getName() + " >> ��ũ����" );
	}

}
