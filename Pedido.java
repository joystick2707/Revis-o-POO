//Trabalho feito por Bryan Strey

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private List<Item> itens = new ArrayList<>();

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public double calcularTaxaServico() {
        return calcularTotal() * 0.10;
    }

    public double calcularTotalComTaxa() {
        return calcularTotal() + calcularTaxaServico();
    }

    public void exibirNotaFiscal() {
        System.out.println("\n--- NOTA FISCAL ---");
        System.out.println("Cliente: " + nomeCliente);
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + ": R$ " + String.format("%.2f", item.getPreco()));
        }
        System.out.println("Subtotal: R$ " + String.format("%.2f", calcularTotal()));
        System.out.println("Taxa de Serviço (10%): R$ " + String.format("%.2f", calcularTaxaServico()));
        System.out.println("Total com Taxa: R$ " + String.format("%.2f", calcularTotalComTaxa()));
    }
}
