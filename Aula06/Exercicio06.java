package vetor;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] arrayGabarito = new String []
				{"A","A","A","A","A","A","A","A"};
		String [] respostas = new String [8];
		
		int numero =0, aprov =0;
		double nota =0, porc=0;
		
		//Aluno
		for(int i=0; i<10;i++){
			
			System.out.println("Aluno "+(i+1));
			System.out.println("Digite o número do " +(i+1)+" aluno: ");
			numero = entrada.nextInt();
			
			//carregar respostas
			for(int resp=0;resp<8;resp++){
				System.out.print("Digite a resposta do aluno "+numero+" à "+ (resp+1)+" questão: ");
				
				respostas[resp]=entrada.next();
				
				if(arrayGabarito[resp].equalsIgnoreCase(respostas[resp])){
					nota++;
				}
				
			}//for resp
			System.out.println("A nota do aluno "+numero+" é: "+ nota);
			
			if(nota >= 6){
				aprov++;
			}
			
			nota=0;
		}// for aluno
		
		//verificar porcentagem
		porc = (double)aprov/10* 100;
		System.out.println("Porcentagem de alunos aprovados é: "+porc+"%");

	}

}
