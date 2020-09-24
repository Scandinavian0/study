package com.eve.study.day1;

class Super {
    public float getNum(){return 3.0f;}
}

public class Question20 extends Super{
    //方法重载
    public float getNum(){return 0;};
}
/*
*
*重载（Overload）:首先是位于一个类之中或者其子类中，具有相同的方法名，但是方法的参数不同，返回值类型可以相同也可以不同。
* 重写（override）：一般都是表示子类和父类之间的关系，其主要的特征是：方法名相同，参数相同，但是具体的实现不同。
* * */
