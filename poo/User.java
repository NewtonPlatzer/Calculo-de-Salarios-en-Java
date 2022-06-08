package poo;

import java.text.MessageFormat;
import java.util.Scanner;


public class User {

    private String userName;
    private String email;
    private String password;
    private String status;
    private String targetNumber;

    public User(){
        userName = "Null";
        email = "null@null.null";
        password = "null";
        status = "null";
        targetNumber = "";
    }

    public String UserName(){ //Getter
        return "El nombre del usuario es:  " + userName;
    }

    public String Email(){ //Getter
        return "El email del usuario " + userName + " es: " + email;
    }

    public String Password(){ //Getter
        return "La contraseña del usuario " + userName + " es: " + password;
    }

    public String motorCoche(){ //Getter
        return "El status del usuario " + userName + " es: " + status;
    }

    public String allInfo(){ //Getter
        return MessageFormat.format("El nombre del usuario es: {0}\nSu email es: {1}\nSu status es: {2}", userName, email, status);
    }

    public void userConfig(){  //Setter
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Bienvenido a Drake Antivirus");
        System.out.println("****************************");


        System.out.println("Ingresa un Nombre de Usuario:"); //User Name
        userName = sc.nextLine();

        int sEmail = 0;
        int punto = 0;
        System.out.println("Ingresa un email:"); // Email
        email = sc.nextLine();


        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                sEmail++;
            }
            if(email.charAt(i) == '.'){
                punto++;
            }
        }
        if (sEmail >= 1 && punto >= 1){
            System.out.println("Email Valido.");
        }
        else {
            while(sEmail == 0 && punto == 0){
                System.out.println("Ingresa un email valido:"); // Email
                email = sc.nextLine();
                for (int i = 0; i < email.length(); i++){
                    if(email.charAt(i) == '@'){
                        sEmail = 1;
                    }
                    if(email.charAt(i) == '.'){
                        punto = 1;
                    }
                }
                if (sEmail >= 1 && punto >= 1){
                    System.out.println("Email Valido.");
                }
            }
        }


        System.out.println("Ingresa una Contraseña de minimo 8 caracteres:"); // Password
        password = sc.nextLine();
        int valid = 0;
        for(int i = 0; i < password.length(); i++){
            valid = i;

        }
        if(valid >= 7){
            System.out.println("Contraseña correcta.");
        }
        else {
            while (valid < 7){
                System.out.println("Contraseña demasiado corta, Ingresa una mas larga:");
                password = sc.nextLine();
                for(int i = 0; i < password.length(); i++){
                    valid = i;

                }
                if(valid >= 7){
                    System.out.println("Contraseña correcta.");
                }
            }
        }

        System.out.println("Quieres ser: 1. Premium o 2. Continuar con la cuenta Free:"); // Status
        status = sc.nextLine();
        if (status.equals("1") || status.equalsIgnoreCase("Premium") || status.equalsIgnoreCase("p")){
            System.out.println("Estas en el proceso de convertirte en usuario premium.");
            System.out.println("Selecciona un tipo de tarjeta\n1. Credito o 2. Debito");
            sc.nextLine();
            System.out.println("Ingresa tu numero de tarjeta:");
            targetNumber = sc.nextLine();
            status = "Premium";
        }else {
            System.out.println("Continuaras con la cuenta free");
            status = "Free";
        }


    }

}

