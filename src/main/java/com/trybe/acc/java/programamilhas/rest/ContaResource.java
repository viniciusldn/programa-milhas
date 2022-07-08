package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.service.ContaService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

// TODO: Auto-generated Javadoc
/**
 * The Class ContaResource.
 */
@Path("/conta")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContaResource {

  /** The service. */
  @Inject
  ContaService service;

  /**
   * Mostrar saldo.
   *
   * @param token the token
   * @return the saldo result
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  @GET
  @Path("/saldo")
  public SaldoResult mostrarSaldo(@QueryParam("token") String token)
      throws AcessoNaoAutorizadoException {
    return service.mostrarSaldo(token);
  }

  /**
   * Mostrar extrato.
   *
   * @param token the token
   * @return the list
   * @throws AcessoNaoAutorizadoException the acesso nao autorizado exception
   */
  @GET
  @Path("/extrato")
  public List<Lancamento> mostrarExtrato(@QueryParam("token") String token)
      throws AcessoNaoAutorizadoException {
    return service.mostrarExtrato(token);
  }

}
