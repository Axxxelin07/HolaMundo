import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe un texto");
        String mensaje = sc.nextLine();

        System.out.println("Has escrito: "+mensaje);
        sc.close();
    }
}
