package projects;

class emp{
	int id;
	String name;

	emp(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Pconstructor {
public static void main(String[] args) {

	emp emp1=new emp(111,"Prudhvi");
	emp emp2=new emp(129,"Porus");
	emp1.display();
	emp2.display();
		}
}


