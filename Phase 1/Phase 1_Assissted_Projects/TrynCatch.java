package projects;

public class TrynCatch {
	
	    public static void main(String args[]) 
	    {
	        int[] array = new int[5];
	        try 
	        {
	            array[10] = 5;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array of size is" + array.length);
	        }
	    }
	}


