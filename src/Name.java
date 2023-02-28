import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String name, lastn, namec;
         
        System.out.println(" Ingrese su nombre ");
        name = lectura.nextLine();

        System.out.println(" Ingrese su apellido ");
        lastn = lectura.nextLine();

        namec = name+lastn;

        //CARACTERES
        System.out.println(" Longitud del nombre es: " +name.length());
        System.out.println(" La longitud del apellido es: " +lastn.length());
        //MAYUSCULA MINUSCULA
        System.out.println(" Nombre en mayuscula " +name.toUpperCase());
        System.out.println(" Nombre en minuscula " +lastn.toLowerCase());
        //NOMBRE COMPLETO
        System.out.println(" Nombre Completo " +namec);
        //Extraccion 
        String subName = name.substring(0, 2);
        System.out.println(" Dos primeras letras combinado con apellido " +subName+lastn);

        lectura.close();
    }
}
