package hw4;

import java.security.PublicKey;

public class Q6 {
	public static void main(String[] arg) {
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] student = { 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			int max = score[i][0]; // 假設第一個元素為最大值
			for (int j = 1; j < score[i].length; j++) {
				if (score[i][j] > max) {
					max = score[i][j]; // 更新最大值
					sum = j;
				}

			}
			student[sum]++;

		}
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "號同學最高分次數為:" + student[i] );
		}
	}
}