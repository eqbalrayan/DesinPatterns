package com.os;


 class Android implements OS{

    private static Android android=null;
    private Android(){

    }
    public static Android getAndroid(){

        if(android==null){

            android = new Android();
        }
        return android;
    }

    public void spec(){

        System.out.println("I am using Android OS");
    }
    public static void show(){

        System.out.println("Android class");
    }
}

