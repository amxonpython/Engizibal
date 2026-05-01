package clases;

import java.util.Scanner;
import java.util.ArrayList;

public class test_class {

    public static void calculator(){
        double sum = 0;
        ArrayList<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("/");
        list.add("*");

        boolean error = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ввдеите число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("введите второе число: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("выберите действие (+ - / *): ");
        String action = scanner.nextLine();
        if(list.contains(action)){
            if(action.equals("+")){
                sum = (number + number2);
            }
            if(action.equals("-")){
                sum = (number - number2);
            }
            if (action.equals("*")){
                sum = (number * number2);
            }
            if (action.equals("/")){
                if(number2 != 0){
                    sum = ((double) number / number2);
                }else {
                    System.out.println("Error: делить на 0 нельзя");
                    error = true;
                }
            }
            if (!error){
                System.out.println("результат: " + sum);
            }
        }else {
            Errors.not_command();
        }
    }

    static String save_text = "";

    public static void save_text(){

        Scanner scanner = new Scanner(System.in);
        boolean working = true;
        while (working){
            System.out.println("Выберите действие (save, remove, watch, exit): ");
            String text = scanner.nextLine();

            if (text.equals("save") || text.equals("remove") || text.equals("watch") || text.equals("exit")){
                if (text.equals("save")){
                    System.out.println("введите текст который хотите сохранить");
                    save_text = scanner.nextLine();
                    System.out.println("текст сохранён");
                }
                if (text.equals("remove")){
                    save_text = ("");
                    System.out.println("удалено");
                }
                if (text.equals("watch")){
                    if(save_text.isEmpty()){
                        System.out.println("пусто");
                    }else {
                        System.out.println(save_text);
                    }
                }
                if (text.equals("exit")){
                    System.out.println("выход из редактора");
                    working = false;
                }
            }else {
                Errors.not_command();
            }
        }
    }
}
