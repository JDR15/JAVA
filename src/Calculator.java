import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int number1, number2, suma, resta, multiplicacion, op;
        double division, potencia, raiz1, raiz2;

        System.out.println(" Ingrese el primer numero ");
        number1 = lectura.nextInt();

        System.out.println(" Ingrese el segundo numero ");
        number2 = lectura.nextInt();

        
        System.out.println(" 1.Suma 2.Resta 3.Multiplicacion 4.Division 5.Potencia 6.Raiz");
        op = lectura.nextInt();


        switch(op){

            case 1: 
            suma = number1+number2;
            System.out.println(" La suma de los numeros es: " +suma);
            break;

            case 2: 
            resta = number1-number2;
            System.out.println(" La resta de los numeros es: " +resta);
            break;

            case 3:
            multiplicacion = number1*number2;
            System.out.println(" La multiplicacion de los numeros es: " +multiplicacion);
            break;

            case 4:
            division = number1/number2;
            System.out.println(" La division de los numeros es: " +division);
            break;

            case 5: 
            potencia = Math. pow(number1, number2);
            System.out.println(" La potencia de los numeros es: " +potencia);
            break;

            case 6:
            raiz1 = Math.sqrt(number1);
            raiz2 =  Math.sqrt(number2);
            System.out.println(" La raiz del primer numero es: "+raiz1 );
            System.out.println(" La raiz del segundo numero es: "+raiz2);
            break;

            default:
            System.out.println(" La opcion no es valida ");
            break;
        }



        lectura.close();

    }
}
