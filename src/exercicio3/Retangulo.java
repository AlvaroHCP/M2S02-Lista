package exercicio3;

public class Retangulo {
    private float largura = 1, altura = 1;

    public double calculaPerimetro(){
        return ((this.largura * 2) + (this.altura * 2));
    }
    public double calculaArea(){
        return (this.largura * this.altura);
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        boolean testeLargura = largura > 0.0 && largura <= 20.0;
        if (!testeLargura){
        System.out.println("O valor da Largura é menor que 0,0 ou maior que 20,0.");
        }
        this.largura = testeLargura ? largura : 0;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        boolean testeAltura = altura > 0.0 && altura <= 20.0;
        if (!testeAltura){
            System.out.println("O valor da Altura é menor que 0,0 ou maior que 20,0.");
        }
        this.altura = testeAltura ? altura : 0;
    }
}
