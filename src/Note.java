import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        double nota,promedio, resultados;
       
        resultados = 0;
        for(int x=1; x<=4; x++){
            System.out.println(" Digite sus notas ");
            nota = lectura.nextDouble();
             
            promedio = nota/4;
            resultados = resultados +promedio;
        }
 
        if(resultados<=2.9){
            System.out.println(" Reprobaste la asignatura ");
        }
        else if(resultados<=4.0){
            System.out.println(" Pasaste raspando la asignatura ");
        }
        else if(resultados>=4.0){
            System.out.println(" Aprobaste con buenos resultados ");
        }
       
        lectura.close();
        
    }
}
