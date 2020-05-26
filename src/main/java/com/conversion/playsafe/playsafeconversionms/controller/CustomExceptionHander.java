package com.conversion.playsafe.playsafeconversionms.controller;



import com.conversion.playsafe.playsafeconversionms.CustomException.CustomException;
import com.conversion.playsafe.playsafeconversionms.CustomException.IncorrectException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHander extends Throwable {

    @ExceptionHandler({CustomException.class})
    public ResponseEntity<Object> noConversion(CustomException c) {
        return new ResponseEntity<>("No conversion type found!! Please enter Type!", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({IncorrectException.class})
    public ResponseEntity<Object> incorrect(IncorrectException i) {
        return new ResponseEntity<>("You have entered the incorrect conversion type," +
                " please enter one of the following (kelvinToCelsius, milesToKilos, poundsToKgs)",
            HttpStatus.BAD_REQUEST);
    }

}
