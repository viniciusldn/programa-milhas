package com.trybe.acc.java.programamilhas.result;

// TODO: Auto-generated Javadoc
/**
 * The Class SaldoResult.
 */
public class SaldoResult {

  /** The saldo. */
  private int saldo;
  
  /** The id usuario. */
  private int idUsuario;
  
  /** The login. */
  private String login;

  /**
   * Instantiates a new saldo result.
   */
  public SaldoResult() {
    super();
  }

  /**
   * Construtor.
   *
   * @param saldo the saldo
   * @param idUsuario the id usuario
   * @param login the login
   */
  public SaldoResult(int saldo, int idUsuario, String login) {
    super();
    this.saldo = saldo;
    this.idUsuario = idUsuario;
    this.login = login;
  }

  /**
   * Gets the id usuario.
   *
   * @return the id usuario
   */
  public int getIdUsuario() {
    return idUsuario;
  }

  /**
   * Sets the id usuario.
   *
   * @param idUsuario the new id usuario
   */
  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  /**
   * Gets the login.
   *
   * @return the login
   */
  public String getLogin() {
    return login;
  }

  /**
   * Sets the login.
   *
   * @param login the new login
   */
  public void setLogin(String login) {
    this.login = login;
  }

  /**
   * Gets the saldo.
   *
   * @return the saldo
   */
  public int getSaldo() {
    return saldo;
  }

  /**
   * Sets the saldo.
   *
   * @param saldo the new saldo
   */
  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

}
