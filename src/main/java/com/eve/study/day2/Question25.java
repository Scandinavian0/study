package com.eve.study.day2;

class TestSuper{
    TestSuper(int i){};
}
public class Question25 extends TestSuper {

    Question25(int i) {
        super(i);
    }
    class TestAll{
        //内部类不允许有静态方法
//        public static void main(String[] args) {
            //继承于有参构造函数则调用的是父类的有参构造函数
//            new Question25();
//        }
    }
}
