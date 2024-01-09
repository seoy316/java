package com.oop.dependency;

import com.modeling.weather.Graphics;

import java.applet.Applet;

public class MyApplet extends Applet {
    @Override
    public void init() {
        super.init();
    }

    public void start() {

    }

    public void print(Graphics g) {
        getGraphics().drawString("Hello Applet", 10, 20);

    }
}
