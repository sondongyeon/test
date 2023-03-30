package java0105;

import java.util.Scanner;

public class ex07_삼항연산자예제2 {
public static void main(String[] args) {
	// 기본시급 : 9620원 --> 시급계산기
	// 1. 노동시간을 Scanner를 이용해서 입력받기
	// 2. 받아야할 임금을 계산해서 출력
	// 3. (단 노동시간이 8시간을 넘은경우, 기본시급의 1.5배를 계산)
	// ex) 11시간 -> 8*9620 + 9620 * 1.5
	// ex) 8시간 -> 8*9620
	
	Scanner sc = new Scanner(System.in);
	System.out.println("노동시간 입력 : ");
	double time = sc.nextDouble();
	double a;
	
	
	a = time>8?8*9620+(time-8)*(9620*1.5):(time*9620);
	System.out.print(time>8?"진행된 노동시간은 8시간 초과입니다.":"진행된 노동시간은 8시간 이하입니다.");
	System.out.print(time>8?"지불해야되는 임금은 "+a+"입니다.":"지불해야되는 임금은 "+a+"입니다.");
	//삼항연산자 사용하지 않고 문제 풀이했음 다시한번 풀어볼 것 
	
}
}

