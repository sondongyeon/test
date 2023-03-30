package java0105;

import java.util.Scanner;

public class ex01_예제 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("초를 입력해 주세요 : ");
	int input = sc.nextInt();
	
	
	int time = (input)/60; 
	int time2 = (time)/60;
	
	
	System.out.printf("%d시 %d분 %d초",time2,(time-time2*60),(input-time*60));
}
}
