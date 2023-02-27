import java.util.Scanner;

public class Discount2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numero = (int) (Math. random()*5+1);

        double  price, red, blue, yellow, amount, contador, subtotal, acumulador, whole, money, refund, refund2, refund3, refund4,
        red1, blue1 ;

        contador = 0;
        acumulador = 0;

        for(int x=1; x<=1; x++){
        System.out.println(" Digite el precio del producto ");
        price = lectura.nextInt();

        System.out.println(" Digite la cantidad del producto ");
        amount = lectura.nextInt();

        contador = contador+1;
        subtotal = price*amount;
        acumulador = acumulador+subtotal; 
        
    }    

        whole = acumulador;
        System.out.println(" El total a pagar es: " +whole);

        if( whole>=50000 && numero == 1){
            red = (whole*90)/100;
            red1 = (whole*10)/100;
            System.out.println(" Sacaste la bolita roja tu descuento es de: " + red1);
            System.out.println(" Paga con: ");
            money = lectura.nextInt();
            refund = money-red;
            System.out.println(" Tu cambio es de: "+refund);
        }
        else if( whole>=50000 && numero == 2){
            blue =(whole*70)/100;
            blue1 =(whole*30)/100;
            System.out.println(" Sacaste la bolita azul tu descuento es de: " +blue1);
            System.out.println(" Paga con: ");
            money = lectura.nextInt();
            refund2 = money-blue;
            System.out.println(" Tu cambio es de: "+refund2);
        }
        else if( whole>=50000 && numero == 3){
            yellow =(whole*50)/100;
            System.out.println(" Sacaste la bolita amarilla tu descuento es de: " +yellow);
            System.out.println(" Paga con: ");
            money = lectura.nextInt();
            refund3 = money-yellow;

            System.out.println(" Tu cambio es de: "+refund3);
        
        }
        else if( whole>=50000 && numero == 4){
            System.out.println(" Sacaste la bolita blanca tu compra es gratis ");
        }
        else {
            System.out.println(" Lo sentimos no obtuviste ningun descuento ");
            System.out.println(" Paga con: ");
            money = lectura.nextInt();
            refund4 = whole -whole;
            System.out.println(" Tu cambio es de: "+refund4);
        }

    
    
        lectura.close();
    }
}

