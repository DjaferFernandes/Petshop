import java.util.ArrayList;
import java.util.List;

public class Inventario{
    private static List<Servicos> servicos;

    public Inventario() {
        Inventario.servicos = new ArrayList<>();
    }

    public void adicionaServico(Servicos servico) {
        Inventario.servicos.add(servico);
    }

    public static double ValorTotal() {
        double total = 0;
        for (Servicos servico : servicos) {
            total += servico.getPreco();
        }
        return total;
    }

    public void ImprimirRelatorio() {
        System.out.println("Relatório:");
        for (Servicos servico : servicos) {
            System.out.println("Tipo de Serviço: " + servico.getTipo());
            System.out.printf("Valor Total:" + servico.getPreco() + "\n");
        }
        System.out.printf("Total Recebido: R$"+ Inventario.ValorTotal());
    }

}