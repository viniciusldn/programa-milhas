package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import com.trybe.acc.java.programamilhas.service.DominioService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

// TODO: Auto-generated Javadoc
/**
 * The Class Dominio.
 */
@Path("/dominio")
@ApplicationScoped
public class Dominio {

  /** The service. */
  @Inject
  DominioService service;

  /**
   * Tipos de lancamentos.
   *
   * @return the list
   */
  @GET
  @Path("/tipolancamento")
  public List<TipoLancamento> tiposDeLancamentos() {
    return service.tiposDeLancamentos();
  }

  /**
   * Parceiro.
   *
   * @return the list
   */
  @GET
  @Path("/parceiro")
  public List<Parceiro> parceiro() {
    return service.parceiro();
  }

  /**
   * Produto.
   *
   * @return the list
   */
  @GET
  @Path("/produto")
  public List<Produto> produto() {
    return service.produto();
  }
}
