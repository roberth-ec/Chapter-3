package ch03_methods;

import static javax.swing.JOptionPane.*;

class Tank {

    public static void main(String[] args) {
        // input variables - dimensions of tank
        // Strings for input, to be converted to ints

        String lengthStr, widthStr, depthStr;
        lengthStr = read("Length of tank (mm)");
        widthStr = read("Width of tank (mm)");
        depthStr = read("Depth of tank (mm)");

        long length, width, depth;
        length = Long.parseLong(lengthStr);
        width = Long.parseLong(widthStr);
        depth = Long.parseLong(depthStr);

        double volume = calculateVolume (length,width, depth);
        //dysplay the volume of a tank 
        display ( "volume of fish tank is " + volume + "Litres");
        
    
    }
    private static void display(String s) {
            showMessageDialog(null, s);
    }

    private static String read(String prompt) {
        return showInputDialog(prompt);
    }

    private static double calculateVolume(long l, long w, long d) {
        // calculate volume in cubic mm
        long volCmm = l* w * d;

        // convert to volume in litres
        double volLitre = volCmm / 1000000.0;

        // round to the nearest litre
        long volume = Math.round(volLitre);
       return volume ; 
    }
}
