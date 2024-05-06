import java.util.ArrayList;

public class Logic {
    private ArrayList<Phone> phones;

    public Logic() {
        phones = new ArrayList<>();
    }

    public Logic(ArrayList<Phone> incomePhones) {
        phones = new ArrayList<>(incomePhones);
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public Phone getPhone(int index) {
        return phones.get(index);
    }

    public int getSize() {
        return phones.size();
    }

    public void removePhone(int index) {
        if (index >= 0 && index < phones.size()) {
            phones.remove(index);
            System.out.println("Телефон успешно удален.");
        } else {
            System.out.println("Неверный индекс телефона. Телефон не удален.");
        }
    }


}