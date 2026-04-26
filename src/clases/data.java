package clases;
import java.util.Scanner;

public class data {
    static String name = ("");
    static String version = ("");
    public static void commands(){
        System.out.println("calculator - калькулятор");
        System.out.println("saved text - блокнот/сохранить текст");
        System.out.println("exit - выход из программы");
        System.out.println("echo - вывести введённый текст");
        System.out.println("date - показать дату");
        System.out.println("time - показать время");
        System.out.println("name - ваше имя");
        System.out.println(); //разделитель, или что-то типа того
    }
    public static void name(String args){
        Scanner scanner = new Scanner(System.in);

        if (name.equals("")){
            System.out.println("введите ваше имя: ");
            name = scanner.nextLine();
        }
    }
}
