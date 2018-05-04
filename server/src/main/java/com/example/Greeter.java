package com.example;

/**
 * This is a class to add a Greeter string.
 *
 * @author someone@where.com
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /** 
   *
   * This method saves time to add a greeting
   * @return greeting string
   *
   */  
  public final String greet() {
    return greet();
  }

  /** 
   *
   * This method saves time to add a greeting
   * @param someone the name of a person
   * @return greeting string
   *
   */  
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
