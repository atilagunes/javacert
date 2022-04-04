package com.odamede.javacert.javawelcome._005_callclasswithparameters;

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
/*
compileAndRunTest3.cmd -- Gunes is ignored
javac CallClassWithParameters.java
java CallClassWithParameters Mevlut Atila Gunes
Mevlut
Atila
 */
/*
compileAndRunTest4.cmd -- not enough exception
ArrayIndexOutOfBoundException
javac CallClassWithParameters.java
java CallClassWithParameters Mevlut
Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException: Index 1 out of
bounds for length 1
at CallClassWithParameters.main(CallClassWithParameters.java:38)
 */
public class CallClassWithParameters {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
