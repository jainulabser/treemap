import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Bike {
	private String name;
	private float milage;
	private String color;

	Bike(String name, float milage, String color) {
		this.name = name;
		this.milage = milage;
		this.color = color;

	}

	public String getName() {
		return name;
	}

	public float getMilage() {
		return milage;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return name + " " + milage + " " + color;
	}
}

public class TreeMap1 {
	Map<String, Bikes> bikeMap = new TreeMap<String, Bikes>();// create map for storing bike details //key is String
																// //Values are Bikes object

	private void mapOperations() {

		Bikes b1 = new Bikes("RE", 35.05f, "Black");
		Bikes b2 = new Bikes("Dukati", 34.04f, "blue");
		Bikes b3 = new Bikes("Bmw", 29.99f, "Sky blue"); 
		bikeMap.put(b1.getName(), b1);
		bikeMap.put(b2.getName(), b2);
		bikeMap.put(b3.getName(), b3);// put all bike objects and also check duplicate is enter or not
		bikeMap.put(b2.getName(), b3);
	}

	private void print() {
		Set<Map.Entry<String, Bikes>> entry = bikeMap.entrySet(); //use Set Interface for printing the map elements
		for (Map.Entry<String, Bikes> bike : entry) {
			System.out.println(bike);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap1 obj = new TreeMap1();
		obj.mapOperations();
		obj.print();
	}
}
