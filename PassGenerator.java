import java.io.*;
import java.math.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.prefs.*;
import java.util.regex.*;
import java.util.stream.*;
class PassGenerator {
    public static void main(String[] args) {
        int passLength = 10;
        boolean onlyAlphaNum = false;
        
        if(args.length > 0) {
            try {
                passLength = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("You didn't pass a number. Set length to 10");
            }
        }

        if(args.length > 1) {
            onlyAlphaNum = Boolean.valueOf(args[1]);
        }

        // TODO: pick random chars from set in given number, pick only alphanum if parameter is true
        // Set<Character> chars = IntStream
        //     .rangeClosed(33, 127)
        //     .boxed()
        //     .map(i -> Character
        //     .toChars(i)[0])
        //     .collect(Collectors.toSet());

        new Random()
            .ints(passLength, 33, 127)
            .boxed()
            .map(i -> Character.toChars(i)[0])
            .forEach(System.out::print);
    }
}
