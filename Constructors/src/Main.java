//Zero Parameterized Constructor
class Dog {
	private String Name;
	private String Color;
	private int Age;
	private String Model;
	
	//CONSTRUCTORS
	
	Dog (){
		Name ="harsha";
		Color="black";
		Age=5;
		Model="Kuppam Street";
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

	
	
	
//	public Dog(String name, String color, int age, String model) {
//		super();
//		Name = name;
//		Color = color;
//		Age = age;
//		Model = model;
//	}


}

	class Main
	{
		public static void main(String[] args) {
			Dog d= new Dog ();
			System.out.println(d.getName());
			System.out.println(d.getColor());
			System.out.println(d.getAge());
			System.out.println(d.getModel());
			
		}
	}
	
	
	

