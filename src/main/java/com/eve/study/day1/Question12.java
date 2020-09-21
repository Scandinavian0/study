package com.eve.study.day1;

public class Question12 {
    public static void aMethod() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        try {
            aMethod();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception");
        }
        System.out.println("finished");
    }
}
