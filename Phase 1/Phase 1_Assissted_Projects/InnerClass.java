package projects;

public class InnerClass {
	

		 private String msg="This is"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+" Inner Classes");}  
		 }  


		public static void main(String[] args) {

			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();  
			in.hello();  
		}
	}





	

