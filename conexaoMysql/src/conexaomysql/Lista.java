package conexaomysql;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalTime;

public class Lista {

    Conexao acesso = new Conexao();
    Util util = new Util();

    public void cliente(String sql) {

        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement(sql);
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
    
    public void vendedor(String sql) {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement(sql);
            ResultSet resultado = pesquisa.executeQuery();
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("cod_vend"));
                String nome = resultado.getString("nome_vend");
                float salario = Float.parseFloat(resultado.getString("sal_fixo"));
                float faixa_comissao = Float.parseFloat(resultado.getString("faixa_comiss"));
                
                System.out.println("VENDEDOR: " + util.preencheComEspaco(nome, " ", 25, 1)
                        + "SALÁRIO: " + salario + "    "
                        + "FAIXA DE COMISSÃO: " + faixa_comissao);                        
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }   
    
    public void produto(String sql) {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement(sql);
            ResultSet resultado = pesquisa.executeQuery();
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("cod_prod"));
                String descricao = resultado.getString("desc_prod");
                String unidade = resultado.getString("unid_prod");
                float valor_unit = Float.parseFloat(resultado.getString("val_unit"));                
                
                System.out.println("DESCRIÇÃO: " + util.preencheComEspaco(descricao, " ", 10, 1)
                        + "UNIDADE: " + util.preencheComEspaco(unidade, " ", 10, 1)
                        + "VALOR UNITÁRIO: " + valor_unit);                        
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
    
    public void pedido(String sql) {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement(sql);
            ResultSet resultado = pesquisa.executeQuery();
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("cod_ped"));
                String cod_cli = resultado.getString("cod_cli");
                String cod_vend = resultado.getString("cod_vend");
                String numero = resultado.getString("num_ped");
                LocalTime prazo_entr = LocalTime.parse(resultado.getString("prazo_entr"));
                
                if(numero == null){
                    numero = Integer.toString(0);
                }
                                
                System.out.println("CODIGO CLIENTE: " + util.preencheComEspaco(cod_cli, " ", 10, 1)
                        + "CODIGO VENDEDOR: " + util.preencheComEspaco(cod_vend, " ", 10, 1)
                        + "NUMERO DO PEDIDO: " + util.preencheComEspaco(numero, " ", 10, 1)
                        + "TEMPO DE ENTRAGA: " + prazo_entr);
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
    
    public void itemPedido(String sql) {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement(sql);
            ResultSet resultado = pesquisa.executeQuery();
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("cod_item_ped"));
                String cod_ped = resultado.getString("cod_ped");
                String cod_prod = resultado.getString("cod_prod");
                int qtd_ped = Integer.parseInt(resultado.getString("qtd_ped"));
                                                               
                System.out.println("CODIGO DO PEDIDO: " + util.preencheComEspaco(cod_ped, " ", 10, 1)
                        + "CODIGO DO PRODUTO: " + util.preencheComEspaco(cod_prod, " ", 10, 1)
                        + "QTD DO PRODUTO: " + qtd_ped);
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
}
