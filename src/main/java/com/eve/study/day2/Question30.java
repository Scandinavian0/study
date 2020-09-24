package com.eve.study.day2;

public class Question30 extends Question30_1{
    public static void main(String[] args) {
        char a=new Question30_1().getVar();
        char b=new Question30().getVar();
    }
}
class Question30_1{
    private char var ='a';
    char getVar(){
        return var;
    }
}