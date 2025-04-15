import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Fazer Pedido");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 2) {
                System.out.println("Encerrando programa...");
                break;
            } else if (opcao == 1) {
                System.out.print("Nome do cliente: ");
                String nome = scanner.nextLine();
                Pedido pedido = new Pedido(nome);

                cardapio.exibirCardapio();

                while (true) {
                    System.out.print("Digite o número do item (ou 0 para finalizar): ");
                    int codigo = scanner.nextInt();

                    if (codigo == 0) {
                        break;
                    }

                    Item item = cardapio.buscarItemPorCodigo(codigo);
                    if (item != null) {
                        pedido.adicionarItem(item);
                        System.out.println(item.getNome() + " adicionado ao pedido.");
                    } else {
                        System.out.println("Código inválido.");
                    }
                }

                pedido.exibirNotaFiscal();

                System.out.print("Digite o valor pago pelo cliente: R$ ");
                double pago = scanner.nextDouble();

                double troco = pago - pedido.calcularTotalComTaxa();
                if (troco >= 0) {
                    System.out.println("Troco: R$ " + String.format("%.2f", troco));
                } else {
                    System.out.println("Valor insuficiente! Faltam R$ " + String.format("%.2f", -troco));
                }
            }
        }

        scanner.close();
    }
}
