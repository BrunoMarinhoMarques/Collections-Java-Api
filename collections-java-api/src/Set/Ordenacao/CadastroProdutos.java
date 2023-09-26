package List.OperacoesBasicas.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    
    private Set<Produto> produtoSet;

  

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

   public void adicionarProduto(String nome, long cdigo, double preco, int quantidade){
    produtoSet.add(new Produto(nome, cdigo, preco, quantidade));
   }

   public Set<Produto> exibirProdutosPorNome(){
    //TreeSet permite deixar os produtos organizados
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

    //retorna os produtos organizados, por conta do compareTo que está na classe Produto
    return produtosPorNome;

   }

   public Set<Produto> exibirProdutosPorPreco(){
    //passo o comparator que diz a forma como eu quero organizar o TreeSet;
    //que verifica o comparable na classe Produto e utilizar para organizar comparando os preços dos produtos
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
   }


   public static void main(String[] args) {
    CadastroProdutos cadastroProdutos =  new CadastroProdutos();
    
    cadastroProdutos.adicionarProduto("Banana", 1, 10.50, 2);
    cadastroProdutos.adicionarProduto("Maca", 2, 11.20, 5);
    cadastroProdutos.adicionarProduto("Bolacha", 3, 15.50, 8);
    cadastroProdutos.adicionarProduto("Mamao", 4, 18.50, 9);

    System.out.println(cadastroProdutos.produtoSet);
    System.out.println(cadastroProdutos.exibirProdutosPorNome());
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    
   }

    
}
