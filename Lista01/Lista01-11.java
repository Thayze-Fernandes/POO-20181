import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Lista0111 {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		List<Integer> produtosPedidos = new ArrayList<Integer>();
		int codProduto;

		int quantidade;
		double total = 0;
		
		System.out.println("            CARDAPIO            ");
        System.out.println("Especificacao       Cod   Preco");
        System.out.println("Pastel de carne      10    R$1,50");
        System.out.println("Coxinha de frango    11    R$1,80");
        System.out.println("Empada de frango     12    R$1,90");
        System.out.println("Hamburguer           13    R$10,00");
        System.out.println("Pizza                14    R$8,0");
        System.out.println("Suco                 15    R$2,50");
		
		while (true){
			System.out.print("Digite o codigo do produto ou 0 caso tenha encerrado o pedido: ");
			codProduto = entrada.nextInt();
			
			if (codProduto == 0){
				break;
			}
			
			switch (codProduto){
				case (10):
					produtosPedidos.add(codProduto);
					total += 1.50;
				
					break;
				case (11):
					produtosPedidos.add(codProduto);
					total += 1.80;
	 
					break;
				case (12):
					produtosPedidos.add(codProduto);
					total += 1.90;
	 
					break;
				case (13):
					produtosPedidos.add(codProduto);
					total += 10.00;
	 
					break;
				case (14):
					produtosPedidos.add(codProduto);
					total += 8.00;
	 
					break;
				case (15):
					produtosPedidos.add(codProduto);
					total += 2.50;
					
					break;
	 
				default:
					System.out.println("Codigo incorreto!\n");
					break;
			}
		}
		quantidade = produtosPedidos.size();
		
		System.out.println("Codigo dos produtos pedidos: ");
		for (int cod : produtosPedidos){
			System.out.println("codigo do item: " + cod);
		}
		System.out.println("Quantidade de produtos " + quantidade);
		
		if(total > 50.00){
			total = total - total*0.05;
		}
				
        System.out.println("Total: R$ " + total);
 
    } 

} 