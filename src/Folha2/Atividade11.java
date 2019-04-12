package Folha2;

/*11. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça 
 * um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o valor
 *  da hora/aula segue a tabela abaixo: 
*Professor Nível 1 R$12,00 por hora/aula 
*Professor Nível 2 R$17,00 por hora/aula 
*Professor Nível 3 R$25,00 por hora/aula 
*/
import java.util.Scanner;

public class Atividade11 {

	public static void main (String[]args){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int nivel;
		float hora;
		
		System.out.println("Informe o Nome do Professor");
		nome = entrada.nextLine();
		System.out.println("Informe Quantidade de hora Trabalhada pelo professor");
		hora = entrada.nextFloat();
		System.out.println("Informe o Nivel do Professor 1 ou 2 ou 3 ");
		nivel = entrada.nextInt();
		
		
		if (nivel == 1){
			System.out.println("O salario do Professor "+nome+" e de R$: "+(hora * 12));
		} else if (nivel == 2){
			System.out.println("O salario do Professor "+nome+" e de R$: "+(hora * 17));
		} else if (nivel == 3){
			System.out.println("O salario do Professor "+nome+" e de R$: "+(hora * 25));
		} else {
			System.out.println("O Nivel informado e inexistente, faça novamente");
		}
		
	}
	
}
