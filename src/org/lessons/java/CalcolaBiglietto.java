package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//chiedo i KM
		System.out.print("inserisci il numero di chilometri che vuoi percorrere");
		int km = sc.nextInt();
		
		//chiedo l'età
		System.out.print("inserisci il numero di anni che hai");
		int age = sc.nextInt();
		
		//calcolo il costo del biglietto
		double fullPrice = km * 0.21;
		
		if(age < 18 ) {
			fullPrice = fullPrice - (fullPrice * 0.2);
		} else if (age >= 65) {
			fullPrice = fullPrice - (fullPrice * 0.4);
		}
		
		System.out.println("prezzo del biglietto: " + fullPrice );
		
	}

}
