package PhoneBook;

import java.util.*;

public class Phone {
    public Map<String,ArrayList<Integer>> map = new HashMap<>();
    List<Integer> listOfNumber;
    public void addNumbers(){
        Contact contact1= new Contact();
        contact1.setName();
        contact1.setPhoneNumber();
        //System.out.println(contact1.getName() + contact1.getPhoneNumber());
        if (map.containsKey(contact1.getName())){
            map.get(contact1.getName()).add(contact1.getPhoneNumber());
        } else {
            listOfNumber = new ArrayList<>();
            listOfNumber.add(contact1.getPhoneNumber());
            map.put(contact1.getName(), (ArrayList<Integer>) listOfNumber);
        }


    }
    public void printMap (){
        List<Map.Entry<String, ArrayList<Integer>>> mapPhone = new ArrayList<>(map.entrySet());
        Collections.sort(mapPhone, new Comparator<Map.Entry <String, ArrayList<Integer>>>() {
            @Override
            public int compare(Map.Entry <String, ArrayList<Integer>>o1, Map.Entry <String, ArrayList<Integer>>o2) {
                return o1.getValue().size() - o2.getValue().size();
            }

        });
        System.out.println(mapPhone);
    }


}





