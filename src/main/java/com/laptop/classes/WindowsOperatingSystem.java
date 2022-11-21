package com.laptop.classes;

import com.laptop.interfaces.OperatingSystem;

public class WindowsOperatingSystem implements OperatingSystem{

    public WindowsOperatingSystem()
    {  
        System.out.println("Loading.....Windows");  
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
            System.out.println("Booting Failed");
        }
        System.out.println("Please Sign In");
        if(AuthenticateUser()==true)
        {
            System.out.println("Succesful Logged in");
        }
        else
        System.out.println("Please enter correct password");
    }

    @Override
    public Boolean AuthenticateUser()
    {
        return true;
    }


}
