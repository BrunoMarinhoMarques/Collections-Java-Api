package List.OperacoesBasicas.Set;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite){
        convidadosSet.add(new Convidado(nome, convite));


    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;

        for(Convidado c:convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Bruno", 1);
        conjuntoConvidados.adicionarConvidado("Andre", 1);
        conjuntoConvidados.adicionarConvidado("Fernanda", 3);

        System.out.println(conjuntoConvidados.contarConvidados());

      // conjuntoConvidados.removerConvidadoPorCodigoConvite(1);

        System.out.println(conjuntoConvidados.contarConvidados());
       conjuntoConvidados.exibirConvidados();
    }

}
