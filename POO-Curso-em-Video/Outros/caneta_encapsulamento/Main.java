package object_oriented_programming.caneta_encapsulamento;

public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta(true);

        System.out.println(caneta.getTampa());

        // Aula 3
        // Setters
        String model = "BIC cristal";
        String color = "red";
        float ponta = 0.5f;
        int carga = 5;
        boolean tampa = false;
        caneta.setModelo(model);
        caneta.setCor(color);
        caneta.setPonta(ponta);
        caneta.setCarga(carga);
        caneta.setTampar(tampa);

        // Getters
        System.out.println(caneta.getModelo());
        System.out.println(caneta.getCor());
        System.out.println(caneta.getPonta());
        System.out.println(caneta.getCarga());
        System.out.println(caneta.getTampa());
        caneta.setRabiscar();
    }
}
