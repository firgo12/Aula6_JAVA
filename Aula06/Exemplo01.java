import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//String nome = new String();
		//VETOR
		String [] arrayNomes = new String[5];
		
		int i=0, cont=0;
		
		while (i < 5){
			//i gerencia a estrutura de repetição
			//e é utilizado no controle do vetor como o indice
			System.out.print("Digite o nome "+ (i+1) +":");
			arrayNomes[i] = entrada.next();
			i++;
		} //Fim do WHILE
		
		//para exibir qualquer vetor usa estrutura de repetição
		System.out.println("LISTA DE NOMES");
		while (cont < 5){
			System.out.println(arrayNomes[cont]);
			cont++;
		}
	}

}
