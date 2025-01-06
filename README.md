# Atividade: classes ContaBancaria e ContaCorrente

## Descrição
Este repositóro é dedicado ao desenvolvimento das classes ContaBancaria e ContaCorrente, atividade do curso de Java: aplicando orientação a objetos. Diferente das outras atividade sobre orientação a objetos, a proposta dessa atividade é iniciar os princípios  de: encapsulamento e herança, da orientação a objetos.

## Detalhes técnicos
Para a realização dessas atividades foi utilizada a IDE Intellij. Não houve instalação de bibliotecas externas. A versão do Java utilizada nas atividades é: Java 21. 

## Pré-requisitos
Antes de executar os códigos Java presentes neste repositório, é necessário instalar o JDK (Java Development Kit).
O JDK é indispensável para compilar o código-fonte (.java) e gerar arquivos .class, que contêm os bytecodes essenciais para que a máquina execute o programa. O bytecode é uma linguagem intermediária compreendida pela Máquina Virtual Java (JVM), mas não diretamente pelos seres humanos. Essa conversão da linguagem Java para bytecode ocorre durante a compilação, por isso a instalação do JDK é imprescindível.

Caso este repositório já incluísse os arquivos .class gerados a partir do código-fonte, seria necessário apenas instalar o JRE (Java Runtime Environment). O JRE fornece o ambiente necessário para executar o bytecode, dispensando a necessidade de compilação. Da mesma forma, se o repositório contivesse um arquivo .jar (um executável Java), apenas a instalação do JRE seria suficiente.

Essas instalações, tanto do JDK quanto do JRE, são importantes porque incluem a Máquina Virtual Java (JVM), responsável por interpretar e executar o bytecode, garantindo a execução do programa Java.

**Link de instalação do JDK e JRE:**
1. JDK: https://www.oracle.com/br/java/technologies/downloads/
2. JRE: https://www.java.com/pt-BR/download/manual.jsp
   
*Importante: ao instalar o JDK escolha a versão com suporte, ela é identificada pela sigla LTS*

**Link de instalação do Intellij e tutorial de uso:**
1. Instalação: https://www.jetbrains.com/pt-br/idea/
2. Tutotrial de uso: https://www.youtube.com/watch?v=0_e9Egeyk2E

*Importante: ao instalar o Intellij escolha a edição community, ela é gratuita*

## Sobre a atividade
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

## Sobre programação estrutural x programação orientada a objetos
Em programação existe dois paradigmas: estrutural e orientado a objetos. A linguagem de programação que faz uso do paradigma estrutural desenvolvem em uma programação estruturada, com este paradigma temos as linguagens: C, Cobol, Pascal e Basic, por exemplo. Esse paradigma compreende que o programa deve seguir uma estrutura formada por:


 - Sequências: são comandos escritos de forma sequencial para serem executados;
 - Condições: sequências que só devem ser executada se uma condição for satisfeita;
 - Repetições: sequências que devem ser executadas repetidamente até que uma condição seja satisfeita;

Além disso em programação estruturada o programa é escrito em rotinas (funções) que recebem um bloco de instruções que contém uma ou todas as estruturas citadas acima. Essa rotinas podem ser quebradas em subrotinas. Essas subrotinas podem ser chamadas dentro de rotinas as quais se tornam responsáveis por executar todo o programa. Segue abaixo um exemplo do uso de programação estruurada usando a linguagem C:
```
// exemplo de programação estruturada usando a Linguagem C (sem uso de rotinas):

#include <stdio.h>

int main() {
    // sequência de comandos
    int dividendo, divisor;

    printf("Digite o valor de dividendo: ");
    scanf("%d", &dividendo);

    printf("Digite o valor de divisor: ");
    scanf("%d", &divisor);
    
    // estrutura de condição para verificar se dividendo é divisível por divisor
    if (divisor == 0) {
        printf("Divisão por zero não é permitida.\n");
    } else {
        if (dividendo % divisor == 0) {
            printf("%d é divisível por %d.\n", dividendo, divisor);
        } else {
            printf("%d não é divisível por %d.\n", dividendo, divisor);
        }
    }

    return 0;
}
```
```
// exemplo de programação estruturada usando a Linguagem C (com uso de rotinas):

#include <stdio.h>

// rotina (função) para verificar se dividendo é divisível por divisor
void verificarDivisibilidade(int dividendo, int divisor) {
    
    // estrutura de condição para verificar se dividendo é divisível por divisor
    if (divisor == 0) {
        printf("Divisão por zero não é permitida.\n");
    } else if (dividendo % divisor == 0) {
        printf("%d é divisível por %d.\n", dividendo, divisor);
    } else {
        printf("%d não é divisível por %d.\n", dividendo, divisor);
    }
}

int main() {

    // sequência de comandos
    int dividendo, divisor;

    printf("Digite o valor de dividendo: ");
    scanf("%d", &dividendo);

    printf("Digite o valor de divisor: ");
    scanf("%d", &divisor);

    // chamada da rotina (função)
    verificarDivisibilidade(dividendo, divisor);

    return 0;
}

```
O objetivo do paradigma orientado a objetos é aproximar as estruturas de um programa com as coisas do mundo real, além de fornecer uma maior proteção das variáveis utilizando o princípio de encapsulamento, isso não é visto e nem utilizado em programação estruturada, na verdade a programação estruturada se limita apenas a dizer se uma variável é vísivel ou não dentro de uma função. Além desse princípio existem outros que norteiam o paradigma de orientação a objetos. 

