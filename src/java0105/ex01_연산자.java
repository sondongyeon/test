package java0105;

import java.util.Scanner;

public class ex01_연산자 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("java점수를 입력해 주세요 : ");
	int input = sc.nextInt();
	System.out.println("Web점수룰 입력해 주세요 : ");
	int input2 = sc.nextInt();
	System.out.println("Android점수를 입력해 주세요 : ");
	int input3 = sc.nextInt();
	
	int sum = (input+input2+input3);
	int avg = (input+input2+input3)/3;
	
	System.out.printf("합계 : %d\n",sum);
	System.out.printf("평균 : %d\n",avg);
	

}

}
