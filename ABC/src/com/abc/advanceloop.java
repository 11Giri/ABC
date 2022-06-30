package com.abc;

import java.util.Arrays;

public class advanceloop {

	public static void main(String[] args) {
//	//	Q4. Write a Java program to find the duplicate 
//		//values of an array of String values
//int[]num= {2,1,8,7,6,21,1,2,19};
//Arrays.sort(num);
//for(int i=0;i<num.length-1;i++) {
//	if(num[i]==num[i+1]) {
//		System.out.println("Dublicate value found"+num[i]);
//	}Q8. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.

//}
		int nums[]= {30,30,40,60,60,70,70,70};
		
		System.out.println("orginal array length:"+nums.length);
		System.out.println("array elements are: ");
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
			System.out.println("\nthe new length of the array is :"+array_sort(nums));
		}

	private static int array_sort(int[] nums) {
		int index=1;
		for( int i=1;i<nums.length;i++) {
			if (nums[i]!=nums[index-1])
				nums[index++]=nums[i];
		}
	
	return index;
	}
}

	




