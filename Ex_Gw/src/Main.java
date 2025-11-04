import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String perfil = " ";

        System.out.print("Digite seu nome: ");
        perfil = sc.nextLine();

        System.out.printf("Olá, %s",perfil);

    }
}