package com.example.javaheadfirsy.DesignPatterns.Factory.Example2;

import com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory.AndroidUIFactory;
import com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory.IOSUIFactory;
import com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory.UIFactory;
import com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory.WebUIFactory;

public class UIFactoryFactory {

    // This is the class that returns the UI factory to be used. This itself a factory that creates another factory

    public static UIFactory getUIFactoryFromSupportedPlatform(supportedPlatforms  platform){
        if(platform == supportedPlatforms.ANDROID){
            return new AndroidUIFactory();
        }
        else if(platform == supportedPlatforms.IOS){
            return new IOSUIFactory();
        }
        else if(platform == supportedPlatforms.WEB){
            return new WebUIFactory();
        }

        return null;

    }


}
