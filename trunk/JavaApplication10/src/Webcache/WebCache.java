/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Webcache;

import java.io.IOException;

/**
 *
 * @author Vinicius
 */
public class WebCache {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BrowserHandler browserHandler = new BrowserHandler(5557);
        browserHandler.run();
    }
}
