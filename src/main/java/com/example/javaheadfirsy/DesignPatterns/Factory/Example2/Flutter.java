package com.example.javaheadfirsy.DesignPatterns.Factory.Example2;

import com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory.AndroidUIFactory;
import com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory.UIFactory;

public class Flutter {


    private supportedPlatforms platform;

    public Flutter(supportedPlatforms platform){
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting theme");
    }
    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    //This is the factory method
    public UIFactory createUIFactory(){
        return UIFactoryFactory.getUIFactoryFromSupportedPlatform(platform);
    }
}
