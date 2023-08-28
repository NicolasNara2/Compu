// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Disco disco1= new Disco("Intel", 20.0, 25.0);
        Procesador procesador1= new Procesador("Intel", "zz1", 222.0);
        Memoria memoria1= new Memoria(500.0, 55.0);

        Computadora laptop1= new Computadora("Intel", "zz", 2022, "laptop", disco1, procesador1, memoria1);

        System.out.printf(laptop1.toString());

        laptop1.apagar();
        laptop1.iniciar();
    }
}