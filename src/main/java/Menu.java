import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    static void menu(){

        System.out.println("Привет, это магазин тут можно добавлять/удалять товары." );

        System.out.println("1. Добавить телефон." +  "\n" +  "2. Посмотреть телефон");
        int menuPoint = Util.inputInt(" ",1,2);
        Logic logic = new Logic();
        switch (menuPoint){

            case 1:{
                String name = Util.inputString("Введи имя ");
                int price = Util.inputInt("Введи цену", 0, 10000);
                String color = Util.inputString("Введи цвет");
                Phone phone = new Phone(name,price,color);
                logic.addPhone(phone);
                break;

            }
            case 2:{

            }

        }
















    }

}
