package List.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoPessoa {
    

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void AdicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));    
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String [] args){
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();
        ordenacao.AdicionarPessoa("Bruno", 24, 1.80);
        ordenacao.AdicionarPessoa("Fernanda", 26, 1.58);
        ordenacao.AdicionarPessoa("Vicente", 82, 1.70);
        ordenacao.AdicionarPessoa("Braislia", 78, 1.56);

        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.ordenarPorAltura());

    }

}
