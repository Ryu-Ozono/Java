package Concessionária;

public class Veículo {
    
    private String marca;
    private String modelo;
    private String ano;
    private int quantidade;
    private double preco;

    public Veículo(String marca, String modelo, String ano, double preco, int quantidade) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.preco = preco;
    this.quantidade = quantidade;
}

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getmarca(){
        return marca;
    }

    public String getmodelo(){
        return modelo;
    }

    public String getano(){
        return ano;
    }

    public double getpreco(){
        return preco;
    }

    public int getquantidade(){
        return quantidade;
    }
    // Setters

    public void exibir() {
        System.out.println("--------------------------");
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("marca: " + marca);
        System.out.println("preco: " + preco);
        System.out.println("quantidade: " + quantidade);
        System.out.println("--------------------------");
    }
}
