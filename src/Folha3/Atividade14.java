package Folha3;

import java.util.Scanner;


public class Atividade14 {
	
	public static void main (String[]args){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("unused")
		String nome, sexo;
		double altura;
		int idade;
		
		System.out.println("Informe seu Nome");
		nome = entrada.nextLine();
		System.out.println("Informe Seu Sexo, m ou f");
		sexo = entrada.nextLine();
		System.out.println("Informe sua Idade");
		idade = entrada.nextInt();
		System.out.println("Informe sua Altura");
		altura = entrada.nextDouble();
		
		if (sexo.equalsIgnoreCase("m")){
			if (altura > 1.70){
				if (idade <=20){
					System.out.println((72.7*altura)-58);
					
				}else if (idade >=40){
					System.out.println((72.7*altura)-45);
						
				}else  {
					System.out.println((72.7*altura)-53);
						
				}
			}
			if (altura <= 1.70){
				if (idade <=40){
					System.out.println((72.7*altura)-50);
					
				}
				else {
					System.out.println((72.7*altura)-58);
					
				}
			}
		}
		if (sexo.equalsIgnoreCase("f")){
			if (altura <= 1.50){
			  if (idade >=35) {
				System.out.println((62.1*altura)-45);
				
			} else if (idade<35) {
				System.out.println((62.1*altura)-49);
				
			}
		}else {
			System.out.println((62.1*altura)-44.7);
			
		}
	}
 }
}