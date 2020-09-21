package com.eve.study.day1;

public class Question16 {
    static boolean foo(char c){
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i=0;
        for (foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');
        }
    }
}
/*
* 1.其实foo(‘A’);就是初始化条件，只会执行一次，所以第一个打印的肯定是A
2.因为i=0;循环条件是i<2 （由此可知循环i等于2的时候就会停止循环，)所有0<2满足条件，接着会输出B，然后执行i++；i就变成1了，再输出D，再最后输出C，一次循环后的结果是：ABDC
3.第二次循环的开始是foo(‘A’);是初始条件所以不会执行，直接从foo(‘B’)开始，输出B，然后i为1，且小于2，此时循环体内再次执行i++；i的值为2了，再次输出D，最后输出C
第二次循环输出：BDC
4.*然后循环再次执行for(foo(‘A’);foo(‘B’)&&(i<2);foo(‘C’))
直接输出B，***i的值在第二轮循环后的值变成了2，2<2不成立，终止循环，输出B
*
* */
