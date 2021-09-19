package com.os;

class IOS implements OS {

    private static IOS ios=null;
    private IOS(){

    }
    public static IOS getIOS(){

        if(ios==null){
            ios=new IOS();
        }
        return ios;
    }

    public void spec(){

        System.out.println("I am using IOS OS");
    }
    
}