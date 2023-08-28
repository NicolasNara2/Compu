public class Computadora {
    private String marca;
    private String modelo;
    private Integer anioDFabricacion;
    private String tipo;
    private Disco discoRigido;
    private Procesador procesador;
    private Memoria memoria;

    public Computadora(String marca, String modelo, Integer anioDFabricacion, String tipo, Disco discoRigido, Procesador procesador, Memoria memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioDFabricacion = anioDFabricacion;
        this.tipo = tipo;
        this.discoRigido = discoRigido;
        this.procesador = procesador;
        this.memoria = memoria;
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

    public Integer getAnioDFabricacion() {
        return anioDFabricacion;
    }

    public void setAnioDFabricacion(Integer anioDFabricacion) {
        this.anioDFabricacion = anioDFabricacion;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Disco getDiscoRigido() {
        return discoRigido;
    }

    public void setDiscoRigido(Disco discoRigido) {
        this.discoRigido = discoRigido;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioDFabricacion=" + anioDFabricacion +
                ", Tipo='" + tipo + '\'' +
                ", discoRigido=" + discoRigido +
                ", procesador=" + procesador +
                ", memoria=" + memoria +
                '}';
    }

    public void apagar(){
        System.out.println("Apagar");
        discoRigido.apagar();
        memoria.apagar();
        procesador.apagar();
    };

    public void iniciar(){
        System.out.println("Iniciar");
        discoRigido.iniciar();
        memoria.iniciar();
        procesador.iniciar();
    }
}
