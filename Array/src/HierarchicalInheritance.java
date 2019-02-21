class Parent{
	void ParentMethod() {
		System.out.println("I own a car ");
					}
}
class KidOne extends Parent{
	void KidOneMethod() {
		System.out.println("I own a bike ");
	}
}
class KidTwo extends Parent{
	void KidTwoMethod() {
		System.out.println("I own a bicycle ");
	}
}
class KidThree extends Parent{
	void KidThreeMethod() {
		System.out.println("I own a game console ");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
KidOne k1=new KidOne();
System.out.println("kid one says:");
k1.ParentMethod();
k1.KidOneMethod();
KidTwo k2=new KidTwo();
System.out.println("kid Two says:");
k2.ParentMethod();
k2.KidTwoMethod();
KidThree k3=new KidThree();
System.out.println("kid Three says:");
k3.ParentMethod();
k3.KidThreeMethod();
	}

}
