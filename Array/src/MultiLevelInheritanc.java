class ieg{
	void Display() {
		System.out.println("Super class");
	}
}
class jkc extends ieg{
	void Output() {
		System.out.println("sub class");
	}
}
class c extends jkc{
	void method() {
		System.out.println("Derived class");
		
	}
}
public class MultiLevelInheritanc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c ie;
ie=new c();
ie.method();
	}

}
