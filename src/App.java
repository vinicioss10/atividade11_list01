import java.util.Scanner;

/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo. */

public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2;
        double n3;
        double a;
        double ra;
        double b;
        double rb;
        double c;
        double rc;
        Scanner dig;

        dig = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        n1 = dig.nextInt();
        System.out.println("Digite o segundo numero ");
        n2 = dig.nextInt();
        System.out.println("Digite o terceiro numero");
        n3 = dig.nextInt();

        ra = (2 * n1) * (n2 / 2);

        System.out.println("A reposta do problema a é " + ra);

        rb = 3 * n1 + n3;

        System.out.println("A resposta do problema b é " + rb);

        rc = Math.pow(n3, 3);

        System.out.println("A resposta do problema c e " + rc);

    }
}
