package clases;

public class commands {
    public static void commands_main(String text){
        switch (text){
            case "name":
                data.name(text);
                System.out.println("ваше имя: " + data.name);
                break;
            default:
                Errors.not_command();
                break;
        }
    }
}
