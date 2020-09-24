package com.eve.study.day2;

public class Question52 extends Question52_1{
    public long getLength(){return 5;}

    public static void main(String[] args) {
        Question52 question52=new Question52();
        Question52_1 question52_1=new Question52_1();
        System.out.println(question52_1.getLenght()+","+question52.getLenght());
    }
}
class Question52_1{
    public int getLenght(){
        return 4;
    }
}
