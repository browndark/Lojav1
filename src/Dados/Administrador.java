package dados;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<dados.Produto> produtos = new ArrayList<>();

    public void adicionarProduto(dados.Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    public void removerProduto(dados.Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido: " + produto);
    }

    public void listarProdutos() {
        System.out.println("Produtos disponíveis:");
        for (dados.Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

