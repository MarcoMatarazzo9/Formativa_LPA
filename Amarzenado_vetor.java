package Formativa_LPA;

import java.util.Scanner;

public class Amarzenado_vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome[] = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Insira um nome : ");
			nome[i] = ler.next();
		}
		for (int i=0;i<5; i++ ) {
			System.out.println(i);
		}

	}
}
