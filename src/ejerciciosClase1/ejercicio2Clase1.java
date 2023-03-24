import java.util.Scanner;

public class ejercicio2Clase1 {
    public static void main(String[] args) {

        float ingresos ;
        int vehiculos;
        int inmuebles;
        int barcoAvionActivos;
        int antiguedadVehic ;
        antiguedadVehic=0;

        System.out.println("Escriba sus ingresos:");
        Scanner entrada1= new Scanner (System.in);
        ingresos=entrada1.nextFloat();
        System.out.println("Cuantos vehiculos posee?");
        Scanner entrada2= new Scanner (System.in);
        vehiculos= entrada2.nextInt();
        if(vehiculos>=3){
            System.out.println("Cuantos de sus vehículos tienen menos de 5 años de antiguedad?");
            Scanner entrada4= new Scanner (System.in);
            antiguedadVehic=entrada4.nextInt();
        }
        System.out.println("Cuantos inmuebles posee?");
        Scanner entrada3= new Scanner (System.in);
        inmuebles=entrada3.nextInt();
        System.out.println(" Escriba 1 si posee alguna embarcación, una aeronave de lujo o es titular de activos societario");
        System.out.println(" De lo contrario escriba 0");
        Scanner entrada5= new Scanner (System.in);
        barcoAvionActivos=entrada5.nextInt();

        if ((ingresos < 489083) && ( vehiculos<3) &&(inmuebles <3) &&(barcoAvionActivos<1) && (antiguedadVehic<3) ) {
            System.out.println("No califica como ingresos altos");
        }else {
            System.out.println("Ingresos Altos");
        }

    }
}