package projects;


	class MyExcep extends Exception{
		
		private static final long serialVersionUID = 6317364102501587529L;
		String str1;
		   MyExcep(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   }
		}
		class Example1{
		   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				
				throw new MyExcep("This is My error Message");
			}
			catch(MyExcep exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }
		}

