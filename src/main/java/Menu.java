import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    static void menu() {
        Logic logic = new Logic();
        while (true) {
            System.out.println("Привет, это магазин тут можно добавлять/удалять товары.");

            System.out.println("1.Добавить телефон." + "\n" + "2.Удалить телефон." + "\n" + "3.Посмотреть все телефоны." + "\n" + "4.Выход из программы.");
            int menuPoint = Util.inputInt(" ", 1, 4);


            switch (menuPoint) {

                case 1: {

                    String name = Util.inputString("Введи имя:");
                    int price = Util.inputInt("Введи цену:", 0, 100000);
                    String color = Util.inputString("Введи цвет:");
                    Phone phone = new Phone(name, price, color);
                    logic.addPhone(phone);
                    break;

                }
                case 3: {
                    for (int i = 0; i < logic.getSize(); i++) {
                        System.out.println(logic.getPhone(i));
                    }
                    break;


                }
                case 4: {
                    System.exit(0);
                }

            }

        }
    }
}
