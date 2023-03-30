package java0105;

public class ex03_증감연산자 {
public static void main(String[] args) {
	int i=3;
	
	System.out.println(++i); // 1을 먼저 올리고 변수 사용
	System.out.println(i++); //변수를 먼저 사용하고 1을 나중에 올림
	System.out.println(i);
	
	int opr =0;
	opr +=3;
	
	System.out.println(opr++);
	System.out.println(opr);
	System.out.println(++opr);
	System.out.println(opr);
	System.out.println(opr--);
	System.out.println(opr);
	System.out.println(--opr);
	System.out.println(opr);
	
	
}
}
