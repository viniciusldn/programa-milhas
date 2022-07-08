package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@ApplicationScoped
public class DominioDao {

  @Inject
  EntityManager entityManager;

  /**
   * Metodo.
   */
  public List<TipoLancamento> tiposDeLancamentos() {
    String hql = "FROM TipoLancamento";
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }

  /**
   * Metodo.
   */
  public List<Parceiro> parceiro() {
    String hql = "FROM Parceiro";
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }

  /**
   * Metodo.
   */
  public List<Produto> produto() {
    String hql = "FROM Produto";
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }

}
