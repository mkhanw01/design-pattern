package com.pattern.behavioral.chain;

/**
 * Created by khan on 4/2/18.
 */
public class OrcCommander extends RequestHandler {

  public OrcCommander(RequestHandler requestHandler) {
    super(requestHandler);
  }

  public void handleRequest(Request request) {
    if(request.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }

  @Override
  public String toString() {
    return "Orc commander";
  }
}
