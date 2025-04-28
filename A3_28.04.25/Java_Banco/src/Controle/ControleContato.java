package Controle;

import java.sql.SQLException;
import Modelo.DadosContato;
import Modelo.BancoContato;
import java.io.InputStream;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import javax.swing.JOptionPane;


public class ControleContato {
    
    //inserir
    public void Cadastrar(DadosContato dc) throws SQLException
    {
    BancoContato.CadastrarContato(dc);
    }
    //listar
    public ArrayList<DadosContato> Listar() throws SQLException
    {
    return BancoContato.ListarContato();

    }
    //apagar
    public void Apagar(DadosContato dc) throws SQLException
    {
    BancoContato.ApagarContato(dc);
    }
    
    //atualizar
    public void Atualizar(DadosContato dc) throws SQLException
    {
        BancoContato.AtualizarContato(dc);
    }

public InputStream getImagem(int id) {
    // Comando SQL para buscar a imagem no banco de dados, filtrando pelo ID
    String sql = "SELECT imagem FROM produtos WHERE id = ?";
    InputStream is = null;

    // Tenta executar o código dentro do bloco try
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/estoque?useSSL=false&serverTimezone=UTC", "root", ""); // Substitua pelos seus dados de conexão
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Define o valor do parâmetro na consulta SQL
        pstmt.setInt(1, id);

        // Executa a consulta e armazena o resultado
        ResultSet rs = pstmt.executeQuery();

        // Se encontrou algum resultado
        if (rs.next()) {
            // Recupera o InputStream da coluna "imagem"
            is = rs.getBinaryStream("imagem");
        } else {
            //se nao encontrar a imagem retorna null
            return null;
        }

    } catch (SQLException e) {
        // Se ocorrer algum erro durante a execução do código dentro do bloco try, este bloco catch captura a exceção
        JOptionPane.showMessageDialog(null, "Erro ao buscar imagem: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }

    // Retorna o InputStream da imagem (pode ser nulo se não encontrou a imagem)
    return is;
}




    
}//fim DO ControleContato
