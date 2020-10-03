package com.tarun;
import java.applet.Applet;
import java.awt.Graphics;


public class HelloWorld extends Applet {
    public void init(){
        resize(200,200);
    }
    public void paint(Graphics g){
        g.drawString("welcome nptel java", 100,100);
    }

}
