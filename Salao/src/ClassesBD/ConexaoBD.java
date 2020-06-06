package ClassesBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoBD {
    //variavel de conexao
    public static Connection c = null;
    
    //metodo para conectar o BD
    public static void connect(){
    System.out.println("Conectando ao banco....");
    try{
        Class.forName("com.mysql.jdbc.Driver");
        
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulabd?useSSL=false", "root", "12345");
        
        System.out.println("conectado");
        
    }catch(Exception e){e.printStackTrace();
    System.out.println("erro!");
    }    
}
    public static void desconnect(){
    try{
    c.close();
    }catch(Exception e){e.printStackTrace();}
    
    }
    public static ResultSet rsexecutar(String query){
    //presiza de uma variavel com retorno quem faz essa função é 
        ResultSet rs = null;
    try{
    //variavel eu faz a requisição
        Statement sql = c.createStatement();
    //faz requisição no banco de dados e guarda na ResultSet rs
    rs = sql.executeQuery(query);
    }catch(Exception e){e.printStackTrace();
    
    }
    
   return rs;
}
    public static void executar(String query){
        try{
        //criar a variação que faz a requisição
        Statement sql = c.createStatement();
        //executa um comando no banco
        sql.executeUpdate(query);
        }catch(Exception e){e.printStackTrace();}
        
        
    }
}
