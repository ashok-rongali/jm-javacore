package com.cores;

import java.util.Objects;

public class JStrings {

    public static void createStrings(){
        //1.String Literal
        String s1 = "hello";

        //2. Using new Keyword
        String s2 = new String("hello");
            //Always creates a new String object in the heap

        // 3. Using String.intern()
        String s3 = new String("hello").intern();
            //Moves or references the string from the heap to the string pool

        // 4.  From char[], byte[], or StringBuilder
        char[] chars = {'h','e','l','l','o'};
        String s4 = new String(chars);

        byte[] bytes = {104, 101, 108, 108, 111};
        String s5 = new String(bytes);

        StringBuilder sb = new StringBuilder("hello");
        String s6 = sb.toString();

        //5. Concatenation at Compile Time
        String s7 = "hel" + "lo";  // optimized at compile-time

        //6. Concatenation at Runtime
        String part = "hel";
        String s8 = part + "lo";  // not optimized into pool

        //7. Using String.format()
        String s9 = String.format("Welcome %s", "Ashok");

        // 8. From String.valueOf()
        String s10 = String.valueOf(123); // "123"

        //9. From Objects.toString()
        Object obj = null;
        String s11 = Objects.toString(obj, "default");






    }

    public static void main(String[] args) {
        System.out.println("Jai ho");
        JStrings.createStrings();
    }
}


//|         Method                             | Purpose                     |
//        | ---------------------------------- | --------------------------- |
//        | `.substring()`                     | Get portion of string       |
//        | `.split(regex)`                    | Break string into array     |
//        | `.replace()`, `.replaceAll()`      | Replace characters or regex |
//        | `.indexOf()`, `.lastIndexOf()`     | Find position               |
//        | `.startsWith()`, `.endsWith()`     | Match beginning/end         |
//        | `.matches(regex)`                  | Full regex match            |
//        | `.toLowerCase()`, `.toUpperCase()` | Case transformation         |
//        | `.trim()`, `.strip()`              | Whitespace removal          |
