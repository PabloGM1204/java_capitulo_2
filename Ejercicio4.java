import java.util.Scanner;
public class Ejercicio4{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        // Pido que me diga una cantidad y que con la libreria de scanner puede leer por teclado
        System.out.println("Digame una cantidad de euros para pasar a peseta: ");
        double euros = sc.nextDouble();
        double pesetas = 166.386;
        System.out.println(euros+" su valor en pesetas es = "+(euros*pesetas));
        sc.close();
    }
}