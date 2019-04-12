package Folha2;

import java.util.Scanner;
/*10. Escrever um algoritmo que leia três valores inteiros e verifique se eles podem 
 * ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que eles 
 * formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento de cada lado 
 * de um triângulo é menor do que a soma dos comprimentos dos outros dois lados. 
 * Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, 
todo triângulo equilátero é também isóscele; 
Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.
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
			System.out.println("Triângulo Equilátero e Triângulo Isóscele ");
		}
		else if (lado1 != lado2 && lado1 != lado3 && lado2!=lado3){
			System.out.println("Triângulo Escaleno");
		}
		else {
			System.out.println("Triângulo Isóscele");
		}
	}
}
