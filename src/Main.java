import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        do {
            System.out.println("BIENVENIDO ");
            System.out.println("A continuacion encontrara el menu de opciones");
            System.out.println("1. CONDICION IF:");
            System.out.println("2. CONDICION WHILE");
            System.out.println("3. CONDICION DO WHILE");
            System.out.println("4. CONDICION FOR");
            System.out.println("5. CASO SWITCH ");
            System.out.println(" Si desea SALIR presione la opcion 6");

            opcion = teclado.nextInt();


            if (opcion <=6) {
                switch (opcion) {

                    case 1:
                        System.out.print("Digite el numero: ");
                        int numeroIf = teclado.nextInt();
                        if (numeroIf > 0) {

                            System.out.println("El numero es positivo");
                        } else if (numeroIf < 0) {
                            System.out.println("El numero es negativo");
                        } else {
                            System.out.println("digite una numero valido, el 0 es neutro");
                        }
                        break;

                    case 2:
                        System.out.println("Digite el numero");
                        int numeroWhile = teclado.nextInt();
                        while (numeroWhile < 3) {
                            System.out.println("los numeros son:" + numeroWhile);
                            numeroWhile++;
                        }
                        break;

                    case 3:
                        System.out.println("Digite el numero");
                        int numeroDoWhile = teclado.nextInt();
                        do {
                            System.out.println("El numero es :" + numeroDoWhile);
                            numeroDoWhile++;

                        } while (numeroDoWhile < 3);
                        break;

                    case 4:
                        System.out.println("Digite un numero menor a 3:");
                        int numeroFor = teclado.nextInt();
                            for (; numeroFor <= 3; numeroFor++) {
                            System.out.println("el numero es:" + numeroFor);
                        }
                            if (numeroFor > 3) {
                            System.out.println("digite un numero valido");
                        }
                        break;

                    case 5:
                        System.out.println("Digite el nombre de la estacion:");
                        String estacion = teclado.next();
                            switch (estacion) {
                                case "verano":
                                    System.out.println("Es verano");
                                    break;
                                case "invierno":
                                    System.out.println("Es invierno");
                                    break;
                                case "primavera":
                                    System.out.println("Es primavera");
                                    break;
                                case "otoño":
                                    System.out.println("Es otoño");
                                    break;
                                default:
                                    System.out.println("Esa estacion NO EXISTE ");
                                    break;
                             }

                    case 6:
                            salir = true;
                        break;
                 }
               } else {
                System.out.println("Digite una opcion valida entre 1-5 o pulse 6 para salir");
            }
        }
               while (!salir);

   }

}
