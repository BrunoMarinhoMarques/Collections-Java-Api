package List.OperacoesBasicas.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(agendaContatoMap.size()!=0){
            agendaContatoMap.remove(nome);
        }

    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        //caso for diferente de vazio ele executa
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    

    public static void main(String[] args) {
        //instancia do tipo AgendaContatos
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Bruno", 123);
        agenda.adicionarContato("Bruno", 12345);
        agenda.adicionarContato("Bruno Henrique", 567);
        agenda.adicionarContato("Fernanda", 1235698);

        //exibe contatos
        agenda.exibirContatos();

        //remove contato
       agenda.removerContato("Bruno Henrique");

       //exibe contatos
       agenda.exibirContatos();

       System.out.println(agenda.pesquisarPorNome("Bruno"));
    }

}
