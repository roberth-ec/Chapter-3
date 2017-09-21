package ch03_methods;

import static javax.swing.JOptionPane.*;

class CarpetCalculator4 {

    public static void main(String[] args) {
        final String BEST_CARPET = "Berber";
        final String ECONOMY_CARPET = "Pile";

        String roomLengthStr =
                read("What is the room length (m)");
        String roomWidthStr =
                read("What is the room width (m)");

        int roomLength = Integer.parseInt(roomLengthStr);
        int roomWidth = Integer.parseInt(roomWidthStr);
       
        double carpetPrice, totalCost;
        

        // best carpet
        carpetPrice = 27.95;
        totalCost = CalculateTotalCost (roomLength,roomWidth,carpetPrice);
                display ("The cost of " + BEST_CARPET + " is £" + totalCost);

        // economy carpet
           carpetPrice = 15.95;
           totalCost = CalculateTotalCost (roomLength, roomWidth,carpetPrice);
     
            display("The cost of " + ECONOMY_CARPET + " is £" + totalCost);
    }
    private static void display(String s) {
        showMessageDialog(null, s);
    }

    private static String read(String prompt) {
        return showInputDialog(prompt);
    }

    private static double CalculateTotalCost(int roomLength, int roomWidth, double CarpetPrice) {
            double totalCost;
        int roomArea = roomLength * roomWidth;
        totalCost = roomArea*CarpetPrice;
                return totalCost;     
                
          }
}