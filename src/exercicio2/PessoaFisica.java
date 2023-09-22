package exercicio2;

public class PessoaFisica {
    private String nome, sobrenome, nomeDaMae, nomeDoPai, estadoCivil, nomeConjuge;
    private long cpf;
    private int numeroDeFilhos;
    private boolean possuiFilhos;


    public PessoaFisica(long numero){
        boolean initialize = isCpfValid(numero);
        this.cpf = initialize ? numero : 0;
    }

    public boolean isCpfValid(long numero){
        return ("" + numero).length() == 11;
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

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeConjuge() {
        return nomeConjuge;
    }

    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public boolean isPossuiFilhos() {
        return possuiFilhos;
    }

    public void setPossuiFilhos(boolean possuiFilhos) {
        this.possuiFilhos = possuiFilhos;
    }


}
