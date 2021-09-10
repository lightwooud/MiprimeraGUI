/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprimeragui;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author JAZMIN
 */
public class App extends JFrame{
 

    public App(String title) throws HeadlessException {
        super(title);
        setSize(1000, 400);
    }
    
    public static void main(String[] args) {
      App app = new App("mi primera GUI");
      app.setVisible(true);

    }
}
