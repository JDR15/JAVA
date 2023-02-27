import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numero = (int) (Math. random()*5+1);

        double buy, red, blue, yellow;
        
        System.out.println(" Ingresa el valor de la compra ");
        buy = lectura.nextInt();


        if( buy>=50000 && numero == 1){
            red = (buy*10)/100;
            System.out.println(" Sacaste la bolita roja tu descuento es de: " +red);
        }
        else if( buy>=50000 && numero == 2){
            blue =(buy*30)/100;
            System.out.println(" Sacaste la bolita azul tu descuento es de: " +blue);
        }
        else if( buy>=50000 && numero == 3){
            yellow =(buy*50)/100;
            System.out.println(" Sacaste la bolita amarilla tu descuento es de: " +yellow);
        }
        else if( buy>=50000 && numero == 4){
            System.out.println(" Sacaste la bolita blanca tu compra es gratis ");
        }
        else if(numero == 5){
            System.out.println(" Lo sentimos no obtuviste ningun descuento ");
        }


        lectura.close();
    }
}
