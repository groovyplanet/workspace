package day06;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {

		//Queue - First In First Out (FIFO)
		//뒤로 들어가서 앞으로 빼준다.

		push(5);
		push(6);
		push(7);
		push(8);
		System.out.println(Arrays.toString(arr));

	System.out.println(pop());
		System.out.println(Arrays.toString(arr));

		

	}

	static int[] arr = {1,2,3,4};

	static void push(int data) {
		//		//1. 빈 temp를 생성
		//		int []temp = new int [arr.length+1];
		//2. 배열복사.
		int [] temp = Arrays.copyOf(arr, arr.length+1); //복사할 배열명 , 복사할 길이

		//3. 마지막에 데이터를 추가한다.
		temp[temp.length-1] = data;
		//4. 원본배열 변경
		arr = temp;
		temp = null;

	}

	static int pop() {

		
		if(arr.length>0) {
			int data = arr[0];// 1
			int []temp = new int[arr.length-1]; //2
			for(int i =0; i<temp.length;i++) { //3
				temp[i]=arr[i+1];
			}
			
//			int[]temp =Arrays.copyOfRange(arr,1,arr.length);
//			//1번째부터 마지막까지 위 코드와 같다. //복사할 배열 , 시작 , 끝

			arr=temp;
			temp=null;
			
			return data;
		}
		return 0;
	}






}
//삭제가 가능한 조건 안에서
//1. 삭제할 데이터 백업
//2. 길이 -1 배열 생성
//3. 배열의 1번째 요소 ~ 마지막까지 복사
//4. 원본배열을 변경
//5. 삭제된 데이터를 반환 1 - > 2 -> 3 ... >8 삭제 순서


