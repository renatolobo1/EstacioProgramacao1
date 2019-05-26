package EstruturaDeRepetiçãoEHerança;
import java.util.Scanner;

public class Atividade1 {
	
	
	/*
	 * 1)  Escreva um programa em Java para :
	 *·ler o nome do curso ;
	 *·ler as notas de uma turma
	 *·imprimir a média da turma
	 *·imprimir as notas acima da média.
	 * O programa deverá pedir, inicialmente, o total de notas que serão lidas.
	 */
	
	
	
	/* SOBRESCRITA reside quando voce, ao fazer a herança de classes, onde as classes filhas (sub classes) 
	 * herdam todos os métodos da classe pai (super classe), ao declarar o mesmo método com a mesma
	 *  assinatura da classe pai na classe filha, voce está fazendo a sobrescrita desse método na classe filha, 
	 *  ou seja, voce está sobrescrevendo e substituindo pelo mesmo método só que possa estar com uma implementação diferente.
	 *  SOBRECARGA A sobrecarga de métodos consiste em criarmos o mesmo método com possibilidades de entradas diferentes.
	 *   Essas entradas, caracterizadas como parâmetros, devem sempre ser de tipos diferentes, quantidades de parâmetros 
	 *   diferentes ou posições dos tipos diferentes.
	 */
	
	
	
	
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		
		System.out.println("\n"+"Informe o nome do curso:");	
		String curso = entrada.nextLine();
		System.out.println("\n"+"Informe quantidade total de notas a serem inseridas");	
		int quantNotas = entrada.nextInt();
				
		int v[]= new int[quantNotas];
		

			for (int i=0; i<quantNotas;i++){
				System.out.println("\n"+"Informe uma nota:");
				v[i] = entrada.nextInt();
			}
			
			for (int i=0; i<quantNotas;i++){
				media += v[i];
				
			}
			
			System.out.println("\n"+"As notas Aprovadas  ");
			for (int i=0; i<quantNotas;i++){
				
				if(v[i]>=6){
					System.out.print(v[i]+"  ");
								
					
				}
				
				
			}
					
				 
				
			System.out.print("\n");	
			System.out.print("A media da turma e do curso: "+curso+" foi: ");
			System.out.println(media/quantNotas);
		}

}
