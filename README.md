# Sistema de Gerenciamento de PetShop (Loja de Animais)

Este é um projeto desenvolvido em Java para simular o gerenciamento de uma PetShop. A aplicação utiliza conceitos sólidos de Programação Orientada a Objetos (POO) para gerenciar estoque, vendas e características específicas de diferentes tipos de animais.

##  Funcionalidades

O sistema funciona via console (terminal) e permite:

* **Gestão de Estoque:** Adicionar Cachorros, Gatos, Pássaros e Peixes.
* **Vendas:** Realizar a venda de animais (removendo-os do estoque e registrando a venda).
* **Consultas Avançadas:**
    * Listar todo o estoque.
    * Buscar animais por nome.
    * Filtrar apenas animais treináveis ou aquáticos (uso de Interfaces).
    * Verificar o animal mais caro e estatísticas por tipo.
* **Interatividade:**
    * Treinar cachorros.
    * "Concerto dos animais" (Demonstração de Polimorfismo onde cada animal emite seu som).
* **Relatórios:** Geração de relatório financeiro e de vendas.

##  Tecnologias e Conceitos Utilizados

* **Java (JDK)**
* **POO:** Herança, Polimorfismo, Classes Abstratas e Encapsulamento.
* **Interfaces:** Implementação de contratos (`Treinavel`, `Aquatico`).
* **Collections Framework:** Uso de `ArrayList` para gestão dinâmica de dados.
* **Java Streams:** Filtragem de dados funcional.
* **Tratamento de Exceções:** Criação e uso de exceções personalizadas (`EntradaMenuInvalidaException`) e `try-catch`.

##  Como baixar e executar

Para rodar este projeto na sua máquina, você precisará do [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/Arley0122/LojaDeAnimaisJava.git](https://github.com/Arley0122/LojaDeAnimaisJava.git)
## Navegue até o diretório e execute os seguintes comandos no terminal:
* cd src
* javac Main.java
* java Main
