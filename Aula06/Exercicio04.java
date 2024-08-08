package vetor;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double [] arrayValorUnit = new double [10];
		int [] arrayQtd = new int [10];
		
		int cont =0, posicao =0;
		double valorProd = 0, valorTotal = 0, maiorValor=0;
		
		//Entrada
		for (int i = 0; i <10;i++) {
			System.out.println("-------------------- Produto "+(i + 1)+"--------------------");
			System.out.print("Informe o valor unitário do produto: ");
			arrayValorUnit[i] = entrada.nextDouble();
			
			System.out.print("Infore a quantidade do produto: ");
			arrayQtd[i] = entrada.nextInt();
			
			if (i == 9) {
				System.out.println("-------------------- Relatório do Produto --------------------");
				i =0;
				while (cont < 10) {
					System.out.println("Qtd: "+ arrayQtd[i]);
					System.out.println("Preço R$"+ arrayValorUnit[i]);
					
					valorProd = arrayValorUnit[i] * arrayQtd[i];
					
					System.out.println("Preço: "+ valorProd);
					
					if( arrayValorUnit[i] > maiorValor) {
						maiorValor = arrayValorUnit[i];
						posicao = i + 1;
					}
					
					valorTotal += valorProd;
					
					cont++;
					i++;
				}
				System.out.println("Preço Total: " + valorTotal);
				
				System.out.println("-------------------- Comissão --------------------");
				System.out.println("Comissão: "+(valorTotal*5)/100);
				
				System.out.println("-------------------- Preço da maior quantidade vendida --------------------");
				System.out.println("Maior valor: "+maiorValor+" - "+posicao);
				
			}//fim se
		}
	}
}
