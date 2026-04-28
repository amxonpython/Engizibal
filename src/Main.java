import clases.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        boolean working = true;
        System.out.println("Engizibal v0.1.4");
        while (working){
            System.out.println("выберите команду: ");
            String text = scanner.nextLine();
            if (text.equals("exit")){
                System.out.println("выход");
                working = false;
            }else {
                commands.commands_main(text);
            }
        }
    }
}
