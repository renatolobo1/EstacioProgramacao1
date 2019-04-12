package Folha1;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade4 {
	
	/*4) Escreva um programa em Java que inicialize duas variáveis inteiras na declaração,
	 *  depois calcule e imprima o resto da divisão da 1ª. pela 2ª
	 */
	 
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		int resto = 0;
		System.out.println("Informe a primeira variavel inteira: ");
		a = entrada.nextInt();
		System.out.println("Informe a segunda variavel inteira: ");
		b = entrada.nextInt();
		resto = a%b;
		System.out.println ("O resto da divisão entre a primeira e segunda variavel e"+ resto);
	}

}
