
package org.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CurrencyConversion", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencyConversion {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "http://example.org/", className = "org.example.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "http://example.org/", className = "org.example.ConvertResponse")
    @Action(input = "http://example.org/CurrencyConversion/convertRequest", output = "http://example.org/CurrencyConversion/convertResponse")
    public double convert(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}
