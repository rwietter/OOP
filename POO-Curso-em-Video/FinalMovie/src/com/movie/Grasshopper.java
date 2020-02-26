package com.movie;

/**
 * @author Mauricio
 */
public class Grasshopper extends Person {
  private String login;
  private long totViewsLive;

  public Grasshopper(String name, int age, String sex, String login) {
    super(name, age, sex);
    this.setLogin(login);
    this.setTotViewsLive(0);
  }

  public void sawOneMore(){

  }

  public String isLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public long getTotViewsLive() {
    return totViewsLive;
  }

  public void setTotViewsLive(long totViewsLive) {
    this.totViewsLive = totViewsLive;
  }

  @Override
  public String toString() {
    return "" +
        super.toString() +
          "\n Grasshopper: {" +
          "\n   login='" + this.isLogin() +
          '\'' + ",\n   totViewsLive: " + this.getTotViewsLive() +
          "\n   }" +
        "\n}";
  }
}
