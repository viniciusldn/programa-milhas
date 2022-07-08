package com.trybe.acc.java.programamilhas.result;

// TODO: Auto-generated Javadoc
/**
 * The Class TokenResult.
 */
public class TokenResult {

  /** The token. */
  private String token;

  /**
   * Construtor para a classe TokenResult.
   *
   * @param token the token
   * @return the token result
   */
  public static TokenResult construir(String token) {
    TokenResult result = new TokenResult();
    result.setToken(token);
    return result;
  }

  /**
   * Gets the token.
   *
   * @return the token
   */
  public String getToken() {
    return token;
  }

  /**
   * Sets the token.
   *
   * @param token the new token
   */
  public void setToken(String token) {
    this.token = token;
  }

}
