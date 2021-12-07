package proyectoz;
import java.util.Scanner;

public class ProyectoZ {

    public static void main(String[] args) {
        System.out.println("Bienvendo a la calculadora de velocidades");
        
        CalculadoraVelocidad Obj = new CalculadoraVelocidad();
        Scanner Entrada = new Scanner(System.in);
        float dato;
        
        System.out.println("Digite la distancia recorrida: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setDistancia(dato);
        
        System.out.println("Digite el tiempo tomado: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setTiempo(dato);
        
        System.out.println("La velocidad del carrito es: " + Obj.calcVel()+ "m/s");
    }
    
}
