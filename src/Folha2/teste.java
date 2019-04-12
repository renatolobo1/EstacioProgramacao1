package Folha2;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class teste {
	
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int produto, parcela;
		double valorParcela=0, juros=0,resposta=0;
		
		System.out.println("Informe o preço do produto: ");
		produto = entrada.nextInt();
		System.out.println("Informe quantidade de Parcela: ");
		parcela = entrada.nextInt();
		
		for (int i=0; i< parcela; i++) {
			
			valorParcela = (produto/parcela);
			resposta=valorParcela+juros;
			juros =juros+ valorParcela*0.02;
			System.out.println("Parcela "+ (i+1) + " - R$" + resposta);
			
		}
		
		
	}

}
