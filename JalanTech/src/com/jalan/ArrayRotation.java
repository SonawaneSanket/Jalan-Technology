package com.jalan;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int arr[] = {1,3,2,7,4,6};
		int num = arr.length;
		int p =3;
		
		int[] temp = new int[num];		
		
		int count= 0;
		
		for (int i = p; i < num; i++) {
			temp[count]  = arr[i];
			count++;
		}
		
		for (int i = 0; i < p; i++) {
			temp[count] = arr[i];
			count++;
		}
		
		for (int i = 0; i < num; i++) {
			arr[i]=temp[i];
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
