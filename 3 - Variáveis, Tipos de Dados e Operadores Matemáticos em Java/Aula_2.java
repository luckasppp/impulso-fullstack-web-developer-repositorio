// Função do Código: Entender o que são tipos de dados e saber como e quando usar cada um
// Autor: Lucas Damasceno
// 
/*
Obejtivos:
1. Entender o que são tipos de dados;
2. Saber como e quando usar cada um.

Tipo de dado: São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.

Tipificação: 
- Estática (forte) vs Dinâmica (fraco);
- Primitivo vs Composto.

Obs.: Pequisar sobre linguagens compliadas e interpretadas.

Opções de tipos:
- Textual;
- Numeral;
- Lógico;
- Objeto;

*/
/* 
// Exemplos numéricos:
byte b = 15;                             // byte: - 128 até 127                                                                                    Valor default: 0
short s = -15785;                    // short: -32.768 até 32.767                                                                           Valor default: 0
int i = 8515785;                      // int: -2.147.483.648 até 2.147.483.647                                                       Valor default: 0
long l = 5938515785L;          // long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807           Valor default: 0L
float f = 3.14f ;                       // float: +- 3.40282347E+38F                                                                        Valor default: 0.0f
double d = 3.14d ;                  // double: +- 1.79769313486231570E+308                                                   Valor default: 0.0d

// Exemplos textuais:
char c = '\u0084';   // ou c = 'T';         // char: caracteres de 16-bit unicode                                                   Valor default: '\u0000'
String s = "T"                                    // String: um tipo "especial"                                                                Valor default: null

// Exemplo Lógico: 
boolean bo = false;                            // boolean: true e false                                                                           Valor default: false
 */
// Exemplos Objeto:
// Serão cenas dos próximos capítulos.

// Boas práticas:
// - Usar de forma adequada cada tipo de dado para cada informação.


// Classe de exemplo para o exercício da Aula 2 de Variáveis, Tipos de Dado e Operadores Aritiméticos.


public class Aula_2 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
    
        short s1 = 20000;
        //short s2 = 40000;
    
        //int i1 = -10000000000;
        int i2 = 28500;
    
        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5;
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.04d;

        char c1 = 'W';
        //char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se   se et  t  KNBJBJBB &*''&%& 75894389";

        //String dt1 = "09/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;

        // Printando:
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}

