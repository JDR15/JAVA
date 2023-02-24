import java.util.Scanner;

public class Budget2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int spent, budget, op, contador ;

        op = 1;
        budget = 100000;
        contador = 0; 

        while(op==1 && contador<=3){
            System.out.println(" Ingrese el gasto ");
            spent = lectura.nextInt();
            budget = budget-spent;
            contador = contador+1;
    
            System.out.println(" El gasto fue de " +spent+ " y su presupuesto es de "+budget);

            System.out.println(" Desea registrar otro gasto 1.Si 2.No");
            op = lectura.nextInt();
        }



        lectura.close();
    }
}
