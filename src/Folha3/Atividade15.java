package Folha3;

import java.util.Scanner;
/*15. Em um curso de Ci�ncia da Computa��o a nota do estudante � calculada a 
 * partir de tr�s notas atribu�das, respectivamente, a um trabalho de laborat�rio, 
 * a uma avalia��o semestral e a um exame final. As notas variam, de 0 a 10 e a 
 * nota final � a m�dia ponderada das tr�s notas mencionadas. A tabela abaixo fornece
 *  os pesos: 
 * Laborat�rio Peso 2 
 * Avalia��o semestral Peso 3 
 * Exame final Peso 5 
 */

public class Atividade15 {
	
	
	public static void main (String[]args){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		float nota1,nota2,nota3;
		 System.out.println("Informe sua nota do trabalho de Laborat�rio");
		 nota1 = entrada.nextFloat();
		 System.out.println("Informe a Nota da Avalia��o Semestral");
		 nota2 = entrada.nextFloat();
		 System.out.println("Informe a nota do Exame Final");
		 nota3 = entrada.nextFloat();
		 
		 System.out.println((nota1*2+nota2*3+nota3*5)/10);
	}
}
