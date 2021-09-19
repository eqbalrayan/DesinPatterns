package com.os;

class Window implements OS{

    private static Window window=null;

    private Window(){

    }
    public static Window getWindow(){

        if(window==null){
            window=new Window();
        }
        return window;
    }

    public void spec(){

        System.out.println("I am using Window OS");
    }
    
}