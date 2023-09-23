package exercicio4;

public class Fatura {
    private String numeroDaFatura = "", descricaoDoItem = "";
    private int quantidadeCompradaDoItem;
    private double precoDoItem;

    public Fatura(String numeroDaFatura, String descricaoDoItem, int quantidade, double preco){
        this.numeroDaFatura = numeroDaFatura;
        this.descricaoDoItem = descricaoDoItem;
        this.quantidadeCompradaDoItem = Math.max(quantidade, 0);
        this.precoDoItem = Math.max(preco, 0.0);
    }

    public double getValorFatura(){
        return (this.quantidadeCompradaDoItem * this.precoDoItem);
    }

    public String getNumeroDaFatura() {
        return numeroDaFatura;
    }

    public void setNumeroDaFatura(String numeroDaFatura) {
        this.numeroDaFatura = numeroDaFatura;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public int getQuantidadeCompradaDoItem() {
        return quantidadeCompradaDoItem;
    }

    public void setQuantidadeCompradaDoItem(int quantidadeCompradaDoItem) {
        this.quantidadeCompradaDoItem = quantidadeCompradaDoItem;
    }

    public double getPrecoDoItem() {
        return precoDoItem;
    }

    public void setPrecoDoItem(double precoDoItem) {
        this.precoDoItem = precoDoItem;
    }
}
