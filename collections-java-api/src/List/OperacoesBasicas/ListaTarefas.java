package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //List
    private List<Tarefa> tarefaList;

    //Construtor, sempre que instanciar um objeto do tipo ListaTarefa
    //será criado uma nova ArrayList
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void AdicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>(null);
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println("Numero total: "+ lista.obterNumeroTotalTarefas());
        
        lista.AdicionarTarefa("Tarefa 1");
        lista.AdicionarTarefa("Tarefa 1");
        lista.AdicionarTarefa("Tarefa 2");

    

        
    }
}
