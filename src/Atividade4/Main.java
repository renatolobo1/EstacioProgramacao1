package Atividade4;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Livro livro = new Livro();
		livro.setCodigo(1);
		System.out.println("Digite o Nome do Livro: ");
		livro.setNome(entrada.next());
		System.out.println("Digite o Autor do Livro:");
		livro.setAutor(entrada.next());
		System.out.println("Digite o Editora do Livro:");
		livro.setEditora(entrada.next());
		System.out.println("Digite o preço do Livro: ");
		livro.setPreco(entrada.nextDouble());
		
		

	}
}
