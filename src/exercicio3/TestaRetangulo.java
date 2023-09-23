package exercicio3;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(19.1290682f);
        retangulo.setAltura(3.67829f);

        double perimetro = retangulo.calculaPerimetro();
        double area = retangulo.calculaArea();

        System.out.printf("%nPerímetro: %.4f%nÁrea: %.4f%n",perimetro, area);
    }
}
