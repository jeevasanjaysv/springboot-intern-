package com.eduhub.eduhub_backed.exceptions;

public class ResourseNotFoundException extends RuntimeException {
  public ResourseNotFoundException(String message) {
    super(message);
  }
}
