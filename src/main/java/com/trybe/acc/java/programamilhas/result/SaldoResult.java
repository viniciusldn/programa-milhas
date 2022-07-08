package com.trybe.acc.java.programamilhas.result;

public class SaldoResult {

  private int saldo;
  private int idUsuario;
  private String login;

  public SaldoResult() {
    super();
  }

  /**
   * Construtor.
   */
  public SaldoResult(int saldo, int idUsuario, String login) {
    super();
    this.saldo = saldo;
    this.idUsuario = idUsuario;
    this.login = login;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

}
