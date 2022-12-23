package org.example.services;

public class ConversionService {

    public double convertToDollar(double amountInSourceCurrency, double sourceCurrencyDollarRate){
        return amountInSourceCurrency/sourceCurrencyDollarRate;
        //return 0;
    }

    public double  dollarToTargetCurrency(double amountInDollar, double targetCurrencyDollarRate){
        return amountInDollar*targetCurrencyDollarRate;
        //return 0;
    }
}
