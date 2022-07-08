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

@Path("/dominio")
@ApplicationScoped
public class Dominio {

  @Inject
  DominioService service;

  @GET
  @Path("/tipolancamento")
  public List<TipoLancamento> tiposDeLancamentos() {
    return service.tiposDeLancamentos();
  }

  @GET
  @Path("/parceiro")
  public List<Parceiro> parceiro() {
    return service.parceiro();
  }

  @GET
  @Path("/produto")
  public List<Produto> produto() {
    return service.produto();
  }
}
