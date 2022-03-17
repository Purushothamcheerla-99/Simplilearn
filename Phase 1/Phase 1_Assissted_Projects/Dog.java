package projects;


	public class Dog 
	{  
	    String name; 
	    String breed; 
	    int age; 
	    String color; 
	    public Dog(String name, String breed, int age, String color) 
	    { 
	        this.name = name; 
	        this.breed = breed; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getBreed() 
	    { 
	        return breed; 
	    } 
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ ".\nMy breed is "+ this.getBreed()+"\nmy age is " + this.getAge()+ "\nMy color is "+ this.getColor()); 
	    } 
	    public static void main(String[] args) 
	    { 
	        Dog rocky = new Dog("rocky","husky", 2, "white and black"); 
	        
	        System.out.println(rocky.toString()); 
	    } 
	}


