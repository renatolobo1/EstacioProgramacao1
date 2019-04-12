package Folha3;

import java.util.Scanner;
/*15. Em um curso de Ciência da Computação a nota do estudante é calculada a 
 * partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, 
 * a uma avaliação semestral e a um exame final. As notas variam, de 0 a 10 e a 
 * nota final é a média ponderada das três notas mencionadas. A tabela abaixo fornece
 *  os pesos: 
 * Laboratório Peso 2 
 * Avaliação semestral Peso 3 
 * Exame final Peso 5 
 */

public class Atividade15 {
	
	
	public static void main (String[]args){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		float nota1,nota2,nota3;
		 System.out.println("Informe sua nota do trabalho de Laboratório");
		 nota1 = entrada.nextFloat();
		 System.out.println("Informe a Nota da Avaliação Semestral");
		 nota2 = entrada.nextFloat();
		 System.out.println("Informe a nota do Exame Final");
		 nota3 = entrada.nextFloat();
		 
		 System.out.println((nota1*2+nota2*3+nota3*5)/10);
	}
}
