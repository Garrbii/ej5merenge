import java.util.Scanner;

public class Practica2EstructurasIterativas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Elige un ejercicio: ");
            op = sc.nextInt();


            switch (op) {
                case 1:
                    System.out.println("Los numeros naturales: ");
                    int num = 0;
                    while (num < 20) {
                        num++;
                        System.out.println(num);
                    }
                    break;

                case 2:
                    System.out.println("Numeros entre 1 y 200");
                    int num2 = 0;
                    while (num2 < 200) {
                        //num2 + 2;
                            System.out.println(num2);

                    }
                    break;
                case 3:
                    int num3 = 0;
                    while (num3 < 200) {
                        num3++;
                        if (num3 % 2 == 0) {
                            System.out.println(num3);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Pon el numero N");
                    int n = sc.nextInt();
                    int num4 = 0;
                    while (num4 < n) {
                        num4++;
                            System.out.println(num4);
                    }
                    break;
                case 5:
                    System.out.println("Pon el numero N");
                    int n2 = sc.nextInt();

                    int num5 = 0;
                    while (num5 < n2) {
                        num5++;
                        int num55 = n2 * num5;
                        System.out.println(num55);
                    }
                    break;
                case 6:
                    int num87 = 0;
                    boolean negativo87 = false;
                    for (int i = 0; i < 10; i++) {
                        if (num87 < 0) {
                            negativo87 = true;
                        }
                    }
                    if (negativo87) {
                        System.out.println("Hubo números negativos.");
                    } else {
                        System.out.println("No hubo números negativos.");
                    }
                    break;

                case 7:
                    int num54 = 0;
                  int negativos = 0;
                  int positivos = 0;

                    System.out.println("Pon 10 números: ");
                    num54 = sc.nextInt();
                  for (int i = 0; i < 10; i++) {
                      if (num54 < 0) {
                          negativos++;
                      } else {
                          positivos++;
                      }
                  }

                    System.out.println("Hubo " + negativos + " números negativos y " + positivos + " números positivos.");
                    break;
                case 8:
                    int negativo2 = 0;
                    int positivo2 = 0;
                    int numero8;

                    System.out.println("Pon un numero (0 para terminar)");
                    numero8 = sc.nextInt();

                    while (numero8 != 0) {
                        if (numero8 < 0) {
                            negativo2++;
                        } else {
                            positivo2++;
                        }
                        System.out.println("Pon un numero (0 para terminar)");
                        numero8 = sc.nextInt();
                    }

                    if (negativo2 > 0) {
                        System.out.println("Se ha leído algún número negativo.");
                    } else {
                        System.out.println("No se ha leído ningún número negativo.");
                    }
                    System.out.println("Hubo " + negativo2 + " números negativos y " + positivo2 + " números positivos.");
                    break;
                case 9:
                    int suma = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
                    long producto = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10;

                    System.out.println("La suma es : " + suma +". El producto es: " + producto);
                    break;
                case 10:
                    int nota = 0;
                    int diez = 0;



                    while (nota != -1) {
                        if (nota == 10) {
                            diez++;
                        }
                        if (diez != 0) {
                            System.out.println("Hubo alguna nota con valor 10.");
                        }
                        if (nota == -1 && diez > 1) {
                            System.out.println("No hubo ninguna nota con valor 10.");
                        }
                        System.out.println("Escribe una nota: (para terminar pon -1)");
                        nota = sc.nextInt();
                    }


                    break;
                case 11:
                int pares = 0;
                int impares = 0;
                int num1111 = 100;

                while (num1111 <= 200) {
                    if (num1111 % 2 == 0) {
                        pares += num1111;
                    } else {
                        impares += num1111;
                    }
                    num1111++;
                }
                    System.out.println("Pares: " + pares);
                    System.out.println("Impares: " + impares);

                    break;
                case 12:
                    System.out.println("Pon el numero A");
                    int a = sc.nextInt();
                    System.out.println("Pon el numero B");
                    int b = sc.nextInt();

                    long resultado = 1;
                    int cont12 = 0;
                    while (cont12 < b) {
                        resultado = resultado * a;
                        cont12++;
                    }
                    System.out.println(a + " elevado a " + b + " = " + resultado);
                    break;
                case 13:
                    System.out.println("Intento de adivinar");
                    int min = 1;
                    int max = 100;
                    String respuesta = "";

                    while (!respuesta.equals("igual")) {
                        int propuesta = (min + max) / 2;
                        System.out.println("Es el numero mayor o menos que " + propuesta + "? (mayor / menor / igual");
                        respuesta = sc.next().toLowerCase();

                        if (respuesta.equals("mayor")) {
                            min = propuesta + 1;
                        } else if (respuesta.equals("menor")) {
                            max = propuesta - 1;
                        } else if (!respuesta.equals("igual")) {
                            System.out.println("Escribe illo");
                        }
                        if (respuesta.equals("igual")) {
                        System.out.println("¡Adivinado!");
                        }
                    }
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Pa");
                    break;
            }
        } while (op < 15);
    }
}
