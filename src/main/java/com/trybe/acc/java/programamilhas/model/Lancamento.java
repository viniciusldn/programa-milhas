package com.trybe.acc.java.programamilhas.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class Lancamento.
 */
@Entity
public class Lancamento {

  /**
   * Construtor.
   */
  public Lancamento() {
    super();
  }

  /**
   * Instantiates a new lancamento.
   *
   * @param usuario the usuario
   * @param tipoLancamento the tipo lancamento
   * @param parceiro the parceiro
   * @param produto the produto
   * @param valor the valor
   * @param descricao the descricao
   * @param data the data
   */
  public Lancamento(Pessoa usuario, TipoLancamento tipoLancamento,
      Parceiro parceiro, Produto produto, Integer valor, String descricao,
      LocalDate data) {
    super();
    this.usuario = usuario;
    this.tipoLancamento = tipoLancamento;
    this.parceiro = parceiro;
    this.produto = produto;
    this.valor = valor;
    this.descricao = descricao;
    this.data = data;
  }

  /** The id. */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idLancamento")
  private Integer id;

  /** The usuario. */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idpessoa")
  private Pessoa usuario;

  /** The tipo lancamento. */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idtipolancamento")
  private TipoLancamento tipoLancamento;

  /** The parceiro. */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idparceiro")
  private Parceiro parceiro;

  /** The produto. */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idproduto")
  private Produto produto;

  /** The valor. */
  private Integer valor;

  /** The descricao. */
  private String descricao;

  /** The data. */
  private LocalDate data;

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
   * Gets the usuario.
   *
   * @return the usuario
   */
  public Pessoa getUsuario() {
    return usuario;
  }

  /**
   * Sets the usuario.
   *
   * @param usuario the new usuario
   */
  public void setUsuario(Pessoa usuario) {
    this.usuario = usuario;
  }

  /**
   * Gets the tipo lancamento.
   *
   * @return the tipo lancamento
   */
  public TipoLancamento getTipoLancamento() {
    return tipoLancamento;
  }

  /**
   * Sets the tipo lancamento.
   *
   * @param tipoLancamento the new tipo lancamento
   */
  public void setTipoLancamento(TipoLancamento tipoLancamento) {
    this.tipoLancamento = tipoLancamento;
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
   * Gets the data.
   *
   * @return the data
   */
  public LocalDate getData() {
    return data;
  }

  /**
   * Sets the data.
   *
   * @param data the new data
   */
  public void setData(LocalDate data) {
    this.data = data;
  }

  /**
   * Gets the produto.
   *
   * @return the produto
   */
  public Produto getProduto() {
    return produto;
  }

  /**
   * Sets the produto.
   *
   * @param produto the new produto
   */
  public void setProduto(Produto produto) {
    this.produto = produto;
  }

}
