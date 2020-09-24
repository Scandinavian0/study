package com.eve.study.day2;

public class Question42 {
    public static void badMethod(){
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        try{
            badMethod();
        }catch (Exception ex){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
