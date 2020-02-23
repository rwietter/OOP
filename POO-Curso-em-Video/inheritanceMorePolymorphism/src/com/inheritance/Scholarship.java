package com.inheritance;

/**
 * @author Mauricio
 */
public class Scholarship extends Student{
  private int exchange;
  private double payMonthly;

  @Override
  public void payMonthly(double monthly){
    this.setPayMonthly(monthly);
  }

  public int getExchange() {
    return exchange;
  }

  public void setExchange(int exchange) {
    this.exchange = exchange;
  }

  @Override
  public double getPayMonthly() {
    return payMonthly;
  }

  @Override
  public void setPayMonthly(double payMonthly) {
    this.payMonthly = payMonthly;
  }
}
