class Calculator1{
	 int add(int i,int j) {
	
		return i+j;
				
	}
}
class CalAdv1 extends Calculator1
{
	int sub(int i,int j){
		return i-j;
	}
}
class CalAdvNew extends CalAdv1{
	int Multi(int i,int j) {
		return i*j;
	}
}
public class MultiInHeritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalAdvNew cl=new CalAdvNew();
		int result=cl.add(4,5);
		int result1=cl.sub(6,3);
		int result3=cl.Multi(3, 5);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result3);
	}

}
