package vetor;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] arrayNomes = new String [5];
		double [] arraySalario = new double [5];
		int [] arrayTempo = new int [5];
		int aumento=0;
		
		//Entrada

		for(int i = 0; i < 5; i++){
			System.out.print("Digite o nome do funcion�rio: ");
			arrayNomes[i] = entrada.next();
			
			System.out.print("Digite o sal�rio do funcion�rio: ");
			arraySalario[i] = entrada.nextDouble();
			
			System.out.print("Digite o tempo de servi�o do funcion�rio: ");
			arrayTempo[i] = entrada.nextInt();
			
				if (i == 4){
					i = 0;
					System.out.println("--------------------------- FUNCION�RIOS QUE N�O TEM DIREITO AO AUMENTO ---------------------------");
					for(int contDois = 0; contDois < 5;contDois++){
						if(arrayTempo[i] <= 5 && arraySalario[i] >= 780) {
							System.out.println(arrayNomes[i]);
						}
						i++;
					}
					i = 0;
					System.out.println("--------------------------- FUNCION�RIOS QUE TEM DIREITO AO AUMENTO ---------------------------");
					for(int cont=0;cont<5;cont++){
								if(arrayTempo[i] > 5 && arraySalario[i] < 780){
									arraySalario[i] = arraySalario[i] * 1.35;
									System.out.println(arrayNomes[i] + " - " + arraySalario[i]);
								} else{
									if (arrayTempo[i] > 5){
										arraySalario[i] = arraySalario[i] * 1.25;
										System.out.println(arrayNomes[i] + " - " + arraySalario[i]);
									} else {
										if (arraySalario[i] < 780){
											arraySalario[i] = arraySalario[i] * 1.15;
											System.out.println(arrayNomes[i] + " - " + arraySalario[i]);
										} 
									}
								}
								i++;
					}
				}	
					
		}//fim for

	}

}
