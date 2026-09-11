public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[]asientos;

    public Vuelo(){

    }

    public Vuelo(String numero , String origen , String destino){
        this.numero = numero;
        this.origen = origen;
        this.destino =  destino;
    }
    
    public Vuelo (String numero, String origen, String destino, int capacidadMaxima){
        this.numero = numero;
        this.origen = origen;
        this.destino =  destino;
        this.capacidadMaxima = capacidadMaxima;
        
        asientos = new Asiento[capacidadMaxima];
        for(int i = 0; i < capacidadMaxima; i++){
            asientos[i] = new Asiento("A"+(i+1));
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    
}
