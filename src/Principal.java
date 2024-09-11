import dados.Administrador;
import dados.Produto;
import dados.Usuario;

public class Principal {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("Nome:Bruno Custodio de castro Silva");
        System.out.println("Prof: Claudio");
        System.out.println(" ");
        System.out.println("===============================================");
        Administrador admin = new Administrador();
        Produto produto1 = new Produto("Camiseta", 49.99);
        Produto produto2 = new Produto("Calça", 79.99);
        admin.adicionarProduto(produto1);
        admin.adicionarProduto(produto2);

        admin.listarProdutos();

        Usuario usuario = new Usuario("Bruno");
        usuario.getCarrinho().adicionarProduto(produto1);
        usuario.getCarrinho().adicionarProduto(produto2);
        System.out.println(usuario.getCarrinho());

        usuario.finalizarCompra();

        admin.listarProdutos();
    }
}
