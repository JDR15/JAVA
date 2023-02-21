import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int precio, cantidad;

        for(int x=1; x<=5; x++){
            System.out.println(" Digite el precio del producto ");
            precio = lectura.nextInt();

            System.out.println(" Digite la cantidad del producto ");
            cantidad = lectura.nextInt();
        }
        lectura.close();
    }
}
