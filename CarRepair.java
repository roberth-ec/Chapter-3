package ch03_methods;

import static javax.swing.JOptionPane.*;

class CarRepair {

    public static void main(String[] args) {
        String partsStr = read("What is the parts cost");
        String hoursStr = read("How many hours");
        double parts = Double.parseDouble(partsStr);
        double hours = Double.parseDouble(hoursStr);
        // calculate bill before VAT
        double bill = parts + hours * 20;
        // add VAT
        bill *= 1.175; // same as bill = bill * 1.175;
        display("Your bill is £" + bill);
    }

    private static void display(String s) {
        showMessageDialog(null, s);
    }

    private static String read(String prompt) {
        return showInputDialog(prompt);
    }
}