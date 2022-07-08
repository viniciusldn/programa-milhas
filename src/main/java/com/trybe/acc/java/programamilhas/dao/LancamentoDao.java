package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.time.LocalDate;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@ApplicationScoped
public class LancamentoDao {

  @Inject
  EntityManager entityManager;

  /**
   * Metodo.
   */
  @Transactional
  public void deletar(Lancamento lancamento) {
    entityManager
        .remove(entityManager.contains(lancamento) ? lancamento : entityManager.merge(lancamento));
  }

  /**
   * Metodo.
   */
  @Transactional
  public void criar(Pessoa usuario, TipoLancamento tipoLancamento, Parceiro parceiro,
      Produto produto, Integer valor, String descricao, LocalDate data) {
    Lancamento lancamento = new Lancamento();
    lancamento.setUsuario(usuario);
    lancamento.setTipoLancamento(tipoLancamento);
    lancamento.setParceiro(parceiro);
    lancamento.setProduto(produto);
    lancamento.setValor(valor);
    lancamento.setDescricao(descricao);
    lancamento.setData(data);
    entityManager.persist(lancamento);
  }

  /**
   * Metodo.
   */
  public List<Lancamento> lacamentosPorId(int id) {
    String hql = "from Lancamento where idpessoa = :id";
    Query query = entityManager.createQuery(hql);
    query.setParameter("id", id);
    return query.getResultList();
  }

  /**
   * Metodo.
   */
  public List<Lancamento> mostrarSaldos() {
    String hql = "from Lancamento";
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }

}