package loja.animais;
import loja.interfaces.Treinavel;

public class Cachorro extends Animal implements Treinavel {

    private String raça;
    private boolean treinado;

    public Cachorro(String nome, int idade, double preço, String raça) {
        super(nome, idade, preço);
        this.raça = raça;
        treinado = false;

    }

    public String getRaça(){
        return this.raça;
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz Au au!\n", this.getNome());
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }

    @Override
    public void treinar() {
        System.out.printf("%s está sendo treiando!\n", this.getNome());
        treinado = true;
    }

    @Override
    public boolean ehObediente() {
        return this.treinado;
    }
    


}
