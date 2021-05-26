package com.wsl;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(0^0^0);
        System.out.println(fun());
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        String s = scanner1.next();
        System.out.println("int a = "+a);
        System.out.println(s);
        Map<Integer,Integer> map =new HashMap<>();
        Math.abs(3);
        int maxValue = Integer.MAX_VALUE;


    }
    public static int fun(){
        try{
            int i = 9/0;
        }catch (Exception e){
            return 3;
        }finally {
            return 30;
        }
    }
}
