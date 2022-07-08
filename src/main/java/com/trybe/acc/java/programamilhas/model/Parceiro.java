package com.trybe.acc.java.programamilhas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Parceiro.
 */
@Entity
public class Parceiro {

  /** The id. */
  @Id
  @Column(name = "idParceiro")
  private Integer id;

  /** The descricao. */
  private String descricao;

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
   * @param id the new id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Gets the descricao.
   *
   * @return the descricao
   */
  public String getDescricao() {
    return descricao;
  }

  /**
   * Sets the descricao.
   *
   * @param descricao the new descricao
   */
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

}
