package com.odamede.javacert.javawelcome._007_importwithwildcards;

import java.util.*;

/*
The compiler figures out what's actually needed.
It doesn't import child packages, fields, or methods.
it imports only classes.
It prints a number between 0 and 9 integer
 */
public class ImportWithWildcards {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
