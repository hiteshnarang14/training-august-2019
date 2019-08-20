package com.amdocs;
import org.tempuri.CalculatorSoap;

import org.tempuri.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.setProperty("java.net.useSystemProxies", "true");
       Calculator calc = new Calculator();
       CalculatorSoap service = calc.getCalculatorSoap();
       
       int x = 100;
       int y = 200;
       //Integer a = new Integer(x);
       //Integer b = new Integer(y);
       int result = service.add(x, y);
       
       System.out.println("result is: "+result);
    }
}
