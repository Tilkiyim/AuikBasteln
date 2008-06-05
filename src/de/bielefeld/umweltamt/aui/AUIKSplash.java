/*
 * Created on 14.01.2005
 */
package de.bielefeld.umweltamt.aui;

import java.awt.Frame;
import java.awt.Toolkit;
import java.net.URL;

/**
 * Ein Splashscreen, der ein Bild anzeigt und w�hrenddessen das 
 * eigentliche Hauptprogramm l�dt.
*/
public class AUIKSplash {

	/**
	 * Zeigt einen Splashscreen an und l�dt das eigentlich Hauptprogramm.
	 * @param args
	 */
	public static void main(String[] args) {
        // Read the image data and display the splash screen

        // -------------------------------------------------
        Frame splashFrame = null;
        URL imageURL = AUIKSplash.class.getResource("splash.png");
        if (imageURL != null) {
            splashFrame = SplashWindow.splash(
                Toolkit.getDefaultToolkit().createImage(imageURL)
            );
        } else {
            System.err.println("Splash image not found");
        }

        // Call the main method of the application using Reflection
        // --------------------------------------------------------
        try {
            Class.forName("de.bielefeld.umweltamt.aui.AUIKataster")
            .getMethod("main", new Class[] {String[].class})
            .invoke(null, new Object[] {args});
        } catch (Throwable e) {
            e.printStackTrace();

            System.err.flush();
            System.exit(10);
        }

        // Dispose the splash screen
        // -------------------------
        if (splashFrame != null) splashFrame.dispose();
	}
}
