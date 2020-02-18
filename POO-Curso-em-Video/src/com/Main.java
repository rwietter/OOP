package com;
import com.ContaBanco;

/**
 * @author Mauricio
 */
public class Main {
  public static void main(String[] args) {

    int numero = 12456;
    String tipo = "CC";
    String dono = "Filipe";
    double deposito = 300;

    ContaBanco c1 = new ContaBanco();

    c1.setNumeroConta(numero);
    c1.setDonoConta(dono);
    c1.abrirConta(tipo);
    c1.depositar(deposito);
    c1.getActualStateAccount();

    int number = 434663;
    String type = "CP";
    String manager = "Carla";
    double depo = 600;

    ContaBanco c2 = new ContaBanco();
    c2.setNumeroConta(number);
    c2.setDonoConta(manager);
    c2.abrirConta(type);
    c2.depositar(depo);
    c2.getActualStateAccount();
    c2.sacar(100);
    c2.depositar(200);
    c2.getActualStateAccount();
  }
}
