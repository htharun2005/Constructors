//Parametrized Constructor//
class Car{
	 public String getName() {
		return Name;
	}

	public String getColor() {
		return Color;
	}

	public String getModel() {
		return Model;
	}

	public int getType() {
		return Type;
	}

	private String Name;
	 private String Color;
	 private String Model;
	 private int Type;
 
 //Constructor
  Car(String a, String b, String c,int d)
  {
	  Name=a;
	  Color=b;
	  Model=c;
	  Type=d;
  }
 }
 
 

  class Main11
	{
		public static void main(String[] args) 
		{
			Car c=new Car("BMW","white&black","latest",2025);
			System.out.println(c.getName());
			System.out.println(c.getColor());
			System.out.println(c.getModel());
			System.out.println(c.getType());
			
			
		}
	}
 
