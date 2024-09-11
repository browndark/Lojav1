package dados;

public class Usuario {
    private String nome;
    private dados.Carrinho carrinho;

    public Usuario(String nome) {
        this.nome = nome;
        this.carrinho = new dados.Carrinho();
    }

    public String getNome() {
        return nome;
    }

    public dados.Carrinho getCarrinho() {
        return carrinho;
    }

    public void finalizarCompra() {
        double total = carrinho.calcularTotal();
        System.out.println(nome + " finalizou a compra com o total de $" + total);
        carrinho = new dados.Carrinho();
    }
}

