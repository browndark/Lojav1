package dados;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<dados.Produto> produtos = new ArrayList<>();

    public void adicionarProduto(dados.Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(dados.Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (dados.Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carrinho: " + produtos.toString() + " | Total: $" + calcularTotal();
    }
}
