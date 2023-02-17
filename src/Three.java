import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
         
        int numero = (int) (Math. random()*2+1);

        String name;
        System.out.println("Hola como te llamas ");
        name = lectura.nextLine();

        String eleccion;
        System.out.println(name + " ¿Que vas a eligir Cara o Sello ?");
        eleccion = lectura.nextLine();

        if( eleccion.equals("cara") && numero==1){
            System.out.println(" Usted escogio cara y gano ");
        }
        else if( eleccion.equals("sello") && numero==2){
            System.out.println(" Usted escogio sello y gano ");
        }
        else if( eleccion.equals("cara") && numero==2){
            System.out.println(" Usted escogio cara y perdio ");
        }
        else if( eleccion.equals("sello") && numero==1){
            System.out.println(" Usted escogio cara y perdio ");
        }



        lectura.close();
    }
}
