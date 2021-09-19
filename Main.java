package com.factory;
import com.os.*;

class Main {

    public static void main(String[] args){

        OS android1 = CreateFactory.getInstance("open");
        OS android2 = CreateFactory.getInstance("open");
        OS android3 = CreateFactory.getInstance("open");
        OS android4 = CreateFactory.getInstance("open");

        OS ios1 = CreateFactory.getInstance("closed");
        OS ios2 = CreateFactory.getInstance("closed");
        OS ios3 = CreateFactory.getInstance("closed");
        OS ios4 = CreateFactory.getInstance("closed");


        OS window1 = CreateFactory.getInstance("abs");
        OS window2 = CreateFactory.getInstance("abs");
        OS window3 = CreateFactory.getInstance("abs");
        OS window4 = CreateFactory.getInstance("abs");

        System.out.println("Android HashCode  -=="+android1.hashCode()+"   ==="+android2.hashCode()+"   ---"+android3.hashCode()+"  ---"+android4.hashCode());
        System.out.println("ISO HashCode  -=="+ios1.hashCode()+"   ==="+ios2.hashCode()+"   ---"+ios3.hashCode()+"  ---"+ios4.hashCode());
        System.out.println("Window HashCode  -=="+window1.hashCode()+"   ==="+window2.hashCode()+"   ---"+window3.hashCode()+"  ---"+window4.hashCode());

        android1.spec();
        ios1.spec();

        window1.spec();
        
    }
    
}