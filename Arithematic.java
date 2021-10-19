


import java.util.Scanner;

abstract class Arithmetic {
    int a, b, c, d;

    abstract int add(int a, int b);

    abstract int multiplication(int a, int b);

    static class Addition extends Arithmetic {
        //Regular method
        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value of a");
            a = sc.nextInt();
            System.out.println("Enter a value of b");
            b = sc.nextInt();
        }

        void add() {
            c = a + b;
        }

        void multiplication() {
            d = a * b;
        }

        void result() {
            System.out.println("Addition of two numbers" + c);
            System.out.println("Multiplication of two numbers" + d);
        }
// abstract method
        @Override
        int add(int a, int b) {
            return a + b;
        }

        @Override
        int multiplication(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
        // for abstract method
        Arithmetic ar = new Addition();
        System.out.println(ar.add(3, 5));
        System.out.println(ar.multiplication(47, 4));

        // for regular method
        Addition ad = new Addition();
        ad.input();
        ad.multiplication();
        ad.add();
        ad.result();
    }
}
