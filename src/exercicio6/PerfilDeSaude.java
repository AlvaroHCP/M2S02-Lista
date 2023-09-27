package exercicio6;

public class PerfilDeSaude {
    private String sexo;
    Imc imc;
    FrequenciaCardiaca frequenciaCardiaca;

    @Override
    public String toString() {
        return "\n" + frequenciaCardiaca.getDados() + "\n" +
                imc.getDados() + "\n" + "Sexo= " + this.sexo + "\n" + "IMC= " + imc.getImc() + "\n" +
                "Frequencia Cardíaca Máxima= " + frequenciaCardiaca.getFrequenciaCardiacaMaxima() + "\n" +
                "Frequencia Cardíaca Alvo= " + frequenciaCardiaca.frequenciaCardiacaAlvo();
    }

    public PerfilDeSaude(String sexo, Imc imc, FrequenciaCardiaca frequenciaCardiaca){
        this.sexo = sexo;
        this.imc = imc;
        this.frequenciaCardiaca = frequenciaCardiaca;
    }
}
