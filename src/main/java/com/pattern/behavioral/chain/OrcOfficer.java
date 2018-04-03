package com.pattern.behavioral.chain;

/**
 * Created by khan on 4/2/18.
 */
public class OrcOfficer extends RequestHandler {

  public OrcOfficer(RequestHandler handler) {
    super(handler);
  }

  public void handleRequest(Request request) {
    if (request.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }

  @Override
  public String toString() {
    return null;
  }
}
