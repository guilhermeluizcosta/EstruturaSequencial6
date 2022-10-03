import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o raio do circulo:");
        double raio = entrada.nextDouble();
        double pi = 3.14;
        double area = (raio * raio) * pi;
        System.out.println("A area do circulo eh igual a: " + area);
    }
}
