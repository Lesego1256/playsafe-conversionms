package com.conversion.playsafe.playsafeconversionms.service;


import com.conversion.playsafe.playsafeconversionms.model.Conversion;
import org.springframework.stereotype.Service;

@Service
public class ConversionServicee {
    static final double KM_VALUE = 1.60934;
    static final double POUNDS_VALUE = 0.454;
    static final double KELVIN_VALUE = 273.15;

    public Conversion convertValue(Conversion conversion)
    {
        if(conversion.getConversionType().equalsIgnoreCase("milesToKilos"))
        {
            conversion = milesToKilos(conversion);
        }
        else if(conversion.getConversionType().equalsIgnoreCase("poundsToKgs"))
        {
            conversion = poundToKg(conversion);
        }
        else if(conversion.getConversionType().equalsIgnoreCase("kelvinToCelsius"))
        {
            conversion = kelvinToCelsius(conversion);
        }

        return conversion;

    }



    public Conversion milesToKilos(Conversion conversion)
    {
        double value = (double)Math.round(KM_VALUE * conversion.getValue()*100)/100;
        conversion.setRoundedConvertedValue(value);
        value =KM_VALUE * conversion.getValue();
        conversion.setConvertedValue(value);
        return conversion;
    }

    public Conversion poundToKg(Conversion conversion)
    {
        double value = (double)Math.round(POUNDS_VALUE* conversion.getValue()*100)/100;
        conversion.setRoundedConvertedValue(value);
        value = POUNDS_VALUE* conversion.getValue();
        conversion.setConvertedValue(value);
        return conversion;
    }

    public Conversion kelvinToCelsius(Conversion conversion)
    {
        double value = (double) Math.round(conversion.getValue()-KELVIN_VALUE*100)/100;
        conversion.setRoundedConvertedValue(value);
        value = conversion.getValue()-KELVIN_VALUE;
        conversion.setConvertedValue(value);
        return conversion;
    }
}
