class MethodOverLoad{
	void Display(int x) {
		System.out.println(x);
	}
	void Display(int x,int y) {
		int z;
		z=x+y;
		System.out.println(z);
	}
	void Display(int x,int y,int z) {
		int a;
		a=x+y+z;
		System.out.println(a);
	}
	
}
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverLoad mo1,mo2,mo3;


mo1=new MethodOverLoad();
mo2=new MethodOverLoad();
mo3=new MethodOverLoad();
mo1.Display(10);
mo2.Display(10,20);
mo3.Display(10,20,30);

	}

}
