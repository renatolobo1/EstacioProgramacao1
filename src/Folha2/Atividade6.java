package Folha2;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade6 {
	
	/*6. Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor 
	 * de venda. Sabe-se que o pre�o de custo receber� um acr�scimo de acordo com um 
	 * percentual informado pelo usu�rio. 
	 */
	 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double pc, percentual; 
		double pv = 0;
		
		
		
		System.out.println("Informe o pre�o de custo do produto: ");
		pc = entrada.nextDouble();
		System.out.println("Informe o porcentual a ser acrescentado no produdo: ");
		percentual = entrada.nextDouble();
		pv= (pc*percentual/100+pc);
		System.out.println ("o pre�o de venda do produto e: "+ pv);
		
		
	}

}
