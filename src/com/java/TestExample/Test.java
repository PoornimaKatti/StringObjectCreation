package com.java.TestExample;

//This demonstrates the immutability of strings.
// In Java, once a string is created, its content cannot be changed.
// When you perform an operation that appears to modify a string,
// what actually happens is the creation of a new string.
public class Test {
    public static void main(String[] args) {


        String a = "hello";
        String b = "hello";
        String c = new String("hello");
         a="abc";
         b="cdf";
         c="ndjhdj";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
