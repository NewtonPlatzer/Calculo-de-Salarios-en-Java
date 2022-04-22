import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int key, antiquity;

        System.out.println("***************************************************");
        System.out.println("*Welcome to The Coca-Cola Company Vacation System.*");
        System.out.println("***************************************************");

        // User Name
        System.out.println(" ");
        System.out.println("*What's your name?*");
        name = sc.nextLine();
        // Department Key
        System.out.println("*" + name + " what is your department key?*");
        key = sc.nextInt();


        if (key <= 3){
            // Antiquity in the CompanyIjas
            System.out.println("*" + name + " what is your antiquity in the company?*");
            antiquity = sc.nextInt();
            System.out.println(" ");
            switch (key){
                case 1:
                    if (antiquity == 1){
                        System.out.println("*" + name + " you have right to 6 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    } else if (antiquity >= 2 && antiquity <= 6) {
                        System.out.println("*" + name + " you have right to 14 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    } else if (antiquity >= 7 ) {
                        System.out.println("*" + name + " you have right to 20 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    }
                case 2:
                    if (antiquity == 1){
                        System.out.println("*" + name + " you have right to 7 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    } else if (antiquity >= 2 && antiquity <= 6) {
                        System.out.println("*" + name + " you have right to 15 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    } else if (antiquity >= 7 ) {
                        System.out.println("*" + name + " you have right to 22 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    }

                case 3:
                    if (antiquity == 1){
                        System.out.println("*" + name + " you have right to 10 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    } else if (antiquity >= 2 && antiquity <= 6) {
                        System.out.println("*" + name + " you have right to 20 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    } else if (antiquity >= 7 ) {
                        System.out.println("*" + name + " you have right to 30 vacation's days, have a happy day.*");
                        name = "";
                        key = 0;
                        antiquity = 0;
                        break;
                    }

            }

        }else{
            System.out.println("Invalid Key ¿?");
        }



    }
}
