public class Disco {
    private String marca;
    private Double capacidad;
    private Double velocidad;

    public Disco(String marca, Double capacidad, Double velocidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                ", velocidad=" + velocidad +
                '}';
    }

    public void apagar() {
        System.out.println("Apagando disco");
    }

    public void iniciar(){
        System.out.println("Iniciando disco");
    }
}
