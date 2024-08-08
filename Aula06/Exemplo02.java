import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//String nome = new String();
		//VETOR
		String [] arrayNomes = new String[5];
		int [] arrayIdade = new int[5];
		
		int i=0, cont=0;
		
		while (i < 5){
			//i gerencia a estrutura de repetição
			//e é utilizado no controle do vetor como o indice
			System.out.print("Digite o nome do atleta "+ (i+1) +":");
			arrayNomes[i] = entrada.next();
			System.out.print("Digite a idade do atleta "+ (i+1) +":");
			arrayIdade[i] = entrada.nextInt();
			i++;
		} //Fim do WHILE
		
		//para exibir qualquer vetor usa estrutura de repetição
		System.out.println("LISTA DE ATLETAS COM IDADE SUPERIOR 21 ANOS");
		while (cont < 5){
			if (arrayIdade[cont] > 21){
				System.out.println(arrayNomes[cont]);
			}
			cont++;
		}
	}

}