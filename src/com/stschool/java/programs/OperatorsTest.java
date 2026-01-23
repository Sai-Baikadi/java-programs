package com.stschool.java.programs;

public class OperatorsTest {
    public static void main(String[] args){
        int no1 = 10;
        int no2 = 20;
        int res = no1++ - --no2 + no2-- * ++no1 + --no1;
        System.out.print(res);

        int n1 =10;
        System.out .println(n1++ > 10 && ++n1 > 5);
        System.out.println(n1);

    }
}
