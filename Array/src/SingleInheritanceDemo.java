class Calculator{
	 int add(int i,int j) {
	
		return i+j;
				
	}
}
class CalAdv extends Calculator
{
	int sub(int i,int j){
		return i-j;
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalAdv cl=new CalAdv();
int result=cl.add(4,5);
int result1=cl.sub(6,3);
System.out.println(result);
System.out.println(result1);
	}

}
