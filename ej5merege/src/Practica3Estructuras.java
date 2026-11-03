import java.util.Scanner;

public class Practica3Estructuras {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Elige un ejercicio: ");
            op = sc.nextInt();


            switch (op) {
                case 1:
                    ej1();
                        break;
                case 2:
                    ej2();
                    break;
                case 3:
                    ej3();
                    break;
                case 4:
                    ej4();
                    break;
                case 5:
                    ej5();
                    break;
                case 6:
                    ej6();
                    break;

                case 7:
                    ej7();
                    break;
                case 8:
                    ej8();
                    break;
                case 9:
                    ej9();
                    break;
                default:
                    System.out.println("Pa");
                    break;
            }
        } while (op < 10);


        }
       
}