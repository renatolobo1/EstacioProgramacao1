package Folha2;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade8 {
	
	/*8. Escrever um algoritmo que leia o nome e as tr�s notas obtidas por um aluno durante 
	 * o semestre. Calcular a sua m�dia (aritm�tica), informar o nome e sua men��o aprovado
	 *  (media >= 7), Reprovado (media <= 5) e Recupera��o (media entre 5.1 a 6.9).
	 */
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		float nota1 , nota2  , nota3;
		
		
		
		
		System.out.println("Qual o seu Nome: ");
		nome = entrada.nextLine();
		System.out.println("Qual a sua primeira nota: ");
		nota1 = entrada.nextFloat();
		System.out.println("Qual a sua segunda nota: ");
		nota2 = entrada.nextFloat();
		System.out.println("Qual a sua tereceira nota: ");
		nota3 = entrada.nextFloat();
		float media = ((nota1+nota2+nota3)/3);
		
		if (media >= 7 ){
		
		System.out.println (nome + " Voc� foi Aprovado com a media: "+media);
	}   else if(media <=5){
		System.out.println (nome + " Voc� foi Reprovado com a media: "+media);
	} else {
		System.out.println (nome + " Voc� Ficou de Recutera��o com a media: "+media);
	}

}
}
