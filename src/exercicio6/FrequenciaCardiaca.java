package exercicio6;

public class FrequenciaCardiaca {
    private String nome, sobrenome, dataDeNascimento;
    private Integer idade, frequenciaCardiacaMaxima, frequenciaCardiacaAlvo50, frequenciaCardiacaAlvo85;

    public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataNascimento;

        idadeEmAnos(dataNascimento);
        frequenciaCardiacaMaxima();
        frequenciaCardiacaAlvo();
    }

    @Override
    public String toString() {
        return  "Nome= " + nome + ' ' + sobrenome + "\n" +
                "Data de nascimento= " + dataDeNascimento + "\n" +
                "Idade= " + idade + " anos" + "\n" +
                "Frequencia cardiaca maxima= " + frequenciaCardiacaMaxima + " bpm \n" +
                "Frequencia cardiaca alvo= (" + frequenciaCardiacaAlvo50 +
                " - " + frequenciaCardiacaAlvo85 + ") bpm."
                ;
    }

    public int idadeEmAnos(String dataNascimento) {
        String[] idade = dataNascimento.split("/");
//        System.out.println(idade[2]);
        this.idade = 2023 - Integer.parseInt(idade[2]);
        return this.idade;
    }

    public int frequenciaCardiacaMaxima(){
        this.frequenciaCardiacaMaxima = 220 - this.idade;

        return this.frequenciaCardiacaMaxima;
}

    public String frequenciaCardiacaAlvo(){
        this.frequenciaCardiacaAlvo50 = (int) (0.5 * this.frequenciaCardiacaMaxima);
        this.frequenciaCardiacaAlvo85 = (int) (0.85 * this.frequenciaCardiacaMaxima);
        return "Frequencia Cardíaca Alvo fica entre " + this.frequenciaCardiacaAlvo50 + " e " +
                this.frequenciaCardiacaAlvo85 + ".";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getFrequenciaCardiacaMaxima() {
        return frequenciaCardiacaMaxima;
    }

    public Integer getFrequenciaCardiacaAlvo50() {
        return frequenciaCardiacaAlvo50;
    }

    public Integer getFrequenciaCardiacaAlvo85() {
        return frequenciaCardiacaAlvo85;
    }
}
