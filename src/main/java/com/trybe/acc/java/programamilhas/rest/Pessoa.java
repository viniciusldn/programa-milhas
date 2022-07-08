package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.dto.LoginDto;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.service.PessoaService;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// TODO: Auto-generated Javadoc
/**
 * The Class Pessoa.
 */
@Path("/pessoa")
@ApplicationScoped
public class Pessoa {

  /** The service. */
  @Inject
  PessoaService service;

  /**
   * Metodo.
   *
   * @param loginDto the login dto
   * @return the response
   * @throws InvalidKeySpecException the invalid key spec exception
   * @throws NoSuchAlgorithmException the no such algorithm exception
   */
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response criar(LoginDto loginDto)
      throws InvalidKeySpecException, NoSuchAlgorithmException {
    if (service.criar(loginDto)) {
      return Response.status(409).build();
    }
    return Response.ok().build();
  }

  /**
   * Deletar.
   *
   * @param token the token
   * @return the response
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  @DELETE
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response deletar(@QueryParam("token") String token)
      throws AcessoNaoAutorizadoException {
    service.deletar(token);
    return Response.ok().build();
  }
}
