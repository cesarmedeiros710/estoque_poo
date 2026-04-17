import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        System.out.print("Quantidade vendida: ");
        int vendida = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        if (!produto.vender(vendida)) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }

        sc.close();
    }
}