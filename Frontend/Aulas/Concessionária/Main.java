package Concessionária;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) {
            int opcao;
            do {
                opcao = menu();
                switch (opcao) {
                    case 1:
                        SistemaConcessionaria.cadastrarVeiculos();
                        break;
                    case 2:
                        SistemaConcessionaria.listarVeiculos();
                        break;
                    case 3:
                        System.out.println("Saindo do Sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } while (opcao != 3);
            SistemaConcessionaria.sc.close();
        }

    
       
        public static int menu() {
            System.out.println("\n======== Concessionária ========");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Lista de Veículos");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção");
            return SistemaConcessionaria.sc.nextInt();
        }
    }
