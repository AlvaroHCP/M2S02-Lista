package exercicio6;

public class Imc {
    private Double altura, peso, imc;

    public Imc(double altura, double peso){
        this.altura = altura;
        this.peso = peso;

        calculaImc();
    }
    private double calculaImc(){
        this.imc = (this.peso / Math.pow(this.altura, 2));
        return this.imc;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getImc() {
        return imc;
    }

}