Para aproximar as estruturas de um programa com as coisas do mundo real, a POO como é chamada a programação orientada a objetos, definiu o conceito de classe e de objeto. Sendo a classe responsável por comportar os atributos (características) e métodos (comportamentos) de um objeto, servindo posteriormente de molde para a criação de objetos os quais tem tais atributos e fazem uso de tais métodos que podem ou não alterar o seu estado inicial.

Hoje em dia a maioria dos sistemas são desenvolvidos utilizando o paradigma de orientação a objetos, e a linguagem Java foi a pioneira no uso deste paradigma que revolucionou o reúso do código, a manutenção do código e a escrita do código. 

## Conteúdo estudado e aprendido no desenvolvimento da atividade
- **Encapsulamento:** é um dos pilares da POO, se trata de proteger os atributos e métodos de uma classe de acessos e modificações indevidas por outras classes e objetos de outras classes. Para encapsular os atributos e métodos de uma classe utilizamos os **modificadores de acesso**:
    - **Private:** permite apenas que a classe que tem os atributos e métodos possa acessá-los. Para que outra classe tenha acesso a esses membros precisamos dos métodos *getter* e *setter*, eles permitem que uma subclasse acesse os membros da superclasse, para isso é necessário que a subclasse esteja no mesmo pacote da superclasse e que herde da superclasse.
    É importante salientar que os métodos *getter* e *setter* pode não ser usados juntos para o mesmo atributo, no exemplo abaixo o atributo privado CPF não tem o método *setter*, isso porque não é permitido alterar o CPF depois de definido. Por outro lado temos o atributo privado nome que tem os métodos *getter* e *setter* permitindo que além de consultar, alterar o nome.
    ```
    public class SuperClasse{
        private String CPF;
        private String nome;

        public String getCPF(){
            return cpf;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(){
            // operador this é refrenciador do objeto atual
            this.nome = nome;
        }
    }
    ```
    - **Protected:** permite que os membros da classe sejam acessados pelas subclasses do mesmo pacote ou de outro pacote ambas formas meio da herança. Quando falamos de acessar de forma direta é sem o uso dos métodos *getter* e *setter*, contudo as  boas práticas visando a segurança e controle da aplicação recomenda o uso do *getter* e *setter* ainda que tenhamos um atributo protected. O exemplo abaixo é apenas sobre o acesso direto:

    ```
    public class SuperClasse{
         protected String nome;
    }

    // a subclasse pode estar no mesmo pacote ou em outro pacote, o acesso se faz por meio da herança
    public class SubClasse extends SuperClasse{
        public void mostrarNome(){
            System.out.println(nome)
        }
    }
    ```
    - **Public:** permite acesso livre a todos os atributos e métodos da superclasse sem a necessidade dos métodos *getter* e *setter*. Esses membros podem ser acessados por classes e subclasses de outros pacotes além das classes e subclasses do mesmo pacote da superclasse. O acesso ainda que livre é feito também a partir da herança.
    ```
    public SuperClasse{
        public String nome;
    }
    ```
    - **Default:** permite acesso dos membros da superclasse somente pelas classes e subclasses do mesmo pacote.
    ```
    public SuperClasse{
        String nome;
    }
    ```
- **Herança:** é mais um pilar da POO, nele está o conceito de generalização e especialização. Como dito anteriormente uma classe é um molde de algo do mundo real representado por meio da programação e esse molde servirá para criar objetos que possuem seus atributos e façam usam de seus métodos, contudo esse molde pode servir para outros moldes, por exemplo: classe Mamíferos teria todos os atributos e métodos que pertencem a um mamífero, a partir dessa classe podemos criar a classe Cachorros, classe Gatos e dizer que tanto cachorros quanto gatos possuem atributos e métodos similares os da classe Mamíferos, logo podemos fazer com que Cachorros e Gatos herdem da classe Mamífero. Apesar de herdar não é obrigatório o uso de todos os atributos e métodos da classe herdada, podem até mesmo as novas classes terem seus próprios atributos e métodos. Veja um diagrama de classes:
![diagrama de classe](image.png)

**Nesse diagrama lemos:** Cachorro e Gato tem pelos, mamas, idade e se comunicam. Cachorro e Gato tem rabo. Cachorro se comunica por meio do latido e gato por meio do miado. Logo dizemos que a classe Mamíferos é generalização e as subclasses Cachorro e Gato são especialização.
 
## Para saber mais
**Artigo sobre Orientação a Objetos:** [Artigo da Alura](https://www.alura.com.br/artigos/poo-programacao-orientada-a-objetos?srsltid=AfmBOoqZjVNt8nPtFAt0LFlfnhWQHJYHp9cwkibk2cTSP_QMhWmORV5I)

**Artigo sobre modificadores de acesso:** [Artigo do Gran Cursos](https://blog.grancursosonline.com.br/java-modificadores-de-acesso-parte-i-teoria/)

