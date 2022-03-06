// Função do Código: Aprender sobre: Variáveis, Tipos de dados e Operadores aritiméticos.
// Autor: Lucas Damasceno

// O curso tem a finalidade de fazer com que o aluno entenda o que são variáveis, como criá-las e manipulá-las.
// Percurso:
 // Aula 1 - Conceituação e Criação;
 // Aula 2 - Tipos de Dado;
 // Aula 3 - Operadores Aritiméticos;
 // Aula 4 - Conversões (casting).

// Objetivos da Aula 1:
// 1. Entender o que são variáveis;
// 2.  Saber como criar variáveis.

/*
Variável: Um espaço na memória do computador, onde se pode guardar valores.
Existem 4 tipos na linguagem Java:
- Instância: objeto;
- Classe: classe;
- Local: dentro de métodos;
- Parâmetro: Na assinatura do método.
Obs.: Método 'Main" é o método usado para disparar a execução do programa. Nesse método que criaremos nossa variáveis inicias.

Padrão de definição (entre "?"" é opicional):
<?visibilidade?> <?modificador?> tipo nome <?valorInicial?>
V: "public", "protected" e "private" (ligadas a orientação a objetos).
M: "static" e "final"
T: tipo de dado
N: nome que é fornecido a variável
VI: um valor inicial, caso se deseje

Javae é uma linguagem fortemente tipada.

Convenções e regras para a criação de varipaveis no Java:
- Não devem começar com números;
- Embora permitido, "$" e "_" devem ser evitados;
- São case-sensitive (diferencia maiúsculos e minúsculos);
- Sem espaços;
- Não pode ser as palavaras reservadas (comandos) do Java.

Boas práticas de escrita de código:
- Sempre começar com letra minúscula;
- Nome expressivos;
- Notação camelo;
- Quando constantes (final), tudo maiúscula e separada por "_";
*/

// Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de Dado e Operadores aritméticos.

public class Aula_1 {

    public static void main(String[] args){
        int i;
        //int i;
        int I;
        //int 1a;
        int _1a; // Não recomendado
        int $aq; // Não recomendado
        
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15;   // Não pode mudar o valor de final
        int asrn24678md;
        // asrn246 78md; 
        int asrn2$4678_md = 10;
        //int asrn2$46%78_md = 10;   // Caractere inválido '%'
        
        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        //int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);
        
        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
        



        
    }
}

