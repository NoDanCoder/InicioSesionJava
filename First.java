import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.And;

public class First {
    public static void main(String[] args) {

        // Creo el objeto scanner
        Scanner dataIn = new Scanner(System.in);
        
        try {

            // Variables reales de usuario
            String user = "pepe";
            String pswd = "hola1234";
            
            // Entradas de usuario
            String userIn = getInfoStr("Ingrese Usuario: ", dataIn);
            String pswdIn = getInfoStr("Ingrese Contrasena: ", dataIn);

            // Comparacion de datos y mensaje final
            if (user.equals(userIn) && pswd.equals(pswdIn)) System.out.println("Inicio de sesion correcto");
            else System.out.println("Nombre de usuario o password incorrectos");

        } 
        
        finally {
            dataIn.close();
        }

    }
    
    // imprime el str, y con el scanner, devuelve la entrada el usuario en tipo String
    public static String getInfoStr(String s, Scanner p){
        System.out.print(s);
        String sb = p.nextLine();
        return sb;
    }

    // imprime el str, y con el scanner, devuelve la entrada el usuario en tipo Int
    public static int getInfoInt(String s, Scanner p){
        System.out.print(s);
        int sb = p.nextInt();
        return sb;
    }
}