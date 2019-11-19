package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class MainDebug {

	public static int randomNumber() {
		return ThreadLocalRandom.current().nextInt(0, 99 + 1);		

	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		ArrayList<Integer> cartela = new ArrayList<>();
		int[][] cartela1 = new int[2][2];
		int [][] cartela2 = new int[2][2];
		int [][] cartela3 = new int[2][2];
		int numeroSorteado = randomNumber();
		int indice = 0;
		while(cartela.size() < 4) {
			if(cartela.contains(numeroSorteado)) {
				continue;
			}
			else {
				cartela.add(numeroSorteado);
			}
			numeroSorteado = randomNumber();
		}
		
		for (Integer i : cartela) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < cartela1.length; i++) {
			for (int j = 0; j < cartela1.length; j++) {
				cartela1[i][j] = cartela.get(indice);
				indice++;
			}
		}
		for (int i = 0; i < cartela1.length; i++) {
			for (int j = 0; j < cartela1.length; j++) {
				System.out.print(cartela1[i][j] + " ");	
			}
		}
		
		
		
		

	}

}