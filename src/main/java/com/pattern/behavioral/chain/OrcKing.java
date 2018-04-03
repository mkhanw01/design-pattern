package com.pattern.behavioral.chain;

/**
 * Created by khan on 4/2/18.
 */
public class OrcKing {

  RequestHandler chain;

  public OrcKing() {
    buildChain();
  }

  private void buildChain() {
    /*
    this is the chain design pattern to build chain of request/response objects
     */
    chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
  }

  public void makeRequest(Request request) {
    chain.handleRequest(request);
  }
}
