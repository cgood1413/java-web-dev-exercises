package exercises.technology;

import java.util.HashMap;

public class SmartPhone extends Computer {

    private HashMap phonebook = new HashMap<>();

    public SmartPhone(String make, String operatingSys, double storage){
        super(make, operatingSys, storage);
    }

    public HashMap getPhonebook(){
        return phonebook;
    }

    public void addContact(String contactName, int contactNum){
        phonebook.put(contactName, contactNum);
    }

}
