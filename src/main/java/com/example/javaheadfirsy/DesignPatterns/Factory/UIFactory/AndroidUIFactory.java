package com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory;

import com.example.javaheadfirsy.DesignPatterns.Factory.Button.AndroidButtons;
import com.example.javaheadfirsy.DesignPatterns.Factory.Button.Button;
import com.example.javaheadfirsy.DesignPatterns.Factory.Dropdown.AndroidDropdown;
import com.example.javaheadfirsy.DesignPatterns.Factory.Dropdown.Dropdown;
import com.example.javaheadfirsy.DesignPatterns.Factory.Menu.AndroidMenu;
import com.example.javaheadfirsy.DesignPatterns.Factory.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButtons();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
