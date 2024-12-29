package com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory;

import com.example.javaheadfirsy.DesignPatterns.Factory.Button.Button;
import com.example.javaheadfirsy.DesignPatterns.Factory.Button.IOSButtons;
import com.example.javaheadfirsy.DesignPatterns.Factory.Dropdown.Dropdown;
import com.example.javaheadfirsy.DesignPatterns.Factory.Dropdown.IOSDropdown;
import com.example.javaheadfirsy.DesignPatterns.Factory.Menu.IOSMenu;
import com.example.javaheadfirsy.DesignPatterns.Factory.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButtons();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
