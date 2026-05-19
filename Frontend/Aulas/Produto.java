import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    String nome;
    int quantidade;
    double preco;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void Exibir() {
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("quantidade: " + quantidade);
        System.out.println("--------------------------");
    }
}

class SistemaMercado {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Produto> listarProdutos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
    case 1:
        cadastrarProduto();
        break;
    case 2:
        listarProdutos();
        break;
    case 3:
        System.out.println("Saindo do Sistema...");
        break;
    default:
        System.out.println("Opção inválida");
        break;
}
        } while (opcao != 3);
        sc.close();
    }

    public static int menu() {
        System.out.println("\n======== MERCADO ADO ========");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Lista de produtos");
        System.out.println("3 - Sair");
        System.out.println("Escolha uma opção");
        return sc.nextInt();
    }

    public static void cadastrarProduto() {
        sc.nextLine();
        System.out.println("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto p = new Produto(nome, preco, quantidade);
        listarProdutos.add(p);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void listarProdutos() {
        if (listarProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("\n=== LISTA DE PRODUTOS ===");
        for (Produto p : listarProdutos) {
            p.Exibir();
        }
    }
}