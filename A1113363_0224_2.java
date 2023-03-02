import java.util.*;

public class A1113363_0224_2{
	public static void main(String [] argv) {
		double celsius,fahrenheit;
		System.out.println("請輸入攝氏溫度：");
		Scanner sc = new Scanner(System.in);
		celsius = sc.nextDouble();
		fahrenheit = (celsius / 5) * 9 + 32;
		System.out.println(celsius + "攝氏溫度 = " + fahrenheit + "華氏溫度");
	}
}