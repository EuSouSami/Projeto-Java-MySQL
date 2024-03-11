package PacotePrincipal;

public class Estoque {
    private Produto[] listaDeprodutos;
    private int tamanho;
    private int capacidade;

    public Estoque(int capacidadeInicial) {
        listaDeprodutos = new Produto[capacidadeInicial];
        tamanho = 0;
        capacidade = capacidadeInicial;
    }

    public void inserirProduto(Produto produto) {
        if (tamanho == capacidade) {
            novaArr();
        }
        produto.setId(tamanho + 1);
        listaDeprodutos[tamanho] = produto;
        tamanho++;
    }

    public void novaArr() {
        int novaCapacidade = capacidade * 2;
        Produto[] novaArr = new Produto[novaCapacidade];
        for (int c = 0; c < tamanho; c++) {
            novaArr[c] = listaDeprodutos[c];
        }
        listaDeprodutos = novaArr;
        capacidade = novaCapacidade;
    }

    public boolean removerProduto(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            for (int i = indice; i < tamanho - 1; i++) {
                listaDeprodutos[i] = listaDeprodutos[i + 1];
            }
            listaDeprodutos[tamanho - 1] = null;
            tamanho--;
            return true;
        }
        return false;
    }

    public void atualizarProduto(int id, String novoModelo, String novaMarca, int novaQuantidade, double novoPrecoDeCompra, double novoPrecoDeVenda) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            Produto produto = listaDeprodutos[indice];
            produto.setModelo(novoModelo);
            produto.setMarca(novaMarca);
            produto.setQuantidade(novaQuantidade);
            produto.setPrecoDeCompra(novoPrecoDeCompra);
            produto.setPrecoDeVenda(novoPrecoDeVenda);
        }
    }
    public Produto buscarProdutoPorId(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            return listaDeprodutos[indice];
        }
        return null;
    }
    
    private int buscarIndicePorId(int id) {
        for (int i = 0; i < tamanho; i++) {
            if (listaDeprodutos[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    
    public Produto[] listarProdutos() {
        Produto[] produtos = new Produto[tamanho];
        for (int i = 0; i < tamanho; i++) {
            produtos[i] = listaDeprodutos[i];
        }
        return produtos;
}

}