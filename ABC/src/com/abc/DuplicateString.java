package com.abc;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Giriraj";
int count;
char[]String=name.toCharArray();
System.out.println("duplicate  character in a string");
for(int i=0; i<String.length;i++) {
	count =1;
	for(int j=i+1;j<String.length;j++) {
		if(String[i]==String[j]&&String[i]!='0') {
			count++;
		}
	}
	if(count>1&&String[i]!='0') {
		System.out.println(String[i]);
	}
}
	}

}
