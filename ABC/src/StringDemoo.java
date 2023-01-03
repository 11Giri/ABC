
public class StringDemoo {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("welcome");
		for (int i = 0; i < 100000; i++) {
			buffer.append("Home");
		}
		System.out.println("time taken by StringBuffer" + (System.currentTimeMillis() - startTime));

		startTime  = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("welcome");
		for (int i = 0; i < 100000; i++) {
			builder.append("Home");
		}
		System.out.println("time taken by StringBuldier" + (System.currentTimeMillis() - startTime));
	}

}
