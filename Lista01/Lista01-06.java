import java.util.Scanner;
class Lista0106 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		String nome;
		int diasQuantidade;
		double servico;
		int diaria = 60;
		double total;
		
		System.out.println("Informe o nome do cliente: ");
		nome = ler.next();
		System.out.println("Informe quantos dias o cliente ficou hospedado: ");
		diasQuantidade = ler.nextInt();
		
		if(diasQuantidade < 15){
			servico = 8.00;
		}
		else if(diasQuantidade == 15){
			servico = 6.00;
		}
		else{
			servico = 5.50;
		}
		
		total = (diasQuantidade * 60) + (diasQuantidade * servico);
		
		System.out.println("Cliente: " + nome);
		System.out.println("Total: " + total);
	}
}