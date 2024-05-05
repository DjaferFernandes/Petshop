import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventario inventario = new Inventario();

        while (true) {
            exibirMenu();

            System.out.print("Escolha uma opção (1 - Banho, 2 - Hotel, 3 - Tosa, 4 - fechar programa): ");
            int opcaoCliente = Integer.valueOf(scanner.nextLine());

            if (opcaoCliente == 4) {
                break;
            }

            System.out.print("Tipo do animal (P - porte pequeno, M - porte médio, G - porte grande): ");
            String tamanhoAnimal = scanner.nextLine().toLowerCase();

            System.out.print("Tipo de pelo (Curto, Médio ou Longo): ");
            String tipoPelo = scanner.nextLine().toLowerCase();

            Servicos servico = null;

            switch (opcaoCliente) {
                case 1:
                    servico = new Banho(opcaoCliente, tamanhoAnimal, tipoPelo);
                    break;
                case 2:
                    System.out.print("Quantidade de horas no hotel: ");
                    int horas = Integer.parseInt(scanner.nextLine());
                    servico = new Hotel(opcaoCliente, tamanhoAnimal, horas);
                    break;
                case 3:
                    servico = new Tosa(opcaoCliente, tamanhoAnimal);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            inventario.adicionaServico(servico);

            System.out.println("Serviço adicionado ao inventário.");
        }

        inventario.ImprimirRelatorio();

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Serviços disponíveis:");
        System.out.println("1 - Banho");
        System.out.println("2 - Hotel");
        System.out.println("3 - Tosa");
        System.out.println("4 - Fechar programa");
    }
}