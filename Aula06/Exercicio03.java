package vetor;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double [] arrayTemperaturaMedia = new double[12];
		String [] arrayMeses = new String [] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		int i=0, mesMaior =0, mesMenor=0; 
		double tempMaior = 0, tempMenor =0;

		//Entrada
		while (i < 12){
			System.out.print("Digite a temperatura média do mês de "+arrayMeses[i]+":");
			arrayTemperaturaMedia[i] = entrada.nextDouble();
			
			if (i == 0){
				mesMaior = i;
				tempMaior =arrayTemperaturaMedia[i];
				
				mesMenor = i;
				tempMenor =arrayTemperaturaMedia[i];
			}else{
				if(arrayTemperaturaMedia[i]< tempMenor){
					mesMenor = i;
					tempMenor = arrayTemperaturaMedia[i];
				}
				if(arrayTemperaturaMedia[i] > tempMaior){
					mesMaior = i;
					tempMaior = arrayTemperaturaMedia[i];
				}
			}
			
			i++;
		}//Fim While
		
		//Saída
		System.out.println("Maior Temperatura: " +tempMaior+" - Mês:"+arrayMeses[mesMaior]);
		System.out.println("Menor Temperatura: " +tempMenor+" - Mês:"+arrayMeses[mesMenor]);

	}

}
