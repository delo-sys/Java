/* create a GUI application where the user enters the wholesale cost of an item and the markup percentage into text field (for example,if an item's wholesale cost is $5 and its markup percentage is 100 percent ,then retail price is $10).The application should have a button that display item's retail price clicked.
*/

package com.mycompany.gui_pt2;

public class ReatailPriceCalculator {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            javax.swing.JFrame frame = new javax.swing.JFrame("Retail Price Calculator");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 200);
            frame.setLayout(new java.awt.GridLayout(4, 2, 5, 5));

            javax.swing.JLabel costLabel = new javax.swing.JLabel("Wholesale Cost:");
            javax.swing.JTextField costField = new javax.swing.JTextField();

            javax.swing.JLabel markupLabel = new javax.swing.JLabel("Markup Percentage:");
            javax.swing.JTextField markupField = new javax.swing.JTextField();

            javax.swing.JButton calcButton = new javax.swing.JButton("Calculate Retail Price");
            javax.swing.JLabel resultLabel = new javax.swing.JLabel("Retail Price: ");

            calcButton.addActionListener(e -> {
                try {
                    double cost = Double.parseDouble(costField.getText());
                    double markup = Double.parseDouble(markupField.getText());
                    double retailPrice = cost + (cost * markup / 100);
                    resultLabel.setText(String.format("Retail Price: $%.2f", retailPrice));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            });

            frame.add(costLabel);
            frame.add(costField);
            frame.add(markupLabel);
            frame.add(markupField);
            frame.add(new javax.swing.JLabel()); // empty cell
            frame.add(calcButton);
            frame.add(resultLabel);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
