package protoss;

public class ProtossApp {
	
	public static void attack(Zealot u1, Dragoon u2){
		int damage = u1.attack - u2.armor;
		u2.sh = u2.sh - damage;
	}
	public static void attack2(Zealot u1, Dragoon u2){
		int damage = u1.attack - u2.armor;
		u2.sh = u2.sh - damage;
	}
	
	public static void attack3(Zealot u1, Dragoon u2){
		int damage = u1.attack - u2.armor;
		u2.sh = u2.sh - damage;
	}
	
	public static void printUnit(Dragoon u2){
		System.out.println("µå¶ó±ºÀÇ ½¯µå´Â " + u2.sh);
	}
	
	public static void printUnit(Zealot u2){
		System.out.println("µå¶ó±ºÀÇ ½¯µå´Â " + u2.sh);
	}
	
	
	public static void main(String[] args) {
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot();	//Áú·µÀÌ »ý¼ºµÊ
		Zealot z2 = gate1.makeZealot();//Áú·µÀÌ »ý¼ºµÊ
	
		Dragoon d1 = gate1.makeDragoon();
		ProtossApp.attack(z1, d1);
		ProtossApp.printUnit(d1);
		
		ProtossApp.attack2(d1, z1);
		ProtossApp.printUnit(z1);
		
		ProtossApp.attack(z1, z2);
		ProtossApp.printUnit(z1);
		
		
	}

}
