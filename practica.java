import java.util.Scanner;
public class practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, oper, r;
        oper = 0;
        Double numA, numB, R;
        long Re;

        System.out.println("***********************************");
        System.out.println("Wellcome to LambertOS's calculator!");
        System.out.println("***********************************");


        while(oper != 7){
            System.out.println("");

            System.out.println("What operation do you want to do?");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Enhance number");
            System.out.println("6. Round number");
            System.out.println("7. Exit");
            oper = sc.nextInt();

            if (oper == 0 || oper > 7){
                System.out.println("");
                System.out.println("You didn't enter a valid value.");
            }

            switch (oper) {
                case 1:
                System.out.println("Give me the first number:");
                num1 = sc.nextInt();
                System.out.println("Give me the second number:");
                num2 = sc.nextInt();
                r = Math.addExact(num1, num2);
                System.out.println("");
                System.out.println("*** The result of your operation is: " + r + " ***");
                break;

                case 2:
                System.out.println("Give me the first number:");
                num1 = sc.nextInt();
                System.out.println("Give me the second number:");
                num2 = sc.nextInt();
                r = Math.subtractExact(num1, num2);
                System.out.println("");
                System.out.println("*** The result of your operation is: " + r + " ***");
                break;

                case 3:
                System.out.println("Give me the first number:");
                num1 = sc.nextInt();
                System.out.println("Give me the second number:");
                num2 = sc.nextInt();
                r = Math.multiplyExact(num1, num2);
                System.out.println("");
                System.out.println("*** The result of your operation is: " + r + " ***");
                break;

                case 4:
                System.out.println("Give me the first number:");
                num1 = sc.nextInt();
                System.out.println("Give me the second number:");
                num2 = sc.nextInt();
                r = Math.divideExact(num1, num2);
                System.out.println("");
                System.out.println("*** The result of your operation is: " + r + " ***");
                break;

                case 5:
                System.out.println("Give me the base:");
                numA = sc.nextDouble();
                System.out.println("Give me the exponent:");
                numB = sc.nextDouble();
                R = Math.pow(numA, numB);
                System.out.println("");
                System.out.println("*** The result of your operation is: " + R + " ***");
                break;

                case 6:
                System.out.println("Give the number:");
                numA = sc.nextDouble();
                Re = Math.round(numA);
                System.out.println("");
                System.out.println("*** The rounded number is: " + Re + " ***");
                break;

                case 7:
                System.out.println("Good Day");

            }
        }

        sc.close();












    }
}
