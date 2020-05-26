package com.conversion.playsafe.playsafeconversionms.CustomException;

public class IncorrectException extends Exception {

    public IncorrectException() {
        super("You have entered the incorrect conversion type," +
                " please enter one of the following (kelvinToCelsius, milesToKilos, poundsToKgs)");
    }
}
