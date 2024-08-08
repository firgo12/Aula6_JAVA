package vetor;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] arrayNome = new String [12];
		String [] arrayEstado = new String [12];
		int [] arrayVenda = new int [12];
		float [] arrarComissao = new float [12];
		
		int totalVenda =0, qtdSP = 0, menor = 0, maior =0;
		float totalComissao =0;
		String nomeMaior = null, nomeMenor = null;
		
		for(int i = 0;i<12;i++) {
			System.out.print("Digite o nome do vendedor: ");
			arrayNome[i] = entrada.next();
			System.out.print("Digite o total de vendas: ");
			arrayVenda[i] = entrada.nextInt();
			System.out.print("Digite o valor da comissão: ");
			arrarComissao [i] = (entrada.nextFloat()/100);
			System.out.print("Digite o Estado do vendedor: ");
			arrayEstado[i] = entrada.next();
		}
		
		menor = arrayVenda[0];
		nomeMenor = arrayNome[0];
		
		for(int i = 0;i<12;i++) {
			System.out.println(arrayNome[i] + " - " + arrayVenda[i] + " - "+ arrarComissao[i]+ " - " +(arrarComissao[i]*arrayVenda[i])+ " - "+ arrayEstado[i] );
			
			//c
			totalVenda += arrayVenda[i];
			//d
			totalComissao = (arrarComissao[i]*arrayVenda[i]) + totalComissao;
			
			//e
			if(arrayEstado[i].equalsIgnoreCase("SP")) {
				qtdSP++;
			}
			//f
			if(arrayVenda[i] > maior) {
				maior = arrayVenda[i];
				nomeMaior = arrayNome[i];
			} else {
				if(arrayVenda[i] < menor) {
					menor = arrayVenda[i];
					nomeMenor = arrayNome[i];
				}
			}
		}//fim for
		System.out.println("Total de vendas: "+totalVenda );
		System.out.println("Total de comissão: "+totalComissao);
		System.out.println("Número de vendedor(es) de SP é: "+qtdSP);
		System.out.println("Maior número de vendas: "+ maior + " - " + nomeMaior);
		System.out.println("Menor número de vendas: "+ menor + " - " + nomeMenor);
	
		
	}

}
