
public class ExcDemo {

	public static void main(String[] args) {
		try{
			System.exit(0);
		int num=100/0;
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("inside finally ");
		}

	}

}
