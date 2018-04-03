package com.pattern.behavioral.chain;

/**
 * Created by khan on 4/2/18.
 */
public class OrcSoldier extends RequestHandler {

  public OrcSoldier(RequestHandler handler) {
    super(handler);
  }

  public void handleRequest(Request request){
    if(request.getRequestType().equals(RequestType.COLLECT_TAX)) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }
  @Override
  public String toString() {
    return "Orc soldire";
  }
}
