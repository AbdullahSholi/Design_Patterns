package org.example.others.optional;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Ali");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);

        System.out.println(optional1.isPresent());
        System.out.println(optional3.isPresent());

        if(optional1.isPresent()){
            System.out.println(optional1.get());
        }

        String value1 = optional3.orElse("Default Value"); // if exist return optional3 value, else return Default Value
        System.out.println(value1);

        String value2 = optional3.orElseGet(()-> "Computed Value");
        System.out.println(value2);

        try {
            String value4 = optional2.orElseThrow(() -> new IllegalArgumentException("No value present"));
            System.out.println(value4);
        } catch (Exception e) {
            System.out.println("Exception from optional2: " + e.getMessage());
        }

        Optional<String> upperCaseOptional = optional1.map(String::toUpperCase);
        System.out.println(upperCaseOptional);

        optional1.ifPresent(System.out::println);

        // Using ifPresentOrElse() (Java 9+)
        optional2.ifPresentOrElse(
                value -> System.out.println("Value is present: " + value),
                () -> System.out.println("Value is absent")
        );



    }


}
