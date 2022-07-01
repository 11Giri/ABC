package com.abc;

public class StudentDemo2 {

	
	int id;
	String names;
	String address;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDemo2 student1 = new StudentDemo2();
				student1.id = 1001;
				student1.names = "subhendu";
				student1.address = "Texas";
				
				StudentDemo2 student2 = new StudentDemo2();
				student2.id = 1002;
				student2.names = "Anik";
				student2.address = "Nepal";
				
				StudentDemo2 std[] =  new StudentDemo2[3];
				std[0] = student1;
				std[1] = student2;
				
				StudentDemo2 stds[] = {student1, student2};
				
				for( StudentDemo2 st : stds) {
					System.out.println(st.id + " "+st.names + " "+st.address);
				}

	}

}
