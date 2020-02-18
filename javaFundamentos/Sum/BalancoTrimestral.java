public class BalancoTrimestral {
  public static void main(String[] args) {
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosAgosto = 17000;
    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosAgosto;
    double gastosTrimestreMedia = (gastosJaneiro + gastosFevereiro + gastosAgosto) / 3;
    System.out.println("Total de gastos no trimestre: R$ " + gastosTrimestre);
    System.out.println("Media mensal: R$ " + gastosTrimestreMedia);
  }
}
