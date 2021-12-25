package Pro.Wings;

class ABC
{
	int id;
	String name;

public ABC(int id,String name)
{
	this.id=id;
	this.name=name;
}

@Override
public String toString() {
	return "ABC [id=" + id + ", name=" + name + "]";
}


}	
public class Constrctor {
	
	public static void main(String[] args) {
		
		ABC ab= new ABC(10,"Ram");
		System.out.println(ab.id + ab.name);
		

	}

}

