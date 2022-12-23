package org.example;

import org.example.services.ConversionService;
import org.example.services.RateFileReader;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.math.BigDecimal;
import java.util.Map;

@WebService
public class CurrencyConversion {

    private final Map<String, Double> rates;
    RateFileReader fileReader;
    ConversionService conversionService;

    public CurrencyConversion() {
        fileReader = new RateFileReader();
        String filePath = "./rates.json";
        this.rates = fileReader.readJson(filePath);
        conversionService = new ConversionService();
    }


    @WebMethod
    public double convert(String sourceCurrency, double amountSourceCurrency, String targetCurrency){
        double dollarAmount = conversionService.convertToDollar(amountSourceCurrency, rates.get(sourceCurrency));
        return conversionService.dollarToTargetCurrency(dollarAmount, rates.get(targetCurrency));
    }

}
