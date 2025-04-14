package Modelo;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BancoContato {
    //inserir 
    public static void CadastrarContato(DadosContato dc) throws SQLException
    {
        try 
        {
            //passar os dados  da conexão  Banco De Dados.
            Connection conexao = Conexao.Conecta();
            //criar uma condição do java interagir com o SQL.
            Statement sql = conexao.createStatement();
            //criar a query 
            String query = "insert into produtos  values(null,'"+dc.getNome()+"','"+dc.getPreco()+"','"+dc.getQuantidade()+"','"+dc.getLote()+"','"+dc.getMarca()+"','"+dc.getValidade()+"');";
            //executar o comando da query
            sql.execute(query);
            //fechar tudo(interfaces)
            sql.close();
            conexao.close();
            
        }//try
        
        catch (SQLException erro) 
        {
            
            throw new SQLException("Erro ao cadastrar os dados do produto. \n Causa: "+erro.getMessage());
        }//catch    
    }//fim do inserir
    
    //listar
    public static ArrayList<DadosContato> ListarContato() throws SQLException
    {
        try 
        {
            //pegar os dados da conexao com o banco de dados
            Connection conexao = Conexao.Conecta();
            //criar condição java interagir com o sql
            Statement sql = conexao.createStatement();
            String query = "select * from produtos";
            //pegar o resultado da consulta  (select) no SQL
            ResultSet rs = sql.executeQuery(query);
            //criar um vetordinamico (ArrayList) para colocar o resultado da conulta (Select) no SQL
            ArrayList<DadosContato> Lista = new ArrayList<>();
            //percorer os registros(linhas da tabela no banco de dados) 
            while (rs.next())
            {
            DadosContato dc = new DadosContato();
            dc.setId(rs.getInt("id"));
            dc.setNome(rs.getString("nome"));
            dc.setPreco(rs.getString("preco"));
            dc.setQuantidade(rs.getString("quantidade"));
            dc.setLote(rs.getString("lote"));
            dc.setMarca(rs.getString("marca"));
            dc.setValidade(rs.getString("validade"));

            //colocar a cada volta um elemento do arraylist
            Lista.add(dc);
            }//while
            return Lista;
        } //try
        
        catch (Exception erro) 
        {
            throw new SQLException("Erro ao buscar os contatos. \nCausa: "+erro.getMessage());
        }//catch
        
    }//fim do listar
    
    //apagar
    public static void ApagarContato(DadosContato dc) throws SQLException
    {
        try 
        {
            //passar os dados  da conexão  Banco De Dados.
            Connection conexao = Conexao.Conecta();
            //criar uma condição do java interagir com o SQL.
            Statement sql = conexao.createStatement();
            String query = "delete from produtos where id = "+dc.getId()+";";
            sql.execute(query);
            sql.close();
            conexao.close();
        }//try
        
        catch (Exception erro) 
        {
            throw new SQLException ("Erro ao tentar apagar contato no BD. \nCausa: "+erro.getMessage()); 
        }//catch
       
    }//fim Apagar Contato
     
    //atualizar
    
    public static void AtualizarContato(DadosContato dc) throws SQLException
            
    {
        try 
        {
           //passar os dados  da conexão  Banco De Dados.
            Connection conexao = Conexao.Conecta();
            //criar uma condição do java interagir com o SQL.
            Statement sql = conexao.createStatement();
           //String query = "Update produtos set nome = '"+dc.getNome()+"', preco = '"+dc.getPreco()+"',quantidade = '"+dc.getQuantidade()+"', lote = '"+dc.getLote()+"'validade = '"+dc.getValidade()+"' where id = "+dc.getId()+" ;";
            String query = "Update produtos set nome = '"+dc.getNome()+"', preco = '"+dc.getPreco()+"',quantidade = '"+dc.getQuantidade()+"', lote = '"+dc.getLote()+"'validade = '"+dc.getValidade()+"' where id = "+dc.getId()+" ;";
            sql.executeUpdate(query);
            sql.close();
            conexao.close();
            
        }//try 
        catch (SQLException erro)
        {
            throw new SQLException("Erro ao atualizar produto \nCausa: "+erro.getMessage());
        }//catch
    
    
    }//fim do Atualizar Contato
            
}//Fim do bancoContato
