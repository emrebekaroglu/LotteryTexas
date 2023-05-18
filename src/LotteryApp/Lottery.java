
package LotteryApp;

import java.util.Random;
import java.util.Arrays;

public class Lottery {

	public static void main(String[] args) {
		Random rand = new Random();
		int min = 1, max=60, slots= 6;
		int[] lotteryArray = new int[slots];
		boolean isRepeated;
		int randomNumber = 0;
		
		for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
			do {
				isRepeated = false;
				randomNumber = rand.nextInt(max + 1 - min) + min;
				for (int a = 0; a <= indexDrawn; a++) {
					if (lotteryArray[a] == randomNumber) {
						isRepeated = true;
						break;
					}
				}
						
			} while (isRepeated);
			lotteryArray[indexDrawn] = randomNumber;	
		}
		Arrays.sort(lotteryArray);
		System.out.println("LotteryTexas numbers:");
		for (int i = 0; i < slots; i++) {
			System.out.print(lotteryArray[i] + " ");
		}
	}
	

}
