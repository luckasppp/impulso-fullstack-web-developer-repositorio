// Autor:  Lucas Damasceno
/* 
Objetivos da Aula:
1. Entender o que são operadores aritiméticos;
2. Saber como usar cada um.

Operador Aritimético: São símbolos especiais capazes de realizar ações esécíficas
 em um, dois ou mais operandos e, em seguida, retornar um resultado.

 São eles:
 - Pós-fixado: exp++ ou exp--
 - Prefixado: ++exp ou --exp
 - Aritimérico: +, -, *, /, %
 - Atribuição: =, +=, -=, *=, /=, %=

 Exemplos: 
 - int i = ++k;     i = k + 1;                                  |         - double d = f;
 - int j = k--;       j = k;             k = k-1                |         - i += 5;                 i = i + 5;
 - float f = 1.5f + 4.5f;                                        |         - j -= 3;                   j = j - 3;
 - long l = 10398L * 5L;                                     |         - d /= 2.7d;            d = d / 2.7d;
- double d = 45d / 4d;                                         |         - l *= 3;                 i = i * 3 
- int k = 15 % 4;                                                 |          - k %= 2;              k = k % 2; 

Precedências:
Pós-fixado                              exp++, exp--
Prefixado                               ++exp, --exp
Multiplicativo                        *, /, %
Aditivo                                   +, -  
Atribuição                              =, +=, -=, *=, /=, %=

*/

/**
 * Aula_3
 */
public class Aula_3 {

    public static void main(String[] args) {
        
        System.out.println("PrePos");
        PrePos();
        System.out.println("Aritmético");
        aritimetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }


    private static void PrePos() {

        int k = 10;
        
        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("k:" + k);
        System.out.println("x:" + x);
    }

    private static void aritimetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d + b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a+b:" + r1);
        System.out.println("c-a:" + r2);
        System.out.println("d+b:" + r3);
        System.out.println("e/a:" + r4);
        System.out.println("c%b:" + r5);
        
    }

    private static void atribuicao() {
        
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:" + d);

        i += 5;         // i = i + 5
        j -= 3;          // j = j - 3
        d /= 2.7d;    // d = d / 2.7d
        l *= 3;         // l = l * 3
        k %= 2;       // k = k % 2

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;

        System.out.println("k:" + k);
        System.out.println("i:" + i);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;
        
        int a = i++ + --j * k; // 10 + 19 * 30      =>      10 + 570        =>      580
        System.out.println("i++ + --j * k:" + a);
        System.out.println("i: " + i);  // 11

        int b = k / --i % 3 + 1;    // 30 / 10 % 3 + 1      =>      1
        System.out.println("k / --i % 3 + 1: " + b);
        System.out.println("i:" + i);   // 10

        int c = 2;

        c *= i += 5;    // c = 2 * i    =>  i = i + 5   =>  c = 2 * i   =>  i = 10 + 5  =>  c = 2 * 15  =>  c = 30
        System.out.println("c += i + 5:" + c);

    }
}