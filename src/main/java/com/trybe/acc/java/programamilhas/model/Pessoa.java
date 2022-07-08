package com.trybe.acc.java.programamilhas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Pessoa.
 */
@Entity
public class Pessoa {

  /** The id. */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idPessoa")
  private Integer id;

  /** The login. */
  private String login;

  /** The hash. */
  private String hash;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param idUsuario the new id
   */
  public void setId(Integer idUsuario) {
    this.id = idUsuario;
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
   * Gets the hash.
   *
   * @return the hash
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the hash.
   *
   * @param hash the new hash
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

}
