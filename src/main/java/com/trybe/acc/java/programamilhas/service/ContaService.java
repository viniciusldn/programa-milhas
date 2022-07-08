package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ContaService {

  @Inject
  TokenUtil tokenUtil;

  public SaldoResult mostrarSaldo(String token)
      throws AcessoNaoAutorizadoException {
    // TODO Auto-generated method stub
    return null;
  }

  public List<Lancamento> mostrarExtrato(String token)
      throws AcessoNaoAutorizadoException {
    // TODO Auto-generated method stub
    return null;
  }

}
