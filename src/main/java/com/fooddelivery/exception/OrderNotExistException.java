package com.fooddelivery.exception;

public class OrderNotExistException extends Exception {

  public OrderNotExistException(String message) {
    super(message);
  }
}
