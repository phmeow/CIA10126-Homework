package hw2;

public class Homework2 {
	public static void main(String[] args) {
		// 1. 計算1~1000的偶數和 (2+4+6+8+...+1000)
		int num1 = 2, sum1 = 0;
		for (; num1 <= 1000; num1 += 2) {
			sum1 += num1;
		}
		System.out.println("sum1 = " + sum1);

		// 2. 計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int num2 = 1, product2 = 1;
		for (; num2 <= 10; num2++) {
			product2 *= num2;
		}
		System.out.println("product2 = " + product2);

		// 3. 計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int num3 = 1, product3 = 1;
		while (num3 <= 10) {
			product3 *= num3;
			num3++;
		}
		System.out.println("product3 = " + product3);

		// 4. 輸出: 1 4 9 16 25 36 49 64 81 100
		for (int num4 = 1; num4 <= 10; num4++) {
			System.out.print((int) Math.pow(num4, 2));
			System.out.print(" ");
		}
		System.out.println();

		// 5. 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		// 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些? 總共有幾個?
		int row = 0;
		System.out.print("阿文可選：");
		for (int num5 = 1; num5 < 50; num5++) {
			String num5Str = String.valueOf(num5);
			if (!num5Str.contains("4")) {
				System.out.print(num5Str + " ");
				row++;
			}
		}
		System.out.println();
		System.out.println("共 " + row + " 個數字");

		// 6. 輸出數字三角形:
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= (11 - i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 7. 輸出英文三角形:
		for (int k = 1; k <= 6; k++) {
			char c = (char) ('A' + k - 1);
			String cStr = String.valueOf(c);
			String resultString = "";
			for (int l = 0; l < k; l++) {
				resultString += cStr;
			}
			System.out.println(resultString);
		}
	}
}
