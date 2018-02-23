/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author fabio.nunes
 */
public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width = " +d.width);
        System.out.println("Screen height = " +d.height);
    }
    
}
