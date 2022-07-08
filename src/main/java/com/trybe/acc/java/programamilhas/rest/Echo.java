package com.trybe.acc.java.programamilhas.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// TODO: Auto-generated Javadoc
/**
 * The Class Echo.
 */
@Path("/echo")
@ApplicationScoped
public class Echo {

  /**
   * Echo.
   *
   * @return the string
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String echo() {
    return "Olá!";
  }
}
