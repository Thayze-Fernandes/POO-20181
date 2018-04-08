import java.util.Scanner;
class Lista0110 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int numero;
		float divisao;
		int quantidadeDivisoes = 0;

		System.out.println("Informe um numero: ");
		numero = ler.nextInt();
		
		do{
			numero / 2;
		//	divisao = numero / 2;
			quantidadeDivisoes += 1;
		
		} while(numero >= 1);
			
		System.out.println("O resultado da ultima divisao e: " + divisao);
		System.out.println("O numero de divisoes realizadas foi: " + quantidadeDivisoes);
	}
}