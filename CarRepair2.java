package ch03_methods;

import static javax.swing.JOptionPane.*;

class CarRepair2 {

    public static void main(String[] args) {
        String partsStr = read("What is the parts cost");
        String hoursStr = read("How many hours");
        double parts = Double.parseDouble(partsStr);
        double hours = Double.parseDouble(hoursStr);
        double bill = calculateBill(parts, hours);
        display("Your bill is £" + bill);
    }

    private static void display(String s) {
        showMessageDialog(null, s);
    }

    private static String read(String prompt) {
        return showInputDialog(prompt);
    }

    private static double calculateBill(double p, double h) {
        double b = p + h * 20;
        return b * 1.175;
    }
}