class ConsOverDemo{
	ConsOverDemo(int x){
		System.out.println(x);
	}
	ConsOverDemo(int x,int y){
		System.out.println(x+y);
	}
}
public class ConsOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConsOverDemo cod1,cod2;
cod1=new ConsOverDemo(10);
cod2=new ConsOverDemo(10,20);
	}

}
