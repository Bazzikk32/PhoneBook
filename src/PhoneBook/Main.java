package PhoneBook;

public class Main {
    public static void main(String[] args) {
        //Contact contact1 = new Contact();
        Phone phone1 = new Phone();
        for (int i = 0; i < 3; i++) {
            phone1.addNumbers();
            phone1.printMap();
        }
    }
}
