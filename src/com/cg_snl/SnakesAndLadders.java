package com.cg_snl;

import java.util.Random;

public class SnakesAndLadders {
	public static void main(String[] args) {
		int pos = 0;

		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;

		System.out.println("No. on Dice: " + dice);

	}

}
