package Folha1;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */


public class Atividade1 {
	
	/* 1) Escreva um programa em Java que imprima seu nome e na linha abaixo, 
	 * o nome da disciplina. SELECT id, tipo, round (quantidade,0), valor_unitario, to_char("data_cadastro", 'DD/MM/YYYY') 
	FROM almoxarifado.vw_entradas_saidas
 order by data_cadastro asc;
	*/
	
	public static void main(String[] args) {
		
		
		
		String nome = "Renato";
		String disciplina = "Programacao";
		
		
		System.out.println("Nome do Aluno: " +nome);
		System.out.println("Nome da Disciplina: "+ disciplina);
	}

}
