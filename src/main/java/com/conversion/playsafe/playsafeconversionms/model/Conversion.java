package com.conversion.playsafe.playsafeconversionms.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Conversion
{
    private String conversionType;
    private double value;
    private double convertedValue;
    private double roundedConvertedValue;
}
