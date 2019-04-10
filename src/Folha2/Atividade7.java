package Folha2;

/**
 * @author renato.lobo [renatolobo_@hotmail.com]
 * @version 1.0
 */
import java.util.Scanner;

public class Atividade7 {
	
	/*7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	 *  percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos 
	 *  sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado).
	 *   Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever
	 *    um algoritmo que leia o custo de fábrica de um carro e informe o custo ao
	 *     consumidor do mesmo.
	 */
	 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double custoFabrica , distribuidor = 0 , imposto = 0;
		
		
		
		
		System.out.println("Qual o custo de facrica do carro: ");
		custoFabrica = entrada.nextDouble();
		imposto = (45*custoFabrica/100+custoFabrica);
		distribuidor = (28*imposto/100+imposto);
		
		System.out.println ("o preço de venda do produto e R$: "+ distribuidor);
		
		
	}

}
