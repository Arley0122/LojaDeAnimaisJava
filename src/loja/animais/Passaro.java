package loja.animais;

public class Passaro extends Animal {
    private boolean podeVoar;

    public Passaro(String nome, int idade, double preço, boolean podeVoar) {
        super(nome, idade, preço);
        this.podeVoar = podeVoar;
    }

    public void voar(){
        if(podeVoar){
            System.out.printf("%s está voado!\n", this.getNome());
            return;
        }
        System.out.printf("%s não pode voar\n", this.getNome());
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz: Piu piu!\n", this.getNome());
    }

    @Override
    public String getTipo() {
        return "Pássaro";
    }

}
