//Trabalho feito por Bryan Strey

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Item> itens = new ArrayList<>();

    public Cardapio() {
        itens.add(new Item(1, "Hamburguer", 20.0));
        itens.add(new Item(2, "Batata Frita", 10.0));
        itens.add(new Item(3, "Refrigerante", 5.0));
        itens.add(new Item(4, "Suco Natural", 7.0));
        itens.add(new Item(5, "Sobremesa", 12.0));
    }

    public void exibirCardapio() {
        System.out.println("\n--- CARDÁPIO ---");
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public Item buscarItemPorCodigo(int codigo) {
        for (Item item : itens) {
            if (item.getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }
}
