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


}