package com.odamede.javacert.javawelcome._008_redundantimports;

import java.lang.System;
import java.lang.*;
import java.util.Random;
import java.util.*;

/*
import java.lang.System and java.lang.* is redundant because
these packages are automatically important.
java.util.Random is redundant because java.util.* will be cover
Random class too.
 */
public class RedundantImports {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
