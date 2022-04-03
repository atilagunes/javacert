package com.odamede.callclasswithparameters;

//As usual, arrays start at index 0.
/*
compileAndRunTest1.cmd
javac CallClassWithParameters.java
java CallClassWithParameters param1 param2
param1
param2
 */
/*
compileAndRunTest2.cmd
javac CallClassWithParameters.java
java CallClassWithParameters "Hi dude" hello
Hi dude
hello
 */
public class CallClassWithParameters {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
