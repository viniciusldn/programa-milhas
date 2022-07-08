package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Pessoa;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@ApplicationScoped
public class PessoaDao {
  @Inject
  EntityManager entityManager;

  /**
   * Método responsável pela realização do login.
   * <p>
   * Não delete este método!
   * </p>
   */
  public Pessoa autenticar(String login, String hash) {
    String hql = "from " + Pessoa.class.getSimpleName()
        + " where login = :login and hash = :hash";
    Query query = entityManager.createQuery(hql);
    query.setParameter("login", login);
    query.setParameter("hash", hash);
    return (Pessoa) query.getSingleResult();
  }

  /**
   * Metodo.
   */
  @Transactional
  public Pessoa criar(String login, String hash) {
    Pessoa pessoa = new Pessoa();
    pessoa.setLogin(login);
    pessoa.setHash(hash);

    entityManager.persist(pessoa);
    return pessoa;
  }

  /**
   * Metodo.
   */
  public Pessoa pessoaPorId(int id) {
    String hql = "from Pessoa where id = :id";
    Query query = entityManager.createQuery(hql);
    query.setParameter("id", id);
    return (Pessoa) query.getSingleResult();
  }

  /**
   * Metodo.
   */
  @Transactional
  public void deletar(int id) {
    Pessoa pessoa = pessoaPorId(id);
    entityManager.remove(
        entityManager.contains(pessoa) ? pessoa : entityManager.merge(pessoa));
  }

}
