package Atividade4;

import java.util.Scanner;

public class Main {
	
	public static void compara (Livro x, Livro y){
		
		if (x.getPreco() > y.getPreco()){
			
			System.out.println(x.getEditora());
		} else {
			System.out.println(y.getEditora());
		}
		
		
		
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		Livro livro1 = new Livro();
		
		System.out.println("Informe o nome do livro1");
		livro1.setNome(entrada.nextLine());		
		System.out.println("Informe o Autor do livro1");
		livro1.setAutor(entrada.nextLine());		
		System.out.println("Informe a Editora do livro1");
		livro1.setEditora(entrada.nextLine());
		System.out.println("Informe o preço do livro1");
		livro1.setPreco(Double.parseDouble(entrada.nextLine()));
		System.out.println("Informe o ID do livro1");
		livro1.setCodigo(entrada.nextLine());
		
		Livro livro2 = new Livro();
		System.out.println("Informe o nome do livro2");
		livro2.setNome(entrada.nextLine());		
		System.out.println("Informe o Autor do livro2");
		livro2.setAutor(entrada.nextLine());		
		System.out.println("Informe a Editora do livro2");
		livro2.setEditora(entrada.nextLine());
		System.out.println("Informe o preço do livro2");
		livro2.setPreco(Double.parseDouble(entrada.nextLine()));
		System.out.println("Informe o ID do livro2");
		livro2.setCodigo(entrada.nextLine());		
		
		
		//System.out.println("Informe o nome do livro2");
		//livro2.setNome(entrada.nextLine());
		
		//System.out.println(livro2.getNome());
		
		compara(livro1 , livro2);
		
		
	}
}
