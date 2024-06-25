package PhoneBook;

import java.util.*;

public class Phone {
    public Map<String,ArrayList<Integer>> map = new HashMap<>();
    List<Integer> listOfNumber;
    Contact contact1= new Contact();
    /**Логика добавления имени и номера в MAP, так же идет проверка на имя STOP,
     * если вводится данное слово то программа прекращает работу НЕ записывая его в MAP
     * продолжение логики запись значений в MAP, если ИМЯ уже было, то логика находит его
     * и кладет в ArrayList другой номер, если данного пользователя не было, то он вносится в MAP
     * вместе с нмоером*/
    public void addNumbers(){
        //Contact contact1= new Contact();
        contact1.setName();
        contact1.setPhoneNumber();
        Boolean stop;
        //System.out.println(contact1.getName() + contact1.getPhoneNumber());
        if (contact1.getName().equals("STOP")){
            System.out.println("Вы закончили ввод!");
            stop=false;
        } else {
        if (map.containsKey(contact1.getName())){
            map.get(contact1.getName()).add(contact1.getPhoneNumber());
        } else {
            listOfNumber = new ArrayList<>();
            listOfNumber.add(contact1.getPhoneNumber());
            map.put(contact1.getName(), (ArrayList<Integer>) listOfNumber);
        }}



}
/**Данный метон необходим для печати уже отсортированной с помощью компаратора MAP, важно обернуть
 * MAP в Array List Integer*/
public void printMap() {
        List<Map.Entry<String, ArrayList<Integer>>> mapPhone = new ArrayList<>(map.entrySet());
        Collections.sort(mapPhone, new Comparator<Map.Entry <String, ArrayList<Integer>>>() {
            @Override
            public int compare(Map.Entry <String, ArrayList<Integer>>o1, Map.Entry <String, ArrayList<Integer>>o2) {
                return o1.getValue().size() - o2.getValue().size();
            }

        });
        System.out.println(mapPhone);
    }


    /**Данный метод нужен для выполнения цикла в классе MAIN, для остановки программы*/
    public boolean stopProgram() {
        Boolean stop;
        //String answer = "STOP";
        if (contact1.getName().equals("STOP")){
            stop = false;
        } else {
            stop = true;
        }
        //System.out.println(contact1.getName());
        //System.out.println(stop);

        return stop;
    }
}





