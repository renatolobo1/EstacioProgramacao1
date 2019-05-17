package Atividade4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Livro livro1 = new Livro();
		
		System.out.println("Informe o nome do livro1");
		livro1.nome=entrada.nextLine();		
		System.out.println("Informe o Autor do livro1");
		livro1.autor=entrada.nextLine();		
		System.out.println("Informe a Editora do livro1");
		livro1.editora=entrada.nextLine();
		System.out.println("Informe o preço do livro1");
		livro1.preco=Double.parseDouble(entrada.nextLine());
		System.out.println("Informe o ID do livro1"+"\n");
		livro1.codigo=entrada.nextLine();
		
		Livro livro2 = new Livro();
		System.out.println("Informe o nome do livro2");
		livro2.nome=entrada.nextLine();		
		System.out.println("Informe o Autor do livro2");
		livro2.autor=entrada.nextLine();		
		System.out.println("Informe a Editora do livro2");
		livro2.editora=entrada.nextLine();
		System.out.println("Informe o preço do livro2");
		livro2.preco=Double.parseDouble(entrada.nextLine());
		System.out.println("Informe o ID do livro2");
		livro2.codigo=entrada.nextLine();		
		

	}
}
