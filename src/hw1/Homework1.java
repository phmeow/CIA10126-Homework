package hw1;

public class Homework1 {
	public static void main(String[] args) {
//	1. 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println("a+b=" + (a + b) + ", a*b=" + (a * b));

//	2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆?
		int eggNumber = 200;
		int dozenNumber = eggNumber / 12;
		int leftEgg = eggNumber % 12;
		System.out.println(eggNumber + " eggs = " + dozenNumber + " dozen + " + leftEgg + " eggs");

//	3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSecond = 256559;
		int day = totalSecond / (60 * 60 * 24);
		int remainder = totalSecond % (60 * 60 * 24);
		int hour = remainder / (60 * 60);
		remainder = remainder % (60 * 60);
		int min = remainder / 60;
		remainder = remainder % 60;
		System.out.println(
				totalSecond + "s" + " = " + day + "days + " + hour + "hrs + " + min + "mins + " + remainder + "s");

//	4. 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int radius = 5;
		double area = PI * Math.pow(radius, 2);
		double circumference = 2 * PI * radius;
		System.out.printf("Area = %.3f%n", area);
		System.out.printf("circumference = %.3f%n", circumference);

//	5. 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
		int pv = 1500000;
		double rate = 0.02;
		int n = 10;
		double fv = pv * Math.pow((1 + rate), n);
		System.out.printf("Total profit = %.2f%n", fv);
		
//	6. 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
//	5 + ‘5’
//	5 + “5”
		System.out.println(5+5);	// 5+5=10
		System.out.println(5+'5');	// 在ASCII編碼中數字5對應的十進位碼是53，5+53=58
		System.out.println(5+"5");	// 字串使用"+"運算子會串接在一起，5+"5"=55
	}
}
