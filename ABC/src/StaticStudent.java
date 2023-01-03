
public class StaticStudent {

	
		
public int id;
public String name;
public String address;
public static String collage="zorba";//common properties
public static  String course=" Java";//common
public StaticStudent(int id, String name, String address) {
	id++;
	this.id = id;
	this.name = name;
	this.address = address;

}
public void displayDetail() {
	System.out.println(id+" "+name+" "+address+" "+collage+" "+course);
}
	}


