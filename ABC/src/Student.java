
public class Student {
	public int age;
public void ageCheck(int age) throws AgeCheckException {
	if(age<18) {
		
		//System.out.println("Not eligible");
		throw new AgeCheckException("Age Should grater than 18");
	}else {
			System.out.println("eligible");
}
}
}