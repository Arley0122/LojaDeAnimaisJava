package loja.animais;

public abstract class Animal {
    private String nome;
    private int idade;
    private double preço;

    public Animal(String nome, int idade, double preço){
        this.nome = nome;
        this.idade = idade;
        this.preço = preço;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getPreço(){
        return this.preço;
    }

    public void comer(){
        System.out.printf("%s está comendo...\n");
    }

    public abstract void emitirSom();

    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("Nome: %s|Idade: %d|Preço: R$%.2f", this.nome, this.idade, this.preço);
    }


}