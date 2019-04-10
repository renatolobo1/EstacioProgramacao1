package Folha2;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade6 {
	
	/*6. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor 
	 * de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um 
	 * percentual informado pelo usuário. 
	 */
	 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double pc, percentual; 
		double pv = 0;
		
		
		
		System.out.println("Informe o preço de custo do produto: ");
		pc = entrada.nextDouble();
		System.out.println("Informe o porcentual a ser acrescentado no produdo: ");
		percentual = entrada.nextDouble();
		pv= (pc*percentual/100+pc);
		System.out.println ("o preço de venda do produto e: "+ pv);
		
		
	}

}
