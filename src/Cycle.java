import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int precio, cantidad, contador, subtotal, acumulador, total, recibido, devuelta ;

        contador = 0;
        acumulador = 0;

        for(int x=1; x<=5; x++){
            System.out.println(" Digite el precio del producto ");
            precio = lectura.nextInt();

            System.out.println(" Digite la cantidad del producto ");
            cantidad = lectura.nextInt();

            contador = contador+1;
            subtotal = precio*cantidad;
            acumulador = acumulador+subtotal;
        }

        total = acumulador;
        System.out.println(" El total a pagar es: " +total);

        System.out.println(" Paga con ");
        recibido = lectura.nextInt();

        devuelta = total- recibido;
        System.out.println("Tu cambio es de: " +devuelta);

        String respuesta;
        System.out.println(" ¿Cuenta con telefonia movil exito? ");
        respuesta = lectura.next();

        if(respuesta.equals("si")){
            System.out.println(" Los minutos que obtuvo en su compra son: " +contador);
        }
        else{
            System.out.println(" No pierdas mas minutos adquiere tu telefonia movil ya! ");
        }
       
        lectura.close();
    }
}
