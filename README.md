# Conceitos Iniciais de POO em Java

Este repositório reúne projetos e exercícios desenvolvidos em **Java**, com foco nos conceitos iniciais de **Programação Orientada a Objetos (POO)**.

Os exemplos exploram classes, objetos, encapsulamento, herança, classes abstratas, interfaces, enums, composição e polimorfismo, além de introduzir a organização de projetos Java com Maven.

## Conteúdos Abordados

- Classes e objetos
- Atributos e métodos
- Encapsulamento
- Construtores
- Getters e setters
- Enums
- Interfaces
- Classes abstratas
- Herança
- Composição
- Polimorfismo
- Alteração de comportamento em tempo de execução
- Projetos Java com Maven

## Estrutura do Repositório

```text
.
├── Atividade Complementar/
├── EngSoft.Jogo.Patos/
└── SuperHeroes/
```

## Descrição dos Projetos

### Atividade Complementar

Projeto Maven com um exemplo de domínio relacionado a bicicletas.

O projeto utiliza tipos de bicicleta e calculadoras de velocidade para demonstrar como separar comportamentos em classes específicas, usando interface e enum para organizar as regras.

Principais conceitos:

- Classe `Bike`
- Enum `BikeType`
- Interface `SpeedCalculator`
- Classes específicas para cálculo de velocidade
- Encapsulamento
- Polimorfismo
- Organização com Maven

Classes principais:

- `Bike`
- `BikeType`
- `SpeedCalculator`
- `SpeedOne`
- `SpeedEighteen`
- `Main`

### EngSoft.Jogo.Patos

Projeto com foco em composição, interfaces e alteração de comportamento em tempo de execução.

O exemplo utiliza uma classe abstrata base e diferentes classes de comportamento para representar ações como voar, grasnar e pular. A proposta mostra como um objeto pode delegar comportamentos para outras classes, tornando o código mais flexível.

Principais conceitos:

- Classe abstrata
- Herança
- Composição
- Delegação de comportamento
- Interfaces de comportamento
- Polimorfismo
- Mudança de comportamento em tempo de execução

Classes e interfaces principais:

- `Pato`
- `Pato_Bravo`
- `Pato_Borracha`
- `Pato_Ruivo`
- `Pato_Atleta`
- `Padrao_Voaveis`
- `Padrao_Pulaveis`
- `Voar_Foguete`
- `Voar_Raso`
- `Nao_Voa`
- `Pular_Alto`
- `Pular_Certinho`
- `Pular_Desordenado`
- `Main`

### SuperHeroes

Projeto Maven com um exemplo de domínio relacionado a heróis e cálculo de poder.

O projeto aplica interface e enum para associar diferentes tipos de heróis a diferentes estratégias de cálculo de força/poder.

Principais conceitos:

- Classe `Hero`
- Enum `HeroType`
- Interface `PowerCalculator`
- Classes específicas de cálculo de poder
- Encapsulamento
- Polimorfismo
- Separação de responsabilidades
- Organização com Maven

Classes principais:

- `Hero`
- `HeroType`
- `PowerCalculator`
- `Normal_Strength`
- `Mutation_Strength`
- `Questionable_Strength`
- `Supernatural_Strength`
- `Main`

## Tecnologias Utilizadas

- **Java**
- **Maven**
- **Programação Orientada a Objetos**
- **Interfaces**
- **Enums**
- **Classes abstratas**
- **Polimorfismo**

## Como Executar os Projetos

### Projetos Maven

As pastas `Atividade Complementar` e `SuperHeroes` possuem arquivo `pom.xml`.

Para executar:

1. Abra a pasta do projeto em uma IDE como IntelliJ IDEA, Eclipse ou VS Code.
2. Aguarde a importação do Maven.
3. Execute a classe `Main`.

Também é possível compilar pelo terminal, dentro da pasta do projeto:

```bash
mvn clean compile
```

### Projeto EngSoft.Jogo.Patos

Esse projeto pode ser aberto diretamente em uma IDE Java. Para executar, localize a classe:

```text
engsoft.jogo.patos.Main
```

Em seguida, execute o método `main`.

## Observação

As pastas `target`, `bin` e `out` são geradas automaticamente por ferramentas como Maven, IntelliJ IDEA ou Eclipse durante a compilação dos projetos. Elas armazenam arquivos compilados e não precisam ser editadas manualmente.

## Objetivo do Repositório

Este repositório tem como objetivo organizar estudos iniciais de Programação Orientada a Objetos em Java, demonstrando como modelar entidades, separar responsabilidades e usar abstrações para criar código mais flexível e reutilizável.

## Autoria

Desenvolvido como parte dos estudos de Programação Orientada a Objetos em Java.
