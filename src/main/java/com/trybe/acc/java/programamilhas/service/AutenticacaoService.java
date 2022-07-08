package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.exception.AutenticacaoInvalidaException;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.util.HashUtil;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * The Class AutenticacaoService.
 */
@ApplicationScoped
public class AutenticacaoService {

  /** The dao. */
  @Inject
  PessoaDao dao;

  /** The token util. */
  @Inject
  TokenUtil tokenUtil;

  /** The hash util. */
  @Inject
  HashUtil hashUtil;

  /**
   * Autentica a pessoa usuária.
   *
   * @param login the login
   * @param pwd the pwd
   * @return the string
   * @throws AutenticacaoInvalidaException the autenticacao invalida exception
   * @throws InvalidKeySpecException the invalid key spec exception
   * @throws NoSuchAlgorithmException the no such algorithm exception
   */
  public String autenticar(String login, String pwd)
      throws AutenticacaoInvalidaException, InvalidKeySpecException, NoSuchAlgorithmException {
    Pessoa usuario = dao.autenticar(login, hashUtil.hash(pwd));
    if (usuario != null) {
      return tokenUtil.criarToken(usuario.getId());
    }
    throw new AutenticacaoInvalidaException();
  }

}
