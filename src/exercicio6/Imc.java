package exercicio6;

public class Imc {
    private Double altura, peso, imc;

    public Imc(double altura, double peso){
        this.altura = altura;
        this.peso = peso;

        calculaImc();
    }

    public String getDados(){
        return "Altura= " + this.altura + "\n" +
                "Peso= " + this.peso;
    }
    private double calculaImc(){
        this.imc = Math.round((this.peso / Math.pow(this.altura, 2)) * 100) / 100.0;

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
