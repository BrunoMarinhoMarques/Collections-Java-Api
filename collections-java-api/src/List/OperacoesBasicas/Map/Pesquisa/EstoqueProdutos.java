package List.OperacoesBasicas.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        //passando a chave e os valores
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void imprimirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0.0;
        if(!estoqueProdutosMap.isEmpty()){
            //método values retorna coleção do tipo produto, então assim conseguindo pegar o preco e quantidade  dos produtos
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        //MIN_VALUE pega o menor valor de Double
        //quando o laco de repeticao começar o maior valor será o primeiro, ai depois ele só vai fazendo ass comparações
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
             for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    
                    produtoMaisCaro = p;
                }
                maiorPreco = p.getPreco();
             }
        }

        return produtoMaisCaro;
       
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

         estoque.imprimirProdutos();
        estoque.adicionarProduto(1, "Banana", 10, 15.0);
        estoque.adicionarProduto(2, "Maca", 5, 10.0);
        estoque.adicionarProduto(3, "Pera", 2, 5.0);

        estoque.imprimirProdutos();

        System.out.println(estoque.calculaValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
    }
}
