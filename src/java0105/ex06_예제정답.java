package java0105;

import java.util.Scanner;

public class ex06_예제정답 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 입력 : ");
	int input = sc.nextInt();
	
	System.out.println(input%2==0?""+input+"은(는) 짝수입니다":""+input+"은(는) 홀수입니다");
	sc.close();
	
}
}
