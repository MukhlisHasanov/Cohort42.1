package lesson36.homework36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (directory.containsKey(lastName)) {
            List<String> phones = directory.get(lastName);
            phones.add(phoneNumber);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            directory.put(lastName, phones);
        }
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }
}