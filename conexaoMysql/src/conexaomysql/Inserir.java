package conexaomysql;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Inserir {

    Conexao acesso = new Conexao();

    public void cliente(String nome, String endereco,String cidade,String cep,String uf) {
        String sql = "INSERT INTO cliente(nome_cli,endereco,cidade,cep,uf)\n"
                + "VALUES (' " + nome + " ','" + endereco + "','" + cidade + "'," + cep + ",'" + uf + "')";
        try {
            PreparedStatement inserir = acesso.getConexao().prepareStatement(sql);
            inserir.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }

}
