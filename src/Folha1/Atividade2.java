package Folha1;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade2 {
	
	/*2) Use o programa anterior e acrescente, na linha do nome,
	 *  com espaço de 1 tabulação, o número de sua matrícula.
	 */
	 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = "Renato";
		String disciplina = "Programacao";
		String matricula = "201804025046";
		
		System.out.println("Nome do Aluno: " +nome+" Matricula: " + matricula);
		System.out.println("Nome da Disciplina: "+ disciplina);

	}

}
