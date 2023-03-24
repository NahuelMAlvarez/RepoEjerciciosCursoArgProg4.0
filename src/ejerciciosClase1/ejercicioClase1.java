
        import java.util.Scanner;

        public class ejercicioClase1 {
            public static void main(String[] args) {
                System.out.println("Respuestas ejercicios clase 1: " );
                System.out.println(" ");
                //Ejercicio 1a
                int numA = 2;
                int numB = 12;
                System.out.println("Ejercicio 1a:");
                System.out.println(numA);
                while (numB > numA) {
                    numA = numA + 1;
                    System.out.println(numA);
                }
                System.out.println(" ");
                //Ejercicio 1b
                numA = 2;
                numB = 12;
                System.out.println("Ejercicio 1b:");
                System.out.println(numA);
                while (numB > numA) {
                    numA = numA + 2;
                    System.out.println(numA);
                }
                System.out.println(" ");
                //Ejercicio 1c
                System.out.println("Ejercicio 1c:");
                numA = 2;
                numB = 12;
                Scanner entrada= new Scanner (System.in);
                int parImpar;

                System.out.println("Presionar 2 para mostrar numeros pares; presionar 3 para mostrar numeros pares");
                parImpar = entrada.nextInt();
                if (parImpar == 2) {
                    System.out.println(numA);
                    while (numA<numB) {
                        numA = numA + 2;
                        System.out.println(numA);
                    }
                } else if(parImpar == 3) {
                    numA=numA+1;
                    System.out.println(numA);
                    while (numA<11) {
                        numA = numA + 2;
                        System.out.println(numA);
                    }
                }else {
                    System.out.println("Opción incorrecta, intente nuevamente mas tarde...");


                }
                System.out.println(" ");
                //Ejercicio 1d
                System.out.println("Ejercicio 1d:");
                for (numB=12;numB>=2;numB--){
                    System.out.println(numB);
                    numB=numB-1;
                }


            }


        }

