package day05;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
		//배열은 크기가 고정 - 마치 추가 되는 것처럼
		/*
		1. 원본 배열의 + 1 크기의 새로운 배열을 만든다.
		2. 값을 옮긴다.
		3. 마지막에 값을 하나 추가한다.
		4. 원본 배열의 주소값을 새로운 배열로 바꾼다.
		*/
		
		int[]arr = {10,20,30,40,50}; //원본배열
		int data = 60; //추가할 값
		//1 원본 배열의 + 1 크기의 새로운 배열을 만든다.
		int[] newArr = new int[arr.length+1];
		
		//2 값을 옮긴다.
		for(int i = 0; i<arr.length; i++) {
			newArr[i]=arr[i];
		}
		
		//3. 마지막에 값을 추가한다.
		newArr[newArr.length-1] = data;
		
		//4.
		arr=newArr; //arr이 newArr로 바뀜. (얕은복사)
		//5.newArr 삭제 (지워주는 과정)
		newArr=null;
		
		System.out.println(Arrays.toString(arr));
		

	}

}
