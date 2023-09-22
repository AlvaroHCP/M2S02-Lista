package exercicio1;

public class Data {
    private int dia, mes, ano;
    public Data (int dia, int mes, int ano){
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }
        if (mes >= 1 && mes <= 12){
            this.mes = mes;
        }
        if (ano >= 1900){
            this.ano = ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirData(){
        String dataCompleta = ((Integer.toString(this.mes).length() < 2) ?
                "0"+this.mes : ""+this.mes) + "/" +
                ((""+this.dia).length() < 2 ? "0"+this.dia : ""+this.dia) + "/" + this.ano;
        System.out.println(dataCompleta);
    }
}
