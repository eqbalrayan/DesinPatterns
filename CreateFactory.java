
package com.os;

public class CreateFactory {

    private static OS os; 
    
    public static OS getInstance(String str){

        if(str.equalsIgnoreCase("open")){

                        os=Android.getAndroid();
                    return os;
        }else if(str.equalsIgnoreCase("closed")){

            

                os=IOS.getIOS();
            
            return os;
        }else {
            
                os=Window.getWindow();
            
            return os;
        }
        
    }
}