package loja.animais;

import loja.interfaces.Aquatico;

public class Peixe extends Animal implements Aquatico{
    private String tipodeAgua;
    private int profundidadeMaxima;

    public Peixe(String nome, int idade, double preço, String tipodeAgua, int profundidadeMaxima){
        super(nome, idade, preço);
        this.tipodeAgua = tipodeAgua;
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public String tipodeAgua(){
        return tipodeAgua;
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s não faz som(é um peixe)\n", this.getNome());
    }

    @Override
    public String getTipo() {
        return "Peixe";
    }
    @Override
    public void nadar() {
        System.out.printf("%s está nadando\n", this.getNome());
    }
    @Override
    public int getProfundidadedeMergulho() {
        return profundidadeMaxima;
    }
}