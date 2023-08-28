public class Procesador {
    private String marca;
    private String modelo;
    private Double velocidad;

    public Procesador(String marca, String modelo, Double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", velocidad=" + velocidad +
                '}';
    }

    public void apagar() {
        System.out.println("Aapagar procesador");
    }
    public void iniciar(){
        System.out.println("Iniciando procesador");
    }
}
