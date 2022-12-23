package org.example;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1234/currencyconversion", new CurrencyConversion());
    }
}
