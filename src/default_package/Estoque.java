package default_package;

public class Estoque {
	Produto[] produtos;
	
	//colocar modificador de visibilidade public/private
	void listarProdutos() {
		System.out.println("Produtos em estoque:");
		System.out.println("---------------------");
		
		for(int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}
	

}
