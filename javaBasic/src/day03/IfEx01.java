package day03;

public class IfEx01 {

	public static void main(String[] args) {
		String grade;
		//전역 변수
		
		//0~100까지 랜덤한 점수 생성
		int point = (int)(Math.random()*101); // 0~100 
		System.out.println("랜덤한 점수:" + point);
		
		if(point>=60) {
			System.out.println("합격입니다!");
			grade = "A";
		}
		else {
			System.out.println("불합격입니다.");
			grade = "F";
		}
		
		System.out.println("당신의 등급은:" +grade+ "입니다");
		

	}

}
