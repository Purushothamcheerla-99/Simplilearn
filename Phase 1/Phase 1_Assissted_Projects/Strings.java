package projects;

public class Strings {
	
		public static void main(String[] args) {
			//methods of strings
			System.out.println("Methods in Strings");
			
			String sl=new String("Purushotham");
			System.out.println(sl.length());

			//substring
			String sub=new String("java");
			System.out.println(sub.substring(2));

			//String Comparison
			String s1="welcome";
			String s2="weldome";
			System.out.println(s1.compareTo(s2));

			//IsEmpty
			String s4="";
			System.out.println(s4.isEmpty());

			System.out.println(s1.toLowerCase());
			
			String replace=s2.replace('d', 'l');
			System.out.println(replace);

			//equals
			String x="Porus";
			String y="pOrUs";
			System.out.println(x.equals(y));
	 
			
			//Creating StringBuffer and append method
			StringBuffer s=new StringBuffer("this is string program!");
			s.append("this is in java");
			System.out.println(s);

			//insert method
			s.insert(0, 'w');
			System.out.println(s);

			//replace method
			StringBuffer sb=new StringBuffer("Hello");
			sb.replace(0, 2, "hEl");
			System.out.println(sb);

			//delete method
			sb.delete(0, 1);
			System.out.println(sb);
			
			//StringBuilder
			System.out.println("\n");
			System.out.println("Creating StringBuilder");
			StringBuilder sb1=new StringBuilder("string");
			sb1.append("Program");
			System.out.println(sb1);

			System.out.println(sb1.delete(0, 1));

			System.out.println(sb1.insert(1, "java"));

			System.out.println(sb1.reverse());
					
			//conversion	
			System.out.println("\n");
			System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
			
			String str = "string"; 
	        
	        // conversion from String object to StringBuffer 
	        StringBuffer sbr = new StringBuffer(str); 
	        sbr.reverse(); 
	        System.out.println("String to StringBuffer");
	        System.out.println(sbr); 
	          
	        // conversion from String object to StringBuilder 
	        StringBuilder sbl = new StringBuilder(str); 
	        sbl.append("program"); 
	        System.out.println("String to StringBuilder");
	        System.out.println(sbl);              		
		}
	}


