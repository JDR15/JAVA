import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double ancho, largo, area, presupuesto;
        System.out.println(" Ingrese el ancho: ");

        ancho = lectura.nextDouble();
        System.out.println(" Ingrese el largo: ");
        largo = lectura.nextDouble();

        area = largo*ancho;

        presupuesto = 45000*area;

        System.out.println(" La superficie a cubrir tiene " +ancho+ " metros de ancho " +largo+ " metros de largo, con " +area+ " metros cuadrados. " + " El presupuesto del proyecto es " +presupuesto);



        lectura.close();




    }
}
