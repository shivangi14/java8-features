package com.company.optionalClass;

import java.util.Optional;

public class CheckNotNull {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        Optional<String> checkString = Optional.ofNullable(strArray[5]);
        if(checkString.isPresent())
            System.out.println("present - "+ checkString.get());
        else
            System.out.println("Value not present");

        strArray[4] = "i am here!!";
        if(Optional.ofNullable(strArray[4]).isPresent())
            System.out.println("value is "+ strArray[4]);
        else
            System.out.println("nothing at [4]");;
    }
}
