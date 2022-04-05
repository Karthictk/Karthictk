package com.phonepe.validation.tests.wallet.v2;

import scala.Char;

import java.util.Scanner;

public class WrapperClassDemo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int a=sc.nextInt();

         //Boxing
         Integer i=new Integer(a);

         //unbox
        System.out.println(i.intValue());

        String str=sc1.nextLine();
        char ch=str.charAt(0);
        Character ch1=new Character(ch);
        System.out.println(ch1.charValue());

        float fl=sc.nextFloat();
        Float f=new Float(fl);
        System.out.println(f.floatValue());

    }
}
