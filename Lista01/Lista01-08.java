import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Lista0108 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<Integer>();
		double media;
		int numero;
		int soma = 0;
		int maximo = 0;
		int minimo = 0;
		
		
		for (int i = 0; i < 10; i++){
			System.out.println("Informe um numero: ");
			numero = ler.nextInt();
			soma += numero; 
			numeros.add(numero);
			if(i == 0){
				maximo = numero;
				minimo = numero;
			}
			else if(maximo < numero){
				maximo = numero;
			}
			
			else if(minimo > numero){
				minimo = numero;
			}
		}

		media = soma / numeros.size();
		
		System.out.println("O numero maximo e: " + maximo);
		System.out.println("O numero minino e: " + minimo);
		System.out.println("A media dos numeros e: " + media);
	}
}