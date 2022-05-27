//import java.util.Scanner;
import javax.swing.*;

public class practica {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String num1, num2, ope;
        ope = "0";
        int numUno, numDos, r;
        Double numA, numB, R;
        long Re;

        JOptionPane.showMessageDialog(null,"*******************************************\nWellcome to LambertOS's calculator!\n*******************************************");

        while(ope != "7"){
            //System.out.println("");
            ope = JOptionPane.showInputDialog(" 1. Add, 2. Subtract, 3. Multiply, 4. Divide, 5. Enhance number, 6. Round number ");
            int oper = Integer.parseInt(ope);

            if (oper == 0 || oper > 7){
                //System.out.println("");
                JOptionPane.showMessageDialog(null,"You didn't enter a valid value.");
            }

            switch (oper) {
                case 1:
                num1 = JOptionPane.showInputDialog("Give me the first number:");
                numUno = Integer.parseInt(num1);
                //num1 = sc.nextInt();
                num2 = JOptionPane.showInputDialog("Give me the second number:");
                numDos = Integer.parseInt(num2);
                //num2 = sc.nextInt();
                r = Math.addExact(numUno, numDos);
                //System.out.println("");
                JOptionPane.showMessageDialog(null,"*** The result of your operation is: " + r + " ***");
                break;

                case 2:
                num1 = JOptionPane.showInputDialog("Give me the first number:");
                numUno = Integer.parseInt(num1);
                //num1 = sc.nextInt();
                num2 = JOptionPane.showInputDialog("Give me the second number:");
                numDos = Integer.parseInt(num2);
                //num2 = sc.nextInt();
                r = Math.subtractExact(numUno, numDos);
                //System.out.println("");
                JOptionPane.showMessageDialog(null,"*** The result of your operation is: " + r + " ***");
                break;

                case 3:
                num1 = JOptionPane.showInputDialog("Give me the first number:");
                numUno = Integer.parseInt(num1);
                //num1 = sc.nextInt();
                num2 = JOptionPane.showInputDialog("Give me the second number:");
                numDos = Integer.parseInt(num2);
                //num2 = sc.nextInt();
                r = Math.multiplyExact(numUno, numDos);
                //System.out.println("");
                JOptionPane.showMessageDialog(null,"*** The result of your operation is: " + r + " ***");
                break;

                case 4:
                num1 = JOptionPane.showInputDialog("Give me the first number:");
                numUno = Integer.parseInt(num1);
                //num1 = sc.nextInt();
                num2 = JOptionPane.showInputDialog("Give me the second number:");
                numDos = Integer.parseInt(num2);
                //num2 = sc.nextInt();
                r = Math.divideExact(numUno, numDos);
                //System.out.println("");
                JOptionPane.showMessageDialog(null,"*** The result of your operation is: " + r + " ***");
                break;

                case 5:
                num1 = JOptionPane.showInputDialog("Give me the base:");
                numA = Double.parseDouble(num1);
                //numA = sc.nextDouble();
                num2 = JOptionPane.showInputDialog("Give me the exponent:");
                numB = Double.parseDouble(num2);
                //numA = sc.nextDouble();
                R = Math.pow(numA, numB);
                //System.out.println("");
                JOptionPane.showMessageDialog(null,"*** The result of your operation is: " + R + " ***");
                break;

                case 6:
                num1 = JOptionPane.showInputDialog("Give the number:");
                numA = Double.parseDouble(num1);
                //numA = sc.nextDouble();
                Re = Math.round(numA);
                //System.out.println("");
                JOptionPane.showMessageDialog(null,"*** The rounded number is: " + Re + " ***");
                break;
            }
        }
        //sc.close();
    }
}
