package PhoneBook;

import java.util.Scanner;

public class Contact {
    private String name;
    private int   phoneNumber;

    public Contact() {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setName() {
        System.out.println("Введите имя:");
        Scanner inName = new Scanner(System.in);
        String userName = inName.nextLine();
        if (userName.isEmpty()){
            System.out.println("Ошибка введена пустая строка");
        } else {
            name = userName;}
    }


    public void setPhoneNumber() {
        System.out.println("Введите номер:");
        Scanner inNumber = new Scanner(System.in);
        int userNum = inNumber.nextInt();
        if (userNum <= 0){
            System.out.println("Ошибка введена пустая строка");
        } else {
            phoneNumber = userNum;}
    }

}
