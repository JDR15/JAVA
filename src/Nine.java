import java.util.Scanner;

public class Nine {
public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    int  number = (int) Math.random()*2+1;
    double bet, wager, op, acumulador, money, wager2;
    

    System.out.println("Ingrese su apuesta global ");
    bet = lectura.nextInt();

    op = 0;
    acumulador = 0;

    do {
        System.out.println("Ingrese el monto que quiere apostar: " );
        wager = lectura.nextInt();
        acumulador = acumulador+bet;
        money = acumulador;  

        String elec;
        System.out.println(" ¿Que vas a eligir Cara o Sello ?");
        elec = lectura.next();
        
        if( elec.equals("cara") && number==1){
            wager2 = wager*2;
            money = wager2+bet;
            System.out.println(" Usted escogio cara y gano "+wager2+ " y su apuesta global es de " +money);
        }
        else if( elec.equals("sello") && number==2){
            wager2 = wager*2;
            money= money+wager2;
            System.out.println(" Usted escogio sello y gano "+wager2+ " y su apuesta global es de " +money);
           
        }
        else if( elec.equals("cara") && number==2){
            money = wager-bet;
            System.out.println(" Usted escogio cara y perdio " +money);
        }
        else if( elec.equals("sello") && number==1){
            money = wager-bet;
            System.out.println(" Usted escogio sello y perdio "+money);
        }

       
        System.out.println(" Desea apostar de nuevo 1.Si 2.No");
        op = lectura.nextInt();

    
    }while(op==1);

    lectura.close();
}

}
