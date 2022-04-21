package conexaomysql;

public class ConexaoMysql {

    public static void main(String[] args) {

        Lista lista = new Lista();
        ClienteDAO clienteDAO = new ClienteDAO();
        
        clienteDAO.inserir();
        
        

//        System.out.println("CADASTRO DE CLIENTES");
//        System.out.println("----------");
//lista.cliente("select * from cliente where nome_cli = 'DAVID' limit 10");
//        System.out.println("===============================");
//        System.out.println("CADASTRO DE VENDEDORES");
//        System.out.println("----------");
//        lista.vendedor("select * from vendedor limit 10");
//        System.out.println("===============================");
//        System.out.println("CADASTRO DE PRODUTOS");
//        System.out.println("----------");
//        lista.produto("select * from produto limit 10");
//        System.out.println("===============================");
//        System.out.println("PEDIDOS");
//        System.out.println("----------");
//        lista.pedido("select * from pedido limit 10");
//        System.out.println("===============================");
//        System.out.println("ITEMS DO PEDIDO");
//        System.out.println("----------");
//        lista.itemPedido("select * from item_pedido limit 10");
    }
}
