package com.pattern.behavioral.chain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by khan on 4/2/18.
 */
@Slf4j
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class RequestHandler {
  private RequestHandler next;

  public void handleRequest(Request request) {
    if(request != null){
      next.handleRequest(request);
    }
  }

  protected void printHandling(Request request) {
    log.info("{} handling request \"{}\"", this, request);
  }

  @Override
  public abstract String toString();
}
