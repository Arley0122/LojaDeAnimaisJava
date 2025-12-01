import java.util.InputMismatchException;
import java.util.Scanner;
import loja.*;
import loja.Exceptions.EntradaMenuInvalidaException;
import loja.animais.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetShop lojadeAnimais = new PetShop("LazerAnimais");
        int entrada;
        System.out.println(("\nBem vindo a " + lojadeAnimais.getNome()).toUpperCase() + "!");

        do {
            String nome;
            int idade;
            double preço;
            System.out.println("------------------------------------");
            System.out.println("1.  Adicionar Cachorro");
            System.out.println("2.  Adicionar Gato");
            System.out.println("3.  Adicionar Pássaro");
            System.out.println("4.  Adicionar Peixe");
            System.out.println("5.  Listar todos os animais");
            System.out.println("6.  Buscar animal por nome");
            System.out.println("7.  Vender animal");
            System.out.println("8.  Listar apenas cachorros");
            System.out.println("9.  Listar animais treináveis");
            System.out.println("10. Listar animais aquáticos");
            System.out.println("11. Treinar um cachorro");
            System.out.println("12. Fazer todos emitirem som");
            System.out.println("13. Ver animal mais caro");
            System.out.println("14. Estatísticas por tipo");
            System.out.println("15. Relatório completo");
            System.out.println("0.  Sair");
            System.out.println("------------------------------------");
            System.out.println("Digite uma das opções: ");
            try {
                entrada = sc.nextInt();
                if (entrada > 15 || entrada < 0) {
                    throw new EntradaMenuInvalidaException("Digite uma opção dentro do intervalo");
                }
            } catch (InputMismatchException e) {
                System.out.println("As opções sutentam apenas números inteiros");
                entrada = -1;
            } catch( EntradaMenuInvalidaException e){
                System.out.println(e.getMessage());
                entrada = -1;
            }
            finally {
                sc.nextLine();
            }
            switch (entrada) {
                case 1:
                    System.out.println("Digite o nome do cachorro: ");
                    nome = sc.nextLine();
                    System.out.println("Digite a idade do cachorro: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o preço do cachorro: ");
                    preço = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a raça do cachorro: ");
                    String raça = sc.nextLine();
                    lojadeAnimais.adicionarAnimal(new Cachorro(nome, idade, preço, raça));
                    System.out.println(("\nCachorro Adicionado com Sucesso!").toUpperCase());
                    break;
                case 2:
                    System.out.println("Digite o nome do gato: ");
                    nome = sc.nextLine();
                    System.out.println("Digite a idade do gato: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o preço do gato: ");
                    preço = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a cor do gato: ");
                    String cor = sc.nextLine();
                    lojadeAnimais.adicionarAnimal(new Gato(nome, idade, preço, cor));
                    System.out.println(("\nGato Adicionado com Sucesso!").toUpperCase());

                    break;
                case 4:
                    System.out.println("Digite o nome do peixe: ");
                    nome = sc.nextLine();
                    System.out.println("Digite a idade do peixe: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o preço do peixe: ");
                    preço = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o tipo de água do peixe: ");
                    String tipodeAgua = sc.nextLine();
                    System.out.println("Digite a profundidade máxima do peixe em m²: ");
                    int profundidadeMaxima = sc.nextInt();
                    sc.nextLine();
                    lojadeAnimais.adicionarAnimal(new Peixe(nome, idade, preço, tipodeAgua, profundidadeMaxima));
                    System.out.println(("\n Peixe Adicionado com Sucesso!").toUpperCase());
                    break;
                case 3:
                    System.out.println("Digite o nome do pássaro: ");
                    nome = sc.nextLine();
                    System.out.println("Digite a idade do pássaro: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o preço do pássaro: ");
                    preço = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite se o pássaro pode voar: (true/false)");
                    boolean podeVoar = sc.nextBoolean();
                    sc.nextLine();
                    lojadeAnimais.adicionarAnimal(new Passaro(nome, idade, preço, podeVoar));
                    System.out.println(("\n Pássaro Adicionado com Sucesso!").toUpperCase());

                    break;
                case 5:
                    lojadeAnimais.listarEstoque();
                    System.out.println("Deseja voltar as opções?(s/N)");
                    String novoChar = sc.nextLine();
                    if (novoChar.equals("s"))
                        continue;
                    else if (novoChar.equals("N"))
                        System.out.println("ENCERRANDO PROGRAMA...");
                    System.exit(0);
                    break;
                case 6:
                    System.out.println("Digite o nome do animal ao qual quer buscar: ");
                    nome = sc.nextLine();
                    Animal animal = lojadeAnimais.buscarAnimal(nome);
                    System.out.println("\n****************************************");
                    System.out.println("|O animal encontrado foi listado abaixo|".toUpperCase());
                    System.out.println(animal);
                    System.out.println("****************************************");
                    break;
                case 7:
                    System.out.println("Digite o nome do animal: ");
                    nome = sc.nextLine();
                    lojadeAnimais.venderAnimal(nome);
                    break;
                case 8:
                    System.out.println("LISTANDO TODOS OS CACHORROS: ");
                    lojadeAnimais.listarApenasCachorros();
                    break;
                case 9:
                    lojadeAnimais.listarTreinaveis();
                    break;
                case 10:
                    lojadeAnimais.listarAquaticos();
                    break;
                case 11:
                    System.out.println("Digite o nome do cachorro que você quer treinar: ");
                    nome = sc.nextLine();
                    Animal cachorro = lojadeAnimais.buscarAnimal(nome);
                    if (cachorro instanceof Cachorro) {
                        ((Cachorro) cachorro).treinar();
                    } else {
                        System.out.println(
                                "Desculpe. Você precisa selecionar o nome de um cachorro presente no estoque para treina-lo");
                    }
                    break;
                case 12:
                    lojadeAnimais.concertoDosAnimais();
                    break;
                case 13:
                    System.out.println("|Animal mais caro abaixo!|");
                    System.out.println(lojadeAnimais.animalMaisCaro() + "R$");
                    break;
                case 14:
                    lojadeAnimais.estatisticaPorTipo();
                    break;
                case 15:
                    lojadeAnimais.gerarRelatorio();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("FAVOR! INSIRA UMA OPÇÃO VÁLIDA!");
                    break;
            }

        } while (entrada != 0);
        sc.close();
    }
}
