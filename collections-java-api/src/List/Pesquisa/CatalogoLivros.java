package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.catalog.CatalogManager;

public class CatalogoLivros {
    private List<Livro> livroList;

    //construtor, sempre que instanciar livroList ele cria uma nova ArrayList
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        //verifica se lista não está vazia.
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        
        //retorna livrosPorAutor
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        //verifica se a lista não está fazia
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        //verifica se lista está vazia
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                livroPorTitulo = l;
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("LIVRO1", "AUTOR1", 2022);
        catalogo.adicionarLivro("LIVRO1", "AUTOR5", 2021);
        catalogo.adicionarLivro("LIVRO10", "AUTOR1", 2021);
        catalogo.adicionarLivro("LIVRO2", "AUTOR2", 1998);
        catalogo.adicionarLivro("LIVRO3", "AUTOR3", 2012);

        System.out.println(catalogo.pesquisarPorAutor("AUTOR1"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogo.pesquisarPorTitulo("LIVRO1"));
    }
    
    

}
