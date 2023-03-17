import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op, cont1, cont2, acum1, acum2, val1, val2, elec;

        op=1;
        cont1=0;
        cont2=0;
        acum1=0;
        acum2=0;
        val1=0;
        val2=0;

        while(op==1){
            System.out.println("Elija si es 1.Extranjero 2.Nacional");
            elec=sc.nextInt();

            if(elec==1){
                cont1=cont1+1;
                val1=60000;
                acum1=acum1+val1;
            }
            else{
                cont2=cont2+1;
                val2=32000;
                acum2=acum2+val2;
            }

            System.out.println("Desea registar otro dato 1.SI 2.NO");
            op=sc.nextInt();

        }

        System.out.println("Su eleccion fue extranjero " +cont1+ " y su total es "+acum1+" su eleccion fue nacional "+cont2+" su total es "+acum2);

        sc.close();
    }
}
