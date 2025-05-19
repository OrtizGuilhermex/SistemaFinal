package Model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu CRUD ---");
            System.out.println("1 - Listar orientações");
            System.out.println("2 - Inserir nova orientação");
            System.out.println("3 - Atualizar orientação");
            System.out.println("4 - Excluir orientação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    OrientacaoDAO.listarOrientacoes();
                    break;
                case 2:
                    OrientacaoDAO.inserirOrientacao(scanner);
                    break;
                case 3:
                    OrientacaoDAO.atualizarOrientacao(scanner);
                    break;
                case 4:
                    OrientacaoDAO.deletarOrientacao(scanner);
                    break;
                // case 5:
                // OrientacaoDAO.Vw_Orientacoes(scanner);//chama uma view nativa do banco de
                // dados(especificações no documento)
                // break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}