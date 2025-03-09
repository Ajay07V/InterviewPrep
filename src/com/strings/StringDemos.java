package com.strings;

public class StringDemos {
    public static void main(String[] args) {
        String s1 = "Ajay";
        String s2 = "Ajay";
        String os1=new String("Ajay");
        String os2=new String("Ajay");
        if (s1 == s2) {
            System.out.println("Same References");
        }
        System.out.println("s1 hc " + s1.hashCode());
        System.out.println("s2 hc " + s2.hashCode());
        StringBuffer sb1= new StringBuffer("Ajay");
        StringBuffer sb2= new StringBuffer("Ajay");
        if (sb1 == sb2) {
            System.out.println("Same References for string buffer");
        }
        if (s1==os1){
            System.out.println("Same Reference for literal and object");
        }

    }

}
