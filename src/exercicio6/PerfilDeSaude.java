package exercicio6;

public class PerfilDeSaude {
    private String sexo;
    Imc imc;
    FrequenciaCardiaca frequenciaCardiaca;

    @Override
    public String toString() {
        return "1- IMC= " + imc.getImc() + "\n" +
                "2- Frequencia Máxima= " + frequenciaCardiaca.getFrequenciaCardiacaMaxima() + "\n" +
                "3- Frequencia Alvo= " + frequenciaCardiaca.frequenciaCardiacaAlvo() + "\n";
    }

    public PerfilDeSaude(String sexo, Imc imc, FrequenciaCardiaca frequenciaCardiaca){
        this.sexo = sexo;
        this.imc = imc;
        this.frequenciaCardiaca = frequenciaCardiaca;
    }
}
