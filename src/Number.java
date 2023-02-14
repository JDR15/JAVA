import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int num1, num2, suma, resta;

        System.out.println("Ingrese numero 1: ");
        num1 = lectura.nextInt();

        System.out.println("Ingrese numero 2: ");
        num2 = lectura.nextInt();

        suma = num1+num2;
        resta =  num1-num2;

        if(num1>num2){
            System.out.println(" El numero mayor es " +num1+ " el numero menor es " +num2+ " el resultado es " +suma);

        } else{
            System.out.println(" El numero menor es " +num1+ " el numero mayor es " +num2+ " el resultado es " +resta);
        }


        lectura.close();
    }
}
