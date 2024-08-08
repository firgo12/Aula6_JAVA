package vetor;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] arrayNome = new String[10];
		int[] arrayCodigo = new int[10];
		float[] arrayPreco = new float[10];
		float[]arrayNovoPreco = new float[10];
		
		int resto=0;
		
		for(int i = 0; i<10;i++){
			System.out.print("Digite o nome do produto: ");
			arrayNome[i] = entrada.next();
			System.out.print("Digite o código do produto: ");
			arrayCodigo[i] = entrada.nextInt();
			System.out.print("Digite o preço do produto: ");
			arrayPreco[i] = entrada.nextFloat();
		}// fim do primeiro for
		
		System.out.println("------------------------------- RELATÓRIO -------------------------------");
		
		for(int cont = 0; cont<10;cont++){
			resto = arrayCodigo[cont] % 2;
			
			if (resto == 0 && arrayPreco[cont] > 1000){
				arrayNovoPreco[cont] = (float)(arrayPreco[cont] * 1.18);
			
			} else{
				if (resto == 0){
					arrayNovoPreco[cont] = (float)(arrayPreco[cont] * 1.12);
				} else{
					if(arrayPreco[cont] > 1000){
						arrayNovoPreco[cont] = (float)(arrayPreco[cont] * 1.15);
					} else{
						arrayNovoPreco[cont] = arrayPreco[cont];
					}
				}
			}
			
			System.out.println(arrayNome[cont] + " - "+ arrayCodigo[cont]+ " - "+ arrayPreco[cont]+ " - "+ arrayNovoPreco[cont]);
		
		}//fim do segundo for
		
		
	}
}
