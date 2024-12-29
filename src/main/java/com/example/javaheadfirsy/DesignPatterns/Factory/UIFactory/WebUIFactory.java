package com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory;

import com.example.javaheadfirsy.DesignPatterns.Factory.Button.Button;
import com.example.javaheadfirsy.DesignPatterns.Factory.Dropdown.Dropdown;
import com.example.javaheadfirsy.DesignPatterns.Factory.Menu.Menu;

public class WebUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
