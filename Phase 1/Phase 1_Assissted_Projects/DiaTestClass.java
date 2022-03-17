package projects;


	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  
	public class DiaTestClass implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        DiaTestClass ob = new DiaTestClass(); 
	        ob.show(); 
	    } 
	}


