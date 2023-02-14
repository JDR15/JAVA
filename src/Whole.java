import java.util.Scanner;

public class Whole {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int num;
        System.out.println(" Igrese un numero ");
        num= lectura.nextInt();

        if( num>0){
            System.out.println(" El numero es positivo ");

        } else if (num==0){
            System.out.println("El numero es neutro ");

        }else{
            System.out.println("El numero es negattivo ");
        }

        lectura.close();
    }
}
