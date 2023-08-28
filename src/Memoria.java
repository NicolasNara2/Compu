public class Memoria {
    private Double capacidad;
    private Double marca;

    public Memoria(Double capacidad, Double marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Double getMarca() {
        return marca;
    }

    public void setMarca(Double marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidad=" + capacidad +
                ", marca=" + marca +
                '}';
    }

    public void apagar(){
        System.out.println("Apagando memoria");
    }
    public void iniciar(){
        System.out.println("Iniciando memoria");
    }

}
