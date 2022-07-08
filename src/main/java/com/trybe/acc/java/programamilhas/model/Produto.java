package com.trybe.acc.java.programamilhas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class Produto.
 */
@Entity
public class Produto {

  /** The id. */
  @Id
  @Column(name = "idProduto")
  private Integer id;

  /** The parceiro. */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idparceiro")
  private Parceiro parceiro;

  /** The valor. */
  private Integer valor;

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

  /**
   * Gets the parceiro.
   *
   * @return the parceiro
   */
  public Parceiro getParceiro() {
    return parceiro;
  }

  /**
   * Sets the parceiro.
   *
   * @param parceiro the new parceiro
   */
  public void setParceiro(Parceiro parceiro) {
    this.parceiro = parceiro;
  }

  /**
   * Gets the valor.
   *
   * @return the valor
   */
  public Integer getValor() {
    return valor;
  }

  /**
   * Sets the valor.
   *
   * @param valor the new valor
   */
  public void setValor(Integer valor) {
    this.valor = valor;
  }

}
