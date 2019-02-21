interface Task{
   public void Task();
}
interface Jkc {
   public void Jkc();
}
interface ieg extends Jkc, Task{

public void ieg();
}
	
	
public class MiH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ieg ie = new ieg() {
	         public void Task() {
	            System.out.println("Task.");
	         }
	         public void Jkc() {
	            System.out.println("Jkc.");
	         }
	         public void ieg() {
	            System.out.println("ieg.");
	         
				
			}
	      
ie.Task();
ie.Jkc();
ie.ieg();
	      
	
	}
}


