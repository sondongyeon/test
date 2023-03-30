package java0105;

import java.util.Scanner;

public class ex08_if문 {
public static void main(String[] args) {
	
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("노동시간을 입력해주세요 : ");
	int time = sc.nextInt();
	double a;
	double b;
	if(time>8) {
		
		a = (8*9620)+(time-8)*(9620*1.5);
		System.out.println("지불되어야하는 임금은 "+(int)a+"입니다.");
	}else {
		
		b = (9620*time);
		System.out.println("지불되어야하는 임금은 "+(int)b+"입니다.");
	}
	
	
	
	
}
}
