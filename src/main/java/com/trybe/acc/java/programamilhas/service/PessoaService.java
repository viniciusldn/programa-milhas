package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.LancamentoDao;
import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.dto.LoginDto;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import com.trybe.acc.java.programamilhas.util.HashUtil;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.time.LocalDate;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.NoResultException;

// TODO: Auto-generated Javadoc
/**
 * The Class PessoaService.
 */
@ApplicationScoped
public class PessoaService {

  /** The pessoa dao. */
  @Inject
  PessoaDao pessoaDao;

  /** The hash util. */
  @Inject
  HashUtil hashUtil;

  /** The token util. */
  @Inject
  TokenUtil tokenUtil;

  /** The lancamento dao. */
  @Inject
  LancamentoDao lancamentoDao;

  /**
   * Metodo.
   *
   * @param loginDto the login dto
   * @return true, if successful
   * @throws InvalidKeySpecException the invalid key spec exception
   * @throws NoSuchAlgorithmException the no such algorithm exception
   */
  public boolean criar(LoginDto loginDto)
      throws InvalidKeySpecException, NoSuchAlgorithmException {
    try {
      pessoaDao.autenticar(loginDto.getLogin(), loginDto.getSenha());
      return true;
    } catch (NoResultException e) {
      Pessoa usuario = pessoaDao.criar(loginDto.getLogin(),
          hashUtil.hash(loginDto.getSenha()));
      TipoLancamento tipoLancamento = new TipoLancamento();
      tipoLancamento.setId(1);
      Parceiro parceiro = null;
      Produto produto = null;
      Integer valor = 10;
      LocalDate data = LocalDate.now();
      String descricao = "Bonus adquirido com sucesso!";
      lancamentoDao.criar(usuario, tipoLancamento, parceiro, produto, valor,
          descricao, data);
      return false;
    }
  }

  /**
   * Metodo.
   *
   * @param token the token
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  public void deletar(String token) throws AcessoNaoAutorizadoException {
    int id = tokenUtil.obterIdUsuario(token);
    List<Lancamento> lancamentos = lancamentoDao.lacamentosPorId(id);
    for (Lancamento lancamento : lancamentos) {
      lancamentoDao.deletar(lancamento);
    }

    pessoaDao.deletar(id);

  }

}
