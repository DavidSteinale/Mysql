
package conexaomysql;

public class Util {
    
  public static String preencheComEspaco(String linha_a_preencher, String letra, int tamanho, int direcao) {

        //Retira caracteres estranhos
        linha_a_preencher = linha_a_preencher.replaceAll("[./-]", "");

        StringBuffer sb = new StringBuffer(linha_a_preencher);

        if (direcao == 1) {//a Direita
            for (int i = sb.length(); i < tamanho; i++) {
                sb.append(letra);
            }
        }
        return sb.toString();
    }
    
}
