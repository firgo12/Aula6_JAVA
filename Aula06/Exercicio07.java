package vetor;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] arrayVetor1 = new int [10];
		int [] arrayVetor2 = new int [10];
		int [] arrayResultante = new int [20];
		int j =0;
		
		for(int i = 0; i<10;i++){
			System.out.println("Digite o "+(i+1)+"º"+" do PRIMEIRO vetor: ");
			arrayVetor1[i] = entrada.nextInt();
			System.out.println("Digite o "+(i+1)+"º"+" do SEGUNDO vetor: ");
			arrayVetor2[i] = entrada.nextInt();
		}
		
		//intercalar vetores
		for(int i=0;i<10;i++){
			arrayResultante[j] = arrayVetor1[i];
			System.out.println("Vetor Resultante - posição "+ j + " - valor: "+arrayResultante[j]);
			
			j++;
			
			arrayResultante[j] = arrayVetor2[i];
			System.out.println("Vetor Resultante - posição "+ j + " - valor: "+arrayResultante[j]);
			
			j++;
		}
		

	}

}
