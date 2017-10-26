/*
 * HelloWorld8Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.models.*;
import com.example.exceptions.*;
import com.example.APIHelper;
import com.example.Configuration;
import com.example.testing.TestHelper;
import com.example.controllers.HelloworldController;

import com.fasterxml.jackson.core.type.TypeReference;

public class HelloworldControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static HelloworldController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getHelloworld();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Testcase for testing endpoint Helloworld
     * @throws Throwable
     */
    @Test
    public void testHelloworld1() throws Throwable {

        // Set callback and perform API call
        HelloWorldResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getHelloworld();
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "{  \"message\": \"Hello world\"}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}
