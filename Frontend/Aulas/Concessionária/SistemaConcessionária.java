package Concessionária;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaConcessionária {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Veículo> listarVeiculos = new ArrayList<>();

    public static void cadastrarVeículos() {
        sc.nextLine();
        System.out.println("Marca do veículo: ");
        String marca = sc.nextLine();

        System.out.println("Modelo do veículo: ");
        String modelo = sc.nextLine();

        System.out.println("Ano do veículo: ");
        String ano = sc.nextLine();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();

    Veículo p = new Veículo(marca, modelo, ano, preco, quantidade);
        listarVeiculos.add(p);

        System.out.println("Produto cadastrado com sucesso!");
    }
     
    public static void listarVeículos() {
        if (listarVeículos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("\n=== LISTA DE PRODUTOS ===");
        for (Veículo p : listarVeiculos) {
            p.exibir();
        }
    }
}
