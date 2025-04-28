package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BancoContato {

    // Inserir produto
    public static void CadastrarContato(DadosContato dc) throws SQLException {
        String sql = "INSERT INTO produtos (nome, preco, quantidade, lote, marca, validade) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexao = Conexao.Conecta();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, dc.getNome());

            if (dc.getPreco() == null || dc.getPreco().trim().isEmpty()) {
                ps.setNull(2, java.sql.Types.DOUBLE);
            } else {
                ps.setDouble(2, Double.parseDouble(dc.getPreco()));
            }

            if (dc.getQuantidade() == null || dc.getQuantidade().trim().isEmpty()) {
                ps.setNull(3, java.sql.Types.INTEGER);
            } else {
                ps.setInt(3, Integer.parseInt(dc.getQuantidade()));
            }

            ps.setString(4, dc.getLote());
            ps.setString(5, dc.getMarca());

            if (dc.getValidade() == null || dc.getValidade().trim().isEmpty()) {
                ps.setNull(6, java.sql.Types.INTEGER);
            } else {
                try {
                    String dataStr = dc.getValidade().trim();
                    int ano = Integer.parseInt(dataStr.substring(0, 4));
                    ps.setInt(6, ano);
                } catch (Exception e) {
                    throw new SQLException("Formato inválido para a validade. Informe uma data no formato yyyy-MM-dd.");
                }
            }

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar os dados do produto. \nCausa: " + e.getMessage());
        }
    }

    // Atualizar produto
    public static void AtualizarContato(DadosContato dc) throws SQLException {
        String sql = "UPDATE produtos SET nome = ?, preco = ?, quantidade = ?, lote = ?, marca = ?, validade = ? WHERE id = ?";

        try (Connection conexao = Conexao.Conecta();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, dc.getNome());

            if (dc.getPreco() == null || dc.getPreco().trim().isEmpty()) {
                ps.setNull(2, java.sql.Types.DOUBLE);
            } else {
                ps.setDouble(2, Double.parseDouble(dc.getPreco()));
            }

            if (dc.getQuantidade() == null || dc.getQuantidade().trim().isEmpty()) {
                ps.setNull(3, java.sql.Types.INTEGER);
            } else {
                ps.setInt(3, Integer.parseInt(dc.getQuantidade()));
            }

            ps.setString(4, dc.getLote());
            ps.setString(5, dc.getMarca());

            if (dc.getValidade() == null || dc.getValidade().trim().isEmpty()) {
                ps.setNull(6, java.sql.Types.INTEGER);
            } else {
                try {
                    String dataStr = dc.getValidade().trim();
                    int ano = Integer.parseInt(dataStr.substring(0, 4));
                    ps.setInt(6, ano);
                } catch (Exception e) {
                    throw new SQLException("Formato inválido para a validade. Informe uma data no formato yyyy-MM-dd.");
                }
            }

            ps.setInt(7, dc.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar produto. \nCausa: " + e.getMessage());
        }
    }

    // Listar produtos
    public static ArrayList<DadosContato> ListarContato() throws SQLException {
        String query = "SELECT * FROM produtos";
        ArrayList<DadosContato> lista = new ArrayList<>();

        try (Connection conexao = Conexao.Conecta();
             PreparedStatement ps = conexao.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                DadosContato dc = new DadosContato();
                dc.setId(rs.getInt("id"));
                dc.setNome(rs.getString("nome"));

                double preco = rs.getDouble("preco");
                if (rs.wasNull()) {
                    dc.setPreco(null);
                } else {
                    dc.setPreco(String.valueOf(preco));
                }

                int quantidade = rs.getInt("quantidade");
                if (rs.wasNull()) {
                    dc.setQuantidade(null);
                } else {
                    dc.setQuantidade(String.valueOf(quantidade));
                }

                dc.setLote(rs.getString("lote"));
                dc.setMarca(rs.getString("marca"));

                int anoValidade = rs.getInt("validade");
                if (rs.wasNull()) {
                    dc.setValidade(null);
                } else {
                    dc.setValidade(String.valueOf(anoValidade));
                }

                lista.add(dc);
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar os contatos. \nCausa: " + e.getMessage());
        }

        return lista;
    }

    // Apagar produto
    public static void ApagarContato(DadosContato dc) throws SQLException {
        String sql = "DELETE FROM produtos WHERE id = ?";

        try (Connection conexao = Conexao.Conecta();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, dc.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException("Erro ao tentar apagar contato no BD. \nCausa: " + e.getMessage());
        }
    }
}
