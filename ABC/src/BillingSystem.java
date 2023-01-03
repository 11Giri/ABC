
public class BillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]dish= {"Fried rice"," Momos", "Biriyani"};
double[]cost= {100,150,200};
Bill myBill=new Bill();
System.out.println("*******Invoice MN100FD100**********");
myBill.addOrder("Fried rice", 2, dish, cost);
myBill.addOrder("Momos", 1, dish, cost);
myBill.addOrder("Biriyani", 3, dish, cost);
myBill.getOrder();

System.out.println(myBill.getTotal());
System.out.println("***************");
System.out.println("Thank you. Visit Agaim");
System.out.println("******************************");
	

}
}