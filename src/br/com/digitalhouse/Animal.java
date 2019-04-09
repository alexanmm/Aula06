package br.com.digitalhouse;

public abstract class Animal {

    private String tamanho;
    private String raca;

    //Construtor
    public Animal(){

    }

    public Animal(String novoTamanho, String novaRaca){

        tamanho = novoTamanho;
        raca = novaRaca;
    }

    //Getter and Setter
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public abstract boolean ehMamifero();

}
