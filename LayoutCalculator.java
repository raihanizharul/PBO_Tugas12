package Nusput.P12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutCalculator extends JFrame {
   private JTextField displayField;
   private double result;
   private String operator;
   public LayoutCalculator() {
      // Set frame title
      super("Calculator");

      // Set frame size
      setSize(500, 300);

      // Set default close operation
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Set frame layout
      setLayout(new BorderLayout());

      // Create display panel
      JPanel displayPanel = new JPanel();
      displayPanel.setLayout(new FlowLayout());

      // Create display text field
      displayField = new JTextField(50);
      displayField.setEditable(false);

      // menambahkan display text field to display panel
      displayPanel.add(displayField);

      // menambahkan display panel to frame
      add(displayPanel, BorderLayout.NORTH);

      // Create button panel
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new GridLayout(3, 3));

      // Create buttons
      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");
      JButton b4 = new JButton("4");
      JButton b5 = new JButton("5");
      JButton b6 = new JButton("6");
      JButton b7 = new JButton("7");
      JButton b8 = new JButton("8");
      JButton b9 = new JButton("9");
      JButton b0 = new JButton("0");
      JButton bEqual = new JButton("=");
      JButton bPlus = new JButton("+");
      JButton bMinus = new JButton("-");
      JButton bMultiply = new JButton("*");
      JButton bDivide = new JButton("/");
      JButton bPercent = new JButton("%");
      JButton bModulo = new JButton("Mod");
      JButton bExit = new JButton("Exit");

      // menambahkan action listeners for number buttons
      b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            displayField.setText(displayField.getText() + "1");
         }
      });
      b2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            displayField.setText(displayField.getText() + "2");
         }
      });
      b3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            displayField.setText(displayField.getText() + "3");
         }
      });
      b4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            displayField.setText(displayField.getText() + "4");
         }
      });
         b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               displayField.setText(displayField.getText() + "5");
            }
         });
         b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               displayField.setText(displayField.getText() + "6");
            }
         });
         b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               displayField.setText(displayField.getText() + "7");
            }
         });
         b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               displayField.setText(displayField.getText() + "8");
            }
         });
         b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               displayField.setText(displayField.getText() + "9");
            }
         });
         b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               displayField.setText(displayField.getText() + "0");
            }
         });
         
         // tambahkan action listeners for operator buttons
         bPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               operator = "+";
               result = Double.parseDouble(displayField.getText());
               displayField.setText("");
            }
         });
         bMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               operator = "-";
               result = Double.parseDouble(displayField.getText());
               displayField.setText("");
            }
         });
         bMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               operator = "*";
               result = Double.parseDouble(displayField.getText());
               displayField.setText("");
            }
         });
         bDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               operator = "/";
               result = Double.parseDouble(displayField.getText());
               displayField.setText("");
            }
         });
         bModulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               operator = "Mod";
               result = Double.parseDouble(displayField.getText());
               displayField.setText("");
            }
         });
         
         
      // menambahkan action listener for equal button
      bEqual.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
               if (operator == "+") {
                  double num = Double.parseDouble(displayField.getText());
                  result += num;
                  displayField.setText(Double.toString(result));
               } else if (operator == "-") {
                  double num = Double.parseDouble(displayField.getText());
                  result -= num;
                  displayField.setText(Double.toString(result));
               } else if (operator == "*") {
                  double num = Double.parseDouble(displayField.getText());
                  result *= num;
                  displayField.setText(Double.toString(result));
               } else if (operator == "/") {
                  double num = Double.parseDouble(displayField.getText());
                  result /= num;
                  displayField.setText(Double.toString(result));
               }
               else if (operator == "Mod") {
                  double num = Double.parseDouble(displayField.getText());
                  result %= num;
                  displayField.setText(Double.toString(result));
               }
               else if (operator == "%") {
                  double num = Double.parseDouble(displayField.getText());
                  result = result * num / 100;
                  displayField.setText(Double.toString(result));
               }
               }
               });

      // menambahkan action listener for persen button
      bPercent.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            operator = "%";
            result = Double.parseDouble(displayField.getText());
            displayField.setText("");
         }
      });
            
      // tambahkan action listener for exit button
      bExit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });                
                        

   // menambahkan buttons to button panel
   buttonPanel.add(b1);
   buttonPanel.add(b2);
   buttonPanel.add(b3);
   buttonPanel.add(b4);
   buttonPanel.add(b5);
   buttonPanel.add(b6);
   buttonPanel.add(b7);
   buttonPanel.add(b8);
   buttonPanel.add(b9);
   buttonPanel.add(b0);
   buttonPanel.add(bPlus);
   buttonPanel.add(bMinus);
   buttonPanel.add(bMultiply);
   buttonPanel.add(bDivide);
   buttonPanel.add(bEqual);
   buttonPanel.add(bPercent);
   buttonPanel.add(bModulo);
   buttonPanel.add(bExit);

   // menambahkanbutton panel to frame
   add(buttonPanel, BorderLayout.CENTER);

   // Set frame visible
   setVisible(true);
   }

   public static void main(String[] args) {
   // Create frame
   new LayoutCalculator();
   }
}

         
