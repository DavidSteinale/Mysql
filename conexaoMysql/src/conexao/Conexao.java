package conexao;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexao {

    String url = "jdbc:mysql://localhost:3306/lestfood?serverTimezone=UTC";
    String usuario = "stein@financeiro";
    String senha = "dir@3655";

    public Connection getConexao() {
        try {
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
        } catch (Exception erro) {
            System.out.println("Erro ao conectar :" + erro);
            return null;
        }
    }
}
