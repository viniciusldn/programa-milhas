package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.LancamentoDao;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * The Class AdminService.
 */
@ApplicationScoped
public class AdminService {

  /** The dao. */
  @Inject
  LancamentoDao dao;

  /**
   * Metodo.
   *
   * @param token the token
   * @return the list
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  public List<SaldoResult> mostrarSaldos(String token)
      throws AcessoNaoAutorizadoException {
    if (!token.equals("4dmt0k3n!")) {
      throw new AcessoNaoAutorizadoException();
    }
    List<Lancamento> lancamentos = dao.mostrarSaldos();
    List<SaldoResult> saldos = new ArrayList<>();
    for (Lancamento lancamento : lancamentos) {
      SaldoResult saldo = new SaldoResult(lancamento.getValor(),
          lancamento.getUsuario().getId(), lancamento.getUsuario().getLogin());
      saldos.add(saldo);
    }
    return saldos;
  }

}
