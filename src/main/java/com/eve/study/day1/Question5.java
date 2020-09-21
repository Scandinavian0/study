package com.eve.study.day1;
interface Animal{
    void soundOff();
}
class Elephant implements Animal{

    @Override
    public void soundOff() {
        System.out.println("Trumpet");
    }
}
class Lion implements Animal{

    @Override
    public void soundOff() {
        System.out.println("Roar");
    }
}
public class Question5 {
    static Animal get(String choice){
        if(choice.equalsIgnoreCase("meat eater")){
            return new Lion();
        }else {
            return new Elephant();
        }
    }
}

