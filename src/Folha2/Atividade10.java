package Folha2;

import java.util.Scanner;
/*10. Escrever um algoritmo que leia tr�s valores inteiros e verifique se eles podem 
 * ser os lados de um tri�ngulo. Se forem, informar qual o tipo de tri�ngulo que eles 
 * formam: equil�tero, is�scele ou escaleno. Propriedade: o comprimento de cada lado 
 * de um tri�ngulo � menor do que a soma dos comprimentos dos outros dois lados. 
 * Tri�ngulo Equil�tero: aquele que tem os comprimentos dos tr�s lados iguais; 
Tri�ngulo Is�scele: aquele que tem os comprimentos de dois lados iguais. Portanto, 
todo tri�ngulo equil�tero � tamb�m is�scele; 
Tri�ngulo Escaleno: aquele que tem os comprimentos de seus tr�s lados diferentes.
*/ 


public class Atividade10 {

	public static void main (String[] args){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		float lado1,lado2,lado3;
		
		System.out.println("Informe Lado1");
		lado1 = entrada.nextFloat();
		System.out.println("Informe Lado1");
		lado2 = entrada.nextFloat();
		System.out.println("Informe Lado1");
		lado3 = entrada.nextFloat();
		
		
		if (lado1==lado2 && lado1==lado3){
			System.out.println("Tri�ngulo Equil�tero e Tri�ngulo Is�scele ");
		}
		else if (lado1 != lado2 && lado1 != lado3 && lado2!=lado3){
			System.out.println("Tri�ngulo Escaleno");
		}
		else {
			System.out.println("Tri�ngulo Is�scele");
		}
	}
}
