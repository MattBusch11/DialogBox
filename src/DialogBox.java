import javax.swing.*;
import java.util.Scanner;

/**
 * @author mbb23738@email.vccs.edu
 * Author: Matt Busch
 * Date: 9/14/17
 * Purpose: to show different data types using JOptionPane
 */
public class DialogBox {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a byte value.");
        byte byteValue = keyboard.nextByte();
        System.out.println("Enter an int value.");
        int intValue = keyboard.nextInt();
        System.out.println("Enter a double value.");
        double doubleValue = keyboard.nextDouble();
        System.out.println("Enter a boolean value.");
        boolean booleanValue = keyboard.nextBoolean();
        System.out.println("Enter a long value.");
        long longValue = keyboard.nextLong();
        System.out.println("Enter a short value");
        short shortValue = keyboard.nextShort();
        System.out.println("Enter a float value");
        float floatValue = keyboard.nextFloat();
        System.out.println("Enter a char value");
        char charValue = keyboard.next().charAt(0);
        JOptionPane.showMessageDialog(null, "Byte = " + byteValue + "\n"
        + "int = " + intValue + "\n"
        + "double = " + doubleValue + "\n"
        + "boolean = " + booleanValue + "\n"
        + "long = " + longValue + "\n"
        + "short = " + shortValue + "\n"
        + "float = " + floatValue + "\n"
        + "char = " + charValue + "\n");
        keyboard.close();


    }
}
