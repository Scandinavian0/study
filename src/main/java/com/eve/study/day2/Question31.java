package com.eve.study.day2;

public class Question31 {
    public static void main(String[] args) {
        boolean flag;
        int i=0;
        do {
            flag=false;
            System.out.print(i++);
            flag=i<10;  //如果i<10则为true，while会继续执行，当i<10为false时，while不执行
            continue;
        }while ((flag)?true:false);
    }
}
