package conexaomysql;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Lista {

    Conexao acesso = new Conexao();
    Util util = new Util();

    public void cliente() {

        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement("select * from cliente limit 10");
            ResultSet resultado = pesquisa.executeQuery();
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("cod_cli"));
                String nome = resultado.getString("nome_cli");
                String endereco = resultado.getString("endereco");
                String cidade = resultado.getString("cidade");
                String cep = resultado.getString("cep");
                String uf = resultado.getString("uf");
                System.out.println("NOME: " + util.preencheComEspaco(nome, " ", 25, 1)
                        + "ENDEREÇO: " + util.preencheComEspaco(endereco, " ", 30, 1)
                        + "CIDADE: " + util.preencheComEspaco(cidade, " ", 30, 1)
                        + "CEP: " + util.preencheComEspaco(cep, " ", 10, 1)
                        + "UF: " + util.preencheComEspaco(uf, " ", 15, 1));
            }

        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }    
}
