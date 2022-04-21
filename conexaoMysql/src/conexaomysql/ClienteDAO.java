package conexaomysql;

import java.util.Scanner;

public class ClienteDAO {    
    Scanner scanner = new Scanner(System.in);    
    Inserir cliente = new Inserir();

    private String nome;
    private String endereco;
    private String cidade;
    private String cep;
    private String uf;

    public void inserir() {
        System.out.println("CADASTRO DE CLIENTE");
        System.out.print("Digite o nome do cliente? ");
        this.nome = scanner.nextLine().toUpperCase();
        System.out.print("Digite o endereço? ");
        this.endereco = scanner.nextLine().toUpperCase();
        System.out.print("Digite o cidade? ");
        this.cidade = scanner.nextLine().toUpperCase();
        System.out.print("Digite o CEP? ");
        this.cep = scanner.nextLine().toUpperCase();
        System.out.print("Digite o estado? ");
        this.uf = scanner.nextLine().toUpperCase();
        
        cliente.cliente(this.nome,this.endereco,this.cidade,this.cep,this.uf);
        
        
    }
}
