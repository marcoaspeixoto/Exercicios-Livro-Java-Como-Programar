package capitulo03;

// Fig. 2.7: Exercicio03_01.java
// Exercicio03_01 program that displays the sum of two numbers.
import javax.swing.JOptionPane;

public class Exercicio03_01 {
    // main method begins execution of Java application

    public static void main(String[] args) {
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2

        number1 = Integer.parseInt(JOptionPane.showInputDialog
            ("Enter first integer: ")); // read first number from user

        number2 = Integer.parseInt(JOptionPane.showInputDialog
            ("Enter second integer: ")); // read second number from user

        sum = number1 + number2; // add numbers, then store total in sum

        String message = String.format("Sum is %d%n", sum);
        JOptionPane.showMessageDialog(null, message);
    } // end method main
} // end class Exercicio03_01

/**
 * ************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 ************************************************************************
 */
