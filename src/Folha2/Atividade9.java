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
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String nome, sexo;
		float salario;
		int idade;
		
		
		
		System.out.println("Informe ser Sexo: ");
		sexo =entrada.nextLine();
		System.out.println("Qual o seu Nome: ");
		nome = entrada.nextLine();
		System.out.println("Informe sua Idade: ");
		idade = entrada.nextInt();
		System.out.println("Informe Seu salario Fixo: ");
		salario = entrada.nextFloat();
		
		
		
		if (sexo.equalsIgnoreCase("m") && idade >= 30){
			System.out.println ("Seu Salario Liquido e de: R$ " + (salario - 100));
	}   else if (sexo.equalsIgnoreCase("m") && idade < 30){ 
			System.out.println ("Seu Salario Liquido e de: R$ " + (salario - 50));
	}	else if (sexo.equalsIgnoreCase("f") && idade >= 30){
			System.out.println ("Seu Salario Liquido e de: R$ " + (salario - 200));
	}	else if (sexo.equalsIgnoreCase("f") && idade < 30){ 
			System.out.println ("Seu Salario Liquido e de: R$ " + (salario - 80));
	} 	else {
		System.out.println ("Sexo informado errado, digitar apenas m ou f minsuculos");
	}
}
}
