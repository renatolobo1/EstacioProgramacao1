package Folha2;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade9 {
	
	/*9. Faça um algoritmo que receba o nome a idade, o sexo e salário fixo de um 
	 * 
	 * funcionário. Mostre o nome e o salário líquido: 
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome, sexo;
		float salario;
		int idade;
		
		
		
		System.out.println("Qual a sua tereceira nota: ");
		sexo = entrada.nextLine();
		System.out.println("Qual o seu Nome: ");
		nome = entrada.nextLine();
		System.out.println("Qual a sua primeira nota: ");
		idade = entrada.nextInt();
		System.out.println("Qual a sua segunda nota: ");
		salario = entrada.nextFloat();
		
		float media = ((nota1+nota2+nota3)/3);
		
		if (sexo = m  ){
		
		System.out.println (nome + " Você foi Aprovado com a media: "+media);
	}   else if(media <=5){
		System.out.println (nome + " Você foi Reprovado com a media: "+media);
	} else {
		System.out.println (nome + " Você Ficou de Recuteração com a media: "+media);
	}

}
}
