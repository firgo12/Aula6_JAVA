import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// TODO Auto-generated method stub

		String arrayNomes [] = new String[10];
		
		int i=0, cont =0;
		String nome;
		
		//Entrada
		while(i <10){
			System.out.print("Digite o nome "+(i+1)+":");
			arrayNomes[i] = entrada.next();
			
			i++;
		}
		
		//Processamento
		System.out.print("Procure um nome da lista : ");
		nome = entrada.next();
		
		while (cont < 10){
			if (arrayNomes[cont].equalsIgnoreCase(nome)){
				System.out.println("Achei -"+(cont+1)+" - "+arrayNomes[cont]);
			} else {
				System.out.println("N�o achei");
			}
			cont++;
		}
	}

}
