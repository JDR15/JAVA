import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        double nota1, nota2, nota3, asistencia, promedio;

        System.out.println("Ingresa la primera nota");
        nota1 = lectura.nextDouble();
        System.out.println("Ingresa la segunda nota");
        nota2 = lectura.nextDouble();
        System.out.println("Ingresa la tercera nota");
        nota3 = lectura.nextDouble();
        System.out.println("Ingresa el porcentaje de asistencia");
        asistencia = lectura.nextDouble();


        promedio = (nota1+nota2+nota3)/3;

        if(promedio>=3.5 && asistencia>=70){
            //Si condicion se cumple
            System.out.println(" Su promedio de notas es " +promedio+ " su porcentaje de asistencia es " +asistencia+ " por lo tanto aprobaste");
        }else{
            //Condicion no se cumple
            System.out.println(" Su promedio de notas es " +promedio+ " su porcentaje de asistencia es " +asistencia+ " por lo tanto reprobaste");
        }


        lectura.close();
    }
}
