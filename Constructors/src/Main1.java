//Parametrized Constructor//
class Dogg {
	private String Name;
	private String Color;
	private int Age;
	private String Model;
	
	
	//constructors
	Dogg(String a,String b,int c,String d)
	{
		Name=a;
		Color=b;
		Age=c;
		Model=d;
		
	}
	public String getName() {
		return Name;
	}
	public String getColor() {
		return Color;
	}
	public int getAge() {
		return Age;
	}
	public String getModel() {
		return Model;
	}
	
}

class Main1
{
	public static void main(String[] args) {
		Dogg d=new Dogg("harsha","black",5,"Kuppam street");
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getAge());
		System.out.println(d.getModel());
		
	}
}




	

