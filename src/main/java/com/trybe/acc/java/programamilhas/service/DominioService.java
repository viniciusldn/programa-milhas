package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.DominioDao;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DominioService {

  @Inject
  DominioDao dao;

  /**
   * Metodo.
   */
  public List<TipoLancamento> tiposDeLancamentos() {
    return dao.tiposDeLancamentos();
  }

  public List<Parceiro> parceiro() {
    return dao.parceiro();
  }

  public List<Produto> produto() {
    return dao.produto();
  }
}