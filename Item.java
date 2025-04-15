//Trabalho feito por Bryan Strey

public class Item {
    private int codigo;
    private String nome;
    private double preco;

    public Item(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome + " R$ " + String.format("%.2f", preco);
    }
}
