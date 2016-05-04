/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtts;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author mark
 */
public class TFrame extends JFrame {

    int ScreenWidth = 640;
    int ScreenHeight = 480;

   // AnimationTest atest;// = new AnimationTest();

    public TFrame(String s) {

        super("Client Server");
       //  atest = new AnimationTest(s);
        setSize(ScreenWidth, ScreenHeight);
        getContentPane().setLayout(new BorderLayout());
      //  getContentPane().add(atest, "Center");
        setVisible(true);
        setDefaultCloseOperation(TFrame.EXIT_ON_CLOSE);

    }

}
