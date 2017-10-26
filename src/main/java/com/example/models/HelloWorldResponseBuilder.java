/*
 * HelloWorld7Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class HelloWorldResponseBuilder {
    //the instance to build
    private HelloWorldResponse helloWorldResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HelloWorldResponseBuilder() {
        helloWorldResponse = new HelloWorldResponse();
    }

    public HelloWorldResponseBuilder message(String message) {
        helloWorldResponse.setMessage(message);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HelloWorldResponse build() {
        return helloWorldResponse;
    }
}