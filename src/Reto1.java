import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double temperaturaEnFarenheit, temperaturaEncentigrados;

        System.out.println(" Ingrese la temperatura en Farenheit: ");
        temperaturaEnFarenheit = lectura.nextDouble();

        temperaturaEncentigrados = (temperaturaEnFarenheit-32) / 1.8;

        System.out.println(" La temperatura en centigrados es " + temperaturaEncentigrados);

        lectura.close();




        
    }
}
