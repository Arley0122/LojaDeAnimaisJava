package loja.animais;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, double preço, String cor) {
        super(nome, idade, preço);
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz: Miau!\n", this.getNome());
    }

    @Override
    public String getTipo() {
        return "Gato";
    }
}
