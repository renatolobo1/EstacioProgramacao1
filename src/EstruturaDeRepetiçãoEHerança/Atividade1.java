package EstruturaDeRepeti��oEHeran�a;
import java.util.Scanner;

public class Atividade1 {
	
	
	/*
	 * 1)  Escreva um programa em Java para :
	 *�ler o nome do curso ;
	 *�ler as notas de uma turma
	 *�imprimir a m�dia da turma
	 *�imprimir as notas acima da m�dia.
	 * O programa dever� pedir, inicialmente, o total de notas que ser�o lidas.
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
