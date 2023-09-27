package exercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FrequenciaCardiaca {
    private String nome, sobrenome, dataDeNascimento;
    private Integer idade, frequenciaCardiacaMaxima, frequenciaCardiacaAlvo50, frequenciaCardiacaAlvo85;

    public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataNascimento;
    }

    public int idadeEmAnos(String dataNascimento) {
        String[] idade = dataNascimento.split("/");
        System.out.println(idade[2]);
        return 2023 - Integer.parseInt(idade[2]);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
