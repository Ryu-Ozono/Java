package Concessionária;


public class Main {

public static void main(String[] args) {
    SistemaConcessionária s = new SistemaConcessionária();
            int opcao;
            do {
                opcao = s.menu();
                switch (opcao) {
                    case 1:
                        SistemaConcessionária.cadastrarVeículos();
                        break;
                    case 2:
                        SistemaConcessionária.listarVeículos();
                        break;
                    case 3:
                        System.out.println("Saindo do Sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } while (opcao != 3);
            SistemaConcessionária.sc.close();
        }

    
       
        public static int menu() {
            System.out.println("\n======== Concessionária ========");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Lista de Veículos");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção");
            return SistemaConcessionária.sc.nextInt();
        }
    }
