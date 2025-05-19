package Model;

import java.sql.*;
import java.util.Scanner;

public class OrientacaoDAO {

    public static void listarOrientacoes() {
        try (Connection conn = Conexao.getConexao()) {
            String sql = "SELECT * FROM orientacoes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Título: " + rs.getString("titulo"));
                System.out.println("Tipo: " + rs.getString("tipo"));
                System.out.println("Descricao: " + rs.getString("Descricao"));
                System.out.println("PT: " + rs.getString("conteudo_pt"));
                System.out.println("EN: " + rs.getString("conteudo_en"));
                System.out.println("DE: " + rs.getString("conteudo_de"));
                System.out.println("------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void inserirOrientacao(Scanner scanner) {
        try (Connection conn = Conexao.getConexao()) {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Tipo: ");
            String tipo = scanner.nextLine();
            System.out.print("descricao: ");
            String descricao = scanner.nextLine();
            System.out.print("Conteúdo PT: ");
            String pt = scanner.nextLine();
            System.out.print("Conteúdo EN: ");
            String en = scanner.nextLine();
            System.out.print("Conteúdo DE: ");
            String de = scanner.nextLine();

            String sql = "INSERT INTO orientacoes (titulo, tipo, descricao, conteudo_pt, conteudo_en, conteudo_de) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.setString(2, tipo);
            stmt.setString(3, descricao);
            stmt.setString(4, pt);
            stmt.setString(5, en);
            stmt.setString(6, de);
            stmt.executeUpdate();

            System.out.println("Orientação inserida com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void atualizarOrientacao(Scanner scanner) {
        try (Connection conn = Conexao.getConexao()) {
            System.out.print("ID da orientação para atualizar: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Novo título: ");
            String titulo = scanner.nextLine();
            System.out.print("Novo tipo: ");
            String tipo = scanner.nextLine();
            System.out.print("Nova Descrição: ");
            String descricao = scanner.nextLine();
            // Text conteudo_pt = scanner.nextLine();
            // System.out.print("Novo conteudo: ");

            String sql = "UPDATE orientacoes SET titulo = ?, tipo = ?, descricao = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.setString(2, tipo);
            stmt.setString(3, descricao);
            stmt.setInt(4, id);
            int linhasAfetadas = stmt.executeUpdate();

            // logica para atualizar apenas um valor de conteudo e deixar os demais com seus
            // conteudos antigos - atualmente a lógica atualiza apenas 3 colunas

            if (linhasAfetadas > 0)
                System.out.println("Atualização realizada com sucesso!");
            else
                System.out.println("ID não encontrado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deletarOrientacao(Scanner scanner) {
        try (Connection conn = Conexao.getConexao()) {
            System.out.print("ID da orientação para deletar: ");
            int id = Integer.parseInt(scanner.nextLine());

            String sql = "DELETE FROM orientacoes WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0)
                System.out.println("Orientação excluída com sucesso!");
            else
                System.out.println("ID não encontrado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}