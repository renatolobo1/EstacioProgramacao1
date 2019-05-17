package Folha3;

import java.util.Scanner;

public class Atividade16 {
	
	
	public static void main (String[]args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		String nome, matricula;
		double nota1, nota2, nota3;
		
		System.out.println("Informe o nome do Estudante");
		nome = entrada.nextLine();
		System.out.println("Informe a Matricula do Estudante");
		matricula = entrada.nextLine();
		System.out.println("Informe a Primeira nota do Estudante");
		nota1 = entrada.nextDouble();
		System.out.println("Informe a Segunda nota do Estudante");
		nota2 = entrada.nextDouble();
		System.out.println("Informe a Terceira nota do Estudante");
		nota3 = entrada.nextDouble();
		double media = (nota1 + nota2+nota3)/3;
		
		if (media > 8 && media <= 10){
			System.out.println(nome+" Matricula: "+matricula+"Sua nota final e: "+media
			+" Ficou na classificação: A ");
		} else if (media >7 && media <= 8){
			System.out.println(nome+" Matricula: "+matricula+"Sua nota final e: "+media
			+" Ficou na classificação: B ");
		} else if (media >6 && media <= 7){
			System.out.println(nome+" Matricula: "+matricula+"Sua nota final e: "+media
			+" Ficou na classificação: C ");
		} else if (media >5 && media <= 7){
			System.out.println(nome+" Matricula: "+matricula+"Sua nota final e: "+media
			+" Ficou na classificação: D ");
		}	else {
			System.out.println(nome+" Matricula: "+matricula+"Sua nota final e: "+media
			+" Ficou na classificação: E ");
		}
	}
}
