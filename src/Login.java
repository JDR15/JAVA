import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner lectura = new  Scanner(System.in);

        String user, password;
        System.out.println("Ingrese el usuario");
        user = lectura.nextLine();

        System.out.println("Ingrese la contraseña");
        password = lectura.nextLine();

        if(user.equals("Johan") && password.equals("johan1234")){
            
            System.out.println("Bienvenido al sistema");

        }
        else if( user.equals("Johan")){
            System.out.println("Parece que olvidaste tus credenciales");
        }
        else if( password.equals("johan1234")){
            System.out.println("Algo pasa con tus datos de acceso");
        }
        else{
            System.out.println( "Acceso denegado");
        }

        lectura.close();
        
    }
}
