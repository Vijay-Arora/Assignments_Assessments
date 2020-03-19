package Training;

class a{
	void amethod() {
		System.out.println("a method");
	}
}

public class javatest extends a{
		public void manual(){
			System.out.println("Manual Method Called");
		}
		public void automation() {
			System.out.println("Automation Method Called");
		}
		javatest(int x, int y){
			int z = x+y;
			System.out.println("Value of addition is "+z);
		}
		public static void main(String args[]){
		// TODO Auto-generated method stub
			javatest jt = new javatest(23,5);
			jt.manual();
			jt.automation();
			jt.amethod();
}
}


