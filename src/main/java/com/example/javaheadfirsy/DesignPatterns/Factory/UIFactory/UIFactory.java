package com.example.javaheadfirsy.DesignPatterns.Factory.UIFactory;

import com.example.javaheadfirsy.DesignPatterns.Factory.Button.Button;
import com.example.javaheadfirsy.DesignPatterns.Factory.Dropdown.Dropdown;
import com.example.javaheadfirsy.DesignPatterns.Factory.Menu.Menu;

public interface UIFactory {

    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}


