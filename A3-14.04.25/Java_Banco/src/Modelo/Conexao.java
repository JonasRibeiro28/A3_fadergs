
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    //atributos
    private static final String URL ="jdbc:mysql://localhost:3306/estoque?useTimezone=true&serverTiimezone=UTC";
    private static final String USUARIO ="root";
    private static final  String SENHA ="";
    
    public static Connection Conecta() throws SQLException
    {
        try {
            return DriverManager.getConnection(URL,USUARIO,SENHA);
        }//try 
        catch (SQLException erro) {
            throw new SQLException("Erro na conexão com o B.D \nCausa: "+erro.getMessage());
        }//catch
        
       }//public static connection
    
}//Fim da conexao




