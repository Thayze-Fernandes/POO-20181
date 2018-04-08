import java.util.Scanner;
class Lista0109 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int numero;
		int impar = 0;
		int par = 0;
		int soma =0;
		
		for (int i = 0; i < 2; i++){
			System.out.println("Informe um numero: ");
			numero = ler.nextInt();
			
			soma += numero;
			if(numero %2 != 0){
				impar += 1;
			}
			else{
				par += 1;
			}
		}
		
		System.out.println("A quantidade de numeros pares e: " + par);
		System.out.println("A quantidade de numeros impares e: " + impar);
		System.out.println("A soma entre os numeros e: " + soma);
	}
}
			
			
			