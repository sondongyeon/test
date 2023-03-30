package java0105;

import java.util.Scanner;

public class ex07_삼항연산자연습 {
public static void main(String[] args) {
	// 기본시급 : 9620원 --> 시급계산기
	// 1. 노동시간을 Scanner를 이용해서 입력받기
	// 2. 받아야할 임금을 계산해서 출력
	// 3. (단 노동시간이 8시간을 넘은경우, 기본시급의 1.5배를 계산)
	// ex) 11시간 -> 8*9620 + 9620 * 1.5
	// ex) 8시간 -> 8*9620

	
	Scanner sc = new Scanner(System.in);
	System.out.println("노동시간을 입력해 주세요 : ");
	int time = sc.nextInt();
	
	double over = (8*9620)+(time-8)*(9620*1.5);
	double avg  = 9620*8;
	
	System.out.println(time>8?"지불되어야 하는 임금은 "+(int)over+"입니다.":"지불되어야 하는 임금은 "+(int)avg+"입니다.");
	
}
}
