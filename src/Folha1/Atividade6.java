package Folha1;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade6 {
	
	/*6) Escreva um programa em Java que inicialize duas vari�veis reais do tipo double,
	 *  calcule e imprima, ap�s mensagens adequadas, o resultado da soma, da subtra��o, 
	 *  do produto e da divis�o. Depois, verifique se a soma do primeiro valor com o 
	 *  segundo valor � maior ou igual ao dobro do 2�. Valor.
	 */
	 
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a;
		double b;
		System.out.println("Informe a primeira variavel inteira: ");
		a = entrada.nextDouble();
		System.out.println("Informe a segunda variavel inteira: ");
		b = entrada.nextDouble();
		System.out.println ("A Soma dos valores e: "+(a+b));
		System.out.println ("A Subtra��o dos valores e: "+(a-b));
		System.out.println ("A Multiplica��o dos valores e: "+(a*+b));
		System.out.println ("A Divis�o dos valores e: "+(a/b));
		
		if (a+b >= b*b){
			System.out.println ("E maior ou Igual");	
		}
		else {
			System.out.println ("Menor");	
		}
	}

}
