
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();
emp.id=3333;
emp.name="Ganga";
emp.address="Patchen drive";
emp.age=22;

Employee emp1=new Employee();
emp1.id=2222;
emp1.name="Ganesh";
emp1.address="Dowantowan";
Employee em[]=new Employee[3];
em [0]=emp;
em[1]=emp1;

Employee emps[]= {emp,emp1,emp};
for(Employee mm:emps) {
	System.out.println(mm.id +" "+mm.name+ " "+mm.address);
}
	}

}
