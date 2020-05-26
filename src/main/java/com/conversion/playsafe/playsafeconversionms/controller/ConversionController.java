package com.conversion.playsafe.playsafeconversionms.controller;


import com.conversion.playsafe.playsafeconversionms.CustomException.CustomException;
import com.conversion.playsafe.playsafeconversionms.CustomException.IncorrectException;
import com.conversion.playsafe.playsafeconversionms.model.Conversion;
import com.conversion.playsafe.playsafeconversionms.service.ConversionServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/apis/playsafe")
public class ConversionController {

    @Autowired
    private ConversionServicee conversionService;
    @PostMapping("/conversion")
    public Conversion convert(@RequestBody Conversion conversion)throws Exception
    {
        if(conversion.getConversionType().isEmpty())
        {
           throw new CustomException();
        }
        else if((!conversion.getConversionType().equalsIgnoreCase("kelvinToCelsius"))
                 && (!conversion.getConversionType().equalsIgnoreCase("poundsToKgs"))
                 && (!conversion.getConversionType().equalsIgnoreCase("milesToKilos")))
         {
             throw new IncorrectException();
         }
        return conversionService.convertValue(conversion);
    }
}
