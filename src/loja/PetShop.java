package loja;
import java.util.ArrayList;
import loja.animais.*;
import loja.interfaces.*;

public class PetShop {
    private String nome;
    private ArrayList<Animal> estoque;
    private ArrayList<Animal> vendidos;

    public PetShop(String nome) {
        this.nome = nome;
        estoque = new ArrayList<>();
        vendidos = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarAnimal(Animal animal) {
        estoque.add(animal);
    }

    public void listarEstoque() {
        System.out.println(("\nListando estoque...").toUpperCase());
        System.out.println("==========================");
        this.estoque.stream().forEach(animal -> System.out.printf("%S é um %s\n", animal.getNome(), animal.getTipo()));
        System.out.println("==========================");
        System.out.println("LISTAGEM CONCLUIDA COM SUCESSO!");

    }

    public Animal buscarAnimal(String nome) {
        nome = nome.toLowerCase();
        for (Animal animal : estoque) {
            if (nome.equals(animal.getNome().toLowerCase())) {
                return animal;
            }
        }
        System.out.println("Animal não encontrado");
        return null;
    }

    public void venderAnimal(String nome) {
        nome = nome.toLowerCase();
        boolean animalEncontrado = false;
        Animal animal = null;
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getNome().toLowerCase().equals(nome)) {
                animal = estoque.get(i);
                estoque.remove(i);
                animalEncontrado = true;
            }
        }
        if (animalEncontrado) {
            vendidos.add(animal);
        }
    }

    public void listarApenasCachorros() {
        this.estoque.stream().filter(animal -> animal instanceof Cachorro).forEach(cachorro -> System.out.println(cachorro));
    }

    public void listarTreinaveis() {
        for (Animal animal : estoque) {
            if (animal instanceof Treinavel) {
                System.out.println(animal);
            }
        }
    }

    public void listarAquaticos() {
        for (Animal animal : estoque) {
            if (animal instanceof Aquatico) {
                System.out.println(animal);
            }
        }
    }

    public double calcularValordoEstoque() {
        double soma = 0;
        for (Animal animal : estoque) {
            soma += animal.getPreço();
        }
        return soma;
    }

    public Animal animalMaisCaro() {
        Animal maisCaro = null;
        for (Animal animal : estoque) {
            if (maisCaro == null) {
                maisCaro = animal;
                continue;
            } else if (animal.getPreço() > maisCaro.getPreço()) {
                maisCaro = animal;
            }
        }
        return maisCaro;
    }

    public int totalVendidos() {
        return vendidos.size();
    }

    public void concertoDosAnimais() {
        for (Animal animal : estoque) {
            animal.emitirSom();
        }
    }

    public void estatisticaPorTipo() {
        int quantCachorro = 0;
        int quantGato = 0;
        int quantPassaro = 0;
        int quantPeixe = 0;
        for (Animal animal : estoque) {
            if (animal instanceof Cachorro)
                quantCachorro++;
            else if (animal instanceof Gato)
                quantGato++;
            else if (animal instanceof Passaro)
                quantPassaro++;
            else if (animal instanceof Peixe)
                quantPeixe++;
        }
        System.out.println("Quantidade de Cachorros: " + quantCachorro);
        System.out.println("Quantidade de Gatos: " + quantGato);
        System.out.println("Quantidade de Peixes: " + quantPeixe);
        System.out.println("Quantidade de Passaros: " + quantPassaro);

    }

    public void gerarRelatorio() {
        System.out.println("Valor em animais no estoque: " + calcularValordoEstoque());
        System.out.println("O animal mais caro é:" + animalMaisCaro());
        System.out.println("O total de animais vendidos é: " + totalVendidos());
    }

}