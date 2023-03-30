package java0105;

public class ex04_비교연산자 {
public static void main(String[] args) {
	// ==같다, !=같지 않다
	// !(NOT) --> !(피연산자)
	// &&(AND),||(OR) --> (피연산자1)||(피연산자2)
	
	int a = 3;
	int b = 10;
	int c = 15;
	int d = 13;
	
	System.out.println(a==b);
	System.out.println(!(a==b));
	//&&(and) -> 두 명제를 모두 만족시키는 경우에 사용
	
	System.out.println(a<b&&c>d);
	System.out.println(!(a<b&&c>d));
	
	// || --> 두 명제중 하나라도 만족시키고 싶은경우 사용
	
	System.out.println(a<b||c<d);
	System.out.println(!(a<b||c<d));
	

	
	
	
}
}
