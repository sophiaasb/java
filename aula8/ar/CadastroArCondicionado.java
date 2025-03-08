package ar;
import java.util.ArrayList;
import java.util.List;

public class CadastroArCondicionado {
    private List<ArCondicionado> arCondicionados;

    public CadastroArCondicionado() {
        arCondicionados = new ArrayList<>();
    }

    public void cadastrarArCondicionado(ArCondicionado arCondicionado) {
        arCondicionados.add(arCondicionado);
    }

    public void gerarRelatorio() {
        if (arCondicionados.isEmpty()) {
            System.out.println("Nenhum ar condicionado cadastrado.");
        } else {
            System.out.println("\nRelatório de Ar Condicionados:");
            for (ArCondicionado ar : arCondicionados) {
                ar.exibirInfo();
                System.out.println("-------------------------");
            }
        }
    }
}
