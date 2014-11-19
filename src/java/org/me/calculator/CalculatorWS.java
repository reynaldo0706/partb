/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author rreyes
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {

    /**
     * This is a sample web service operation
     */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        int k = i+j;
        
        return k;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConvertDollars")
    public double ConvertDollars(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        double p = 1.25;          
        return r/p;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConvertEuro")
    public double ConvertEuro(@WebParam(name = "d") double d) {
        //TODO write your implementation code here:
        double a = 1.25;
        return d*a;
    }
    

 
}
