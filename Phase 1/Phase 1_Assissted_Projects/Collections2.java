package projects;
import java.util.*;
public class Collections2 {
	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("pune");//
	      city.add("Delhi");    	   
	      System.out.println(city);  
		
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector<Integer>();
	      vec.addElement(15); 
	      vec.addElement(30);
	      vec.addElement(45);
	      System.out.println(vec);
		
	
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Porus");  
	      names.add("chinna");  	
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	      
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       


	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	       
	       System.out.println("\n");
	       System.out.println("Treeset");
	       TreeSet<String> set3=new TreeSet<String>();  
	       set3.add("Ravi");  
	       set3.add("Vijay");  
	       set3.add("Ravi");  
	       set3.add("Ajay");  
	       //traversing elements  
	       Iterator<String> itr1=set3.iterator();  
	       while(itr1.hasNext()){  
	       System.out.println(itr1.next());  
	      	} 
	      }  
	}

	public static List<String> emptylist() {
		// TODO Auto-generated method stub
		return null;
	}

}
