package com.pattern.behavioral.chain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by khan on 4/2/18.
 */
@Data
@RequiredArgsConstructor
public class Request {

  private final RequestType requestType;
  private final String requestDescription;
  private boolean handle;

  public void markHandled() {
    this.handle = true;
  }

}
