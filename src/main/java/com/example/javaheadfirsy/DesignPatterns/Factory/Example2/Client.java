package com.example.javaheadfirsy.DesignPatterns.Factory.Example2;

import com.example.javaheadfirsy.DesignPatterns.Factory.Button.Button;
import com.example.javaheadfirsy.DesignPatterns.Factory.Dropdown.Dropdown;
import com.example.javaheadfirsy.DesignPatterns.Factory.Menu.Menu;
import com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory.UIFactory;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter(supportedPlatforms.ANDROID);

        UIFactory uiFactory = flutter.createUIFactory();
        Button buttons = uiFactory.createButton();
        Menu menus = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();

        buttons.changeSize();

    }
}
