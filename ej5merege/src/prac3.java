import java.util.Scanner;

public class Practica3Estructuras {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {}
        } while (op < 10);


        }
        public static void ej1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un número: ");
            int num = sc.nextInt();
            int mul = 0;
            for (int i = 1; i < num; i++) {
                if (i % 3 == 0) {
                    mul++;
                }
            }
            System.out.println("Hay " + mul + " múltiplos de tres.");
        }
    public static void ej2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int num2 = sc.nextInt();
        boolean primo = num2 >= 2;

        int divisor = 2;
        while (primo && divisor * divisor <= num2 ) {
            if (num2 % divisor == 0) {
                primo = false;
                System.out.println("No es primo.");
            } else {
                primo = true;
                System.out.println("Es primo.");
            }
        }
    }
    public static void ej3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int num3 = sc.nextInt();

    }
    public static void ej4() {
        Scanner sc = new Scanner(System.in);
        int suma4 = 0;
        int i4 = 1;
        while (i4 <= 5) {
            suma4 += i4 * i4;
            i4++;
        }
        System.out.println("La suma de los cuadrados es: " + suma4);

    }
    public static void ej5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un número: ");
        int n2 = sc.nextInt();

        int i5 = 0;
        while (i5 < n2) {
            System.out.print("* ");
            i5++;

        }
        System.out.println(" ");
    }
    public static void ej6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un número: ");
        int n3 = sc.nextInt();

        for (int i6 = 1; i6 <= n3; i6++) {
            for (int veces = 0; veces < i6; veces++) {
                System.out.print(i6);
            }
        }
                    /*int i6 = 1;
                    while (i6 < n3) {
                        int veces = 0;
                        while (veces < i6) {
                            veces++;
                        }
                        System.out.print(n3);
                        i6++;
                    }*/
        System.out.println(" ");
    }
    public static void ej7() {
        Scanner sc = new Scanner(System.in);

    }
    public static void ej8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un número: ");
        int n3 = sc.nextInt();

        for (int i6 = 1; i6 <= n3; i6++) {
            for (int veces = 0; veces < i6; veces++) {
                System.out.println("*");
            }
        }
                    /*int i6 = 1;
                    while (i6 < n3) {
                        int veces = 0;
                        while (veces < i6) {
                            veces++;
                        }
                        System.out.print(n3);
                        i6++;
                    }*/
        System.out.println(" ");
    }
    public static void ej9() {
        Scanner sc = new Scanner(System.in);
    }
}