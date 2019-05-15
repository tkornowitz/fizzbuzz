package com.lyreco.fizzbuzz;

import java.util.Optional;

public class FizzBuzz {

    public String fizzBuzz(Integer number){
        return Optional.of(number).map(n -> {
            if (n.toString().contains("3")) return "Lucky";
            else if (n % 15 == 0) return "FizzBuzz";
            else if (n % 3 == 0) return "Fizz";
            else if (n % 5 == 0) return "Buzz";
            else return n.toString();
        }).get();
    }
}
