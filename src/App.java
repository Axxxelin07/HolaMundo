import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("¿Como te llamas?");
        String mensaje = sc.nextLine();

        System.out.println("¡Hola, " + mensaje + "!Espero que estes bien ");
        System.out.println("¡Hola, " + mensaje + "¡ Que tengas un bune día :)  ");
        sc.close();
    }
}
