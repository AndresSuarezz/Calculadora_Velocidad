package proyectoz;

public class CalculadoraVelocidad {
    private float distancia;
    private float tiempo;

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    // Resolver el problema
     public float calcVel(){
        return (float)(distancia/tiempo);
    }
     
}
