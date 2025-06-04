package Formativa_LPA;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist {

	public static void main(String[] args) {
	ArrayList <Integer> numeros =new ArrayList<>();
	
	Random numero_aleatorio = new Random ();
	
	for(int i=0; i < 7; i++) {
		int numeros_aleatorios = numero_aleatorio.nextInt(100);
		numeros.add(numeros_aleatorios);
		}
	for (int numero : numeros) {
		System.out.println(numero);
	}
	}

}
