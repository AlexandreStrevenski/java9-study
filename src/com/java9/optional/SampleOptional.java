package com.java9.optional;

import java.util.Optional;

public class SampleOptional {

    public static void main(String[] args) {

        Optional<String> optionalText = someGoodMethod();

        optionalText.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("something else, because we don't have any value"));

    }

    public static Optional<String> someGoodMethod(){
        //some business rule
        return Optional.ofNullable("text sample"); // keep in mind that this value maybe will be returned from DB.
    }
}
