package protoss;
 

//object(��ü)�� ���¿� �ൿ�� ������.
public class Dragoon {
	public Dragoon(){
		this(100, 100, 16, 1);
	}
	//�Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε�
	public Dragoon(int st, int sh, int attack, int armor){

		this.st = st;
		this.sh = sh;
		this.attack = attack;
		this.armor = armor;
		
		System.out.println("I had returned");
	}
	final String name = "���";
	int st;	//ü��
	int sh;	//����(��ȣ��)
	int attack;
	int armor;
	
	
	
//	public static void main(String[] args) {
//		
//
//	}

}
