package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Pessoa;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

// TODO: Auto-generated Javadoc
/**
 * The Class PessoaDao.
 */
@ApplicationScoped
public class PessoaDao {

  /** The entity manager. */
  @Inject
  EntityManager entityManager;

  /**
   * Método responsável pela realização do login.
   * <p>
   * Não delete este método!
   * </p>
   *
   * @param login the login
   * @param hash  the hash
   * @return the pessoa
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
   *
   * @param login the login
   * @param hash  the hash
   * @return the pessoa
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
   *
   * @param id the id
   * @return the pessoa
   */
  public Pessoa pessoaPorId(int id) {
    String hql = "from Pessoa where id = :id";
    Query query = entityManager.createQuery(hql);
    query.setParameter("id", id);
    return (Pessoa) query.getSingleResult();
  }

  /**
   * Metodo.
   *
   * @param id the id
   */
  @Transactional
  public void deletar(int id) {
    Pessoa pessoa = pessoaPorId(id);
    entityManager.remove(
        entityManager.contains(pessoa) ? pessoa : entityManager.merge(pessoa));
  }

}
