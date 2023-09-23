package exercicio4;

public class TestaFatura {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("5592081", "item de teste",
                -10, -40.73);
        System.out.println("\nFatura 1\nR$" + fatura1.getPrecoDoItem() + "\n" + fatura1.getQuantidadeCompradaDoItem() +
                "\nR$" + fatura1.getValorFatura());

        Fatura fatura2 = new Fatura("5872349", "item de teste",
                10, -40.73);
        System.out.println("\nFatura 2\nR$" + fatura2.getPrecoDoItem() + "\n" + fatura2.getQuantidadeCompradaDoItem() +
                "\nR$" + fatura2.getValorFatura());

        Fatura fatura3 = new Fatura("7204359", "item de teste",
                10, 40.73);
        System.out.printf("%nFatura 3%nR$%.2f %n%d %n%.2f", fatura3.getPrecoDoItem(), fatura3.getQuantidadeCompradaDoItem(), fatura3.getValorFatura());
    }
}
