package org.example.services;

import com.sun.prism.PixelFormat;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RateFileReader {

    Map<String,Double> rateMap = new HashMap<>();

    public Map<String, Double> readJson(String filePath){
        JSONParser parser = new JSONParser();
        try {

            FileReader fileReader = new FileReader(filePath);

            Object obj = parser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) obj;

            JSONObject jsonRatesObject = (JSONObject) jsonObject.get("rates");

            jsonRatesObject.forEach((key,value) -> rateMap.put((String) key,Double.parseDouble(value.toString())));

            return rateMap;

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
