package java0105;

import java.util.Scanner;

public class ex01_예제정답 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("초 입력 : ");
	int totalSecond = sc.nextInt();
	int h,m,s;
	h=totalSecond/3600;
	m=totalSecond%3600/60;
	s=totalSecond%60;
	
	System.out.println(""+h+"시 "+m+"분 "+s+"초");
	
	sc.close();//통로닫기 -->일종의 break
	
}
}
