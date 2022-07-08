package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.DominioDao;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * The Class DominioService.
 */
@ApplicationScoped
public class DominioService {

  /** The dao. */
  @Inject
  DominioDao dao;

  /**
   * Metodo.
   *
   * @return the list
   */
  public List<TipoLancamento> tiposDeLancamentos() {
    return dao.tiposDeLancamentos();
  }

  /**
   * Parceiro.
   *
   * @return the list
   */
  public List<Parceiro> parceiro() {
    return dao.parceiro();
  }

  /**
   * Produto.
   *
   * @return the list
   */
  public List<Produto> produto() {
    return dao.produto();
  }
}