
public class StringDem {

	public static void main(String[] args) {
//	//Q6	Write a program to convert String to char and vice versa? 
//String str="Giriraj Gautam";
//
//
//for(int i=0;i<str.length();i++) {

//char ch=str.charAt(i);
//System.out.println(" "+ch);
//		char[]arr= {'G','i','r','i','r','a','j'};
//		String str=String.valueOf(arr);
//		System.out.println(str);
//		Write a program to convert String to byte array and vice versa? 
String str="abcdefgh";
byte array_bytes[]=str.getBytes();
for(byte content:array_bytes) {
	System.out.println(content);
}
	}
}

