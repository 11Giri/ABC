
public class ExceptionDem {
	public static int age;
public static void main(String[] args)throws Exception {
	Student student= new Student();
	try {
	student.ageCheck(12);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
}
