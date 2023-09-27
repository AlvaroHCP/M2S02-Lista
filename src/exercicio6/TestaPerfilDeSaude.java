package exercicio6;

import java.util.Scanner;

public class TestaPerfilDeSaude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, sobrenome, dataDeNascimento, sexo;
        Double altura, peso;

        System.out.println("Digite seu Nome");
        nome = scanner.nextLine();
        System.out.println("Digite seu Sobrenome");
        sobrenome = scanner.nextLine();
        System.out.println("Digite sua Data de Nascimento: (dd/mm/aaaa)");
        dataDeNascimento = scanner.nextLine();
        System.out.println("Digite seu Sexo: (masculino/feminino/outro)");
        sexo = scanner.nextLine();
        System.out.println("Digite sua Altura: (em metros)");
        altura = Double.parseDouble(scanner.nextLine().replace(",","."));
        System.out.println("Digite seu Peso: (em Kg)");
        peso = Double.parseDouble(scanner.nextLine().replace(",","."));

        Imc imc = new Imc(altura, peso);
        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca(nome, sobrenome, dataDeNascimento);
        PerfilDeSaude perfilDeSaude = new PerfilDeSaude(sexo, imc, frequenciaCardiaca);

        System.out.println(perfilDeSaude);
    }
}
