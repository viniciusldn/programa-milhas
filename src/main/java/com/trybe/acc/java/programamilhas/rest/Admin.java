package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.service.AdminService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

// TODO: Auto-generated Javadoc
/**
 * The Class Admin.
 */
@Path("/admin")
@ApplicationScoped
public class Admin {

  /** The service. */
  @Inject
  AdminService service;

  /**
   * Mostrar saldos.
   *
   * @param token the token
   * @return the list
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  @POST
  @Path("/saldos")
  @Produces(MediaType.APPLICATION_JSON)
  public List<SaldoResult> mostrarSaldos(@QueryParam("token") String token)
      throws AcessoNaoAutorizadoException {
    return service.mostrarSaldos(token);
  }

}
