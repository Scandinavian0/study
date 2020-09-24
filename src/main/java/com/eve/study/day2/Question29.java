package com.eve.study.day2;

public class Question29 {
    public static void main(String[] args) {
        try {
            return;
        }finally {
            //考的是finally的定义，也就说不管程序是否抛出异常都要执行finally里面的内容
            System.out.println("Finally");
        }
    }
}
