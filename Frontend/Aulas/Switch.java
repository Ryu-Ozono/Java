import java.util.Scanner;
public class Switch {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        int opcao = scanner.nextInt();
            switch (opcao) {
            
                case 1:
                System.out.println("Cadastrar usuário");
                break;

                case 2:
                System.out.println("Listar usuários");
                break;
                
                case 3:
                System.out.println("Digite o RA");
                break;
                
                case 4:
                System.out.println("Número da matrícula");
                break;

                default:
                System.out.println("Saída...");
                break;
            }
        
        scanner.close();
    }
}