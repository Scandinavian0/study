package com.eve.study.day1;

public class Question19 {
    public int aMethod(){
//        static int i=0;//此处不允许使用static
        int i=0;
        i++;
        return i;
    }

    public static void main(String[] args) {
        Question19 question19=new Question19();
        question19.aMethod();
        int j=question19.aMethod();
        System.out.println(j);
    }
}
