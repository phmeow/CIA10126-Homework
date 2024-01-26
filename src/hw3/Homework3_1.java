package hw3;

import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
		// 使用者輸入三個數字,輸出：正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three integers");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		int result = checkTriangle(data1, data2, data3);
		switch (result) {
			case 0 -> {
				System.out.println("這不是三角形!");
			}
			case 1 -> {
				System.out.println("其他三角形");
			}
			case 2 -> {
				System.out.println("等腰三角形");
			}
			case 3 -> {
				System.out.println("正三角形");
			}
		}

	}

	/**
	 * 判斷是否為三角形
	 * 
	 * @param a 第一個邊長
	 * @param b 第二個邊長
	 * @param c 第三個邊長
	 * @return 0: 不是三角形, 1: 其他, 2: 等腰, 3: 正
	 */
	public static int checkTriangle(int a, int b, int c) {
		int[] sideLengthes = { a, b, c };
		int maxEqualSideLengthCount = 0;
		for (int i = 0; i < sideLengthes.length; i++) {
			int sideLength = sideLengthes[i];
			int otherSideLengthSum = 0;
			int equalSideLengthCount = 0;
			for (int j = 0; j < sideLengthes.length; j++) {
				if (i == j)
					continue;
				int otherSideLength = sideLengthes[j];
				otherSideLengthSum += otherSideLength;
				if (sideLength == otherSideLength) {
					equalSideLengthCount++;
				}
			}
			if (otherSideLengthSum <= sideLength) {
				return 0;
			}
			if (equalSideLengthCount > maxEqualSideLengthCount) {
				maxEqualSideLengthCount = equalSideLengthCount;
			}
		}

		switch (maxEqualSideLengthCount) {
			case 1 -> {
				return 2;
			}
			case 2 -> {
				return 3;
			}
			default -> {
				return 1;
			}
		}
	}
}
