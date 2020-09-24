package com.eve.study.day2;


public class Question27 {
    public static void main(String[] args) {
        System.out.println("value="+switchIt(4));
    }
    public static int switchIt(int x){
        int j=1;
        /*case判断后面没有添加break；故在case 4后面依次执行，同时考虑j++和++j的区别，
         *j++用的时候才加一，故在执行完default后j喂3，但是在计算j+x的时候j还要加一，故喂4+4
         *
         *
         */
        switch (x){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        System.out.println(j);
        return j+x;
    }
}
