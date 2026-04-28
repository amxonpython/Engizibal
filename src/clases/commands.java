package clases;

import com.sun.tools.javac.Main;

public class commands {
    public static void commands_main(String text){
        boolean working = true;
        String echo = ("echo");
        int index = text.indexOf(echo);
            switch (text){
                case "calculator":
                    test_class.calculator();
                    break;
                case "help":
                    data.commands();
                    break;
                case "saved text":
                    test_class.save_text();
                    break;
                case "name":
                    data.name(text);
                    System.out.println("ваше имя: " + data.name);
                    break;
                case "ping":
                    System.out.println("pong");
                    break;
                default:
                    if (text.equals("time") || text.equals("date")){
                        if (text.equals("time")){
                            classes.time();
                        }
                        if (text.equals("date")){
                            classes.date();
                        }
                    }else {
                        if (index != -1){
                            System.out.println(text);
                        }else {
                            Errors.not_command();
                        }
                    }
                    break;
        }
    }
}
