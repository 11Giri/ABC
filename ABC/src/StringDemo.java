
public class StringDemo {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

String str=new String("welcome,Yo, Zorba");
String s2="";
System.out.println(str.charAt(3));
System.out.println(str.length());
System.out.println(str.substring(2));
System.out.println(str.substring(2, 5));
System.out.println(str.contains("xel"));
System.out.println(s2.isEmpty());
System.out.println(str.replace('w', 't'));
System.out.println(str.split(","));
	String arr[]=str.split(" ");
	for(String a:arr) {
		System.out.println(a);
		System.out.println(str.indexOf('w'));
	}
	}
}
