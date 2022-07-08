package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * The Class ContaService.
 */
@ApplicationScoped
public class ContaService {

  /** The token util. */
  @Inject
  TokenUtil tokenUtil;

  /**
   * Mostrar saldo.
   *
   * @param token the token
   * @return the saldo result
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  public SaldoResult mostrarSaldo(String token)
      throws AcessoNaoAutorizadoException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Mostrar extrato.
   *
   * @param token the token
   * @return the list
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  public List<Lancamento> mostrarExtrato(String token)
      throws AcessoNaoAutorizadoException {
    // TODO Auto-generated method stub
    return null;
  }

}
