package com.tarun;

public class stringdemo {
    public static void main(String[] argv) {
        char [] copyFrom = { 'j', 'a', 'n', 'j', 'a', 'v', 'a', 'n', 'p', 't', 'e', 'l'};
        char[] copyTo = new char[9];
        System.arraycopy(copyFrom, 3,copyTo,0,9 );
        System.out.println(new String(copyTo));

    }
    }

