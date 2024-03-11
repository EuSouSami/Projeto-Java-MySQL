package PacotePrincipal;


public class Produto {
    private int id;
    private String Modelo;
    private String Marca;
    private int quantidade;
    private double precoDeCompra;
    private double precoDeVenda;

    public Produto(String Modelo, String Marca, int quantidade, double precoDeCompra, double precoDeVenda) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.quantidade = quantidade;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
    }
    public Produto(int ID,String Modelo, String Marca, int quantidade, double precoDeCompra, double precoDeVenda) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.quantidade = quantidade;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
    }

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

}