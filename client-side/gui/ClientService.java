package gui;

import org.example.CurrencyConversion;
import org.example.CurrencyConversionService;

public class ClientService {

    CurrencyConversionService conversionService;
    CurrencyConversion currencyConversion;

    public ClientService(){
        conversionService = new CurrencyConversionService();
        currencyConversion = conversionService.getCurrencyConversionPort();
    }

    public double convert(String sourceCurrency, double sourceCurrencyAmount , String targetCurrency){
        return currencyConversion.convert(sourceCurrency,sourceCurrencyAmount,targetCurrency);
    }
}
