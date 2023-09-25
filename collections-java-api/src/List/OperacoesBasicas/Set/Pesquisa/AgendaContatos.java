package List.OperacoesBasicas.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;


    
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }


    
    public static void main(String[] args) {
        //adicionando contatos
        AgendaContatos agenda =  new AgendaContatos();
        agenda.adicionarContato("Bruno", 123);
        agenda.adicionarContato("Bruno h", 123456);
        agenda.adicionarContato("Fernanda", 1234);
        agenda.adicionarContato("Nena", 12345);

        //exibindo contatos
        agenda.exibirContato();

        //pesquisando por nome
        System.out.println(agenda.pesquisarPorNome("Fernanda"));
    }
    
}


