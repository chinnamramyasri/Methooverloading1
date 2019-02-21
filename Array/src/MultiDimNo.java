
public class MultiDimNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] x;
x=new int[3][3];
int k=10;
for (int i=0;i<3;i++) {
	for (int j=0;j<3;j++) {
		x[i][j]=k;
		k=k+10;
	}
	System.out.println("Array elements are ");
	for (int a=0;a<3;a++) {
		for (int b=0;b<3;b++) {
			System.out.println(x[a][b]);
		}
	}
		System.out.println(k);
}
	}

}

