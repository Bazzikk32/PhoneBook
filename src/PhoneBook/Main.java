package PhoneBook;

public class Main {
    public static void main(String[] args) {
        //Contact contact1 = new Contact();
        Phone phone1 = new Phone();
        Instructions instructions1 = new Instructions();
        instructions1.firstMessage();

        do{

        phone1.addNumbers();
        phone1.printMap();
        phone1.stopProgram();

        } while (phone1.stopProgram()==true);


    }
}
