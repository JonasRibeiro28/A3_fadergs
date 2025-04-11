package Controle;

import java.sql.SQLException;
import Modelo.DadosContato;
import Modelo.BancoContato;
import java.util.ArrayList;

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
    
}//fim DO ControleContato
