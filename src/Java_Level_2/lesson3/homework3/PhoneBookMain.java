package Java_Level_2.lesson3.homework3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBookMain {


    public static class Phonebook {
        private final Map<String, Set<String>> content;

        public Phonebook() {
            this.content = new HashMap<>();
        }

        public void add(String name, String phone) {
            if (!content.containsKey(name)) {
                content.put(name, new HashSet<>());
            }
            content.get(name).add(phone);
        }

        public Set<String> get(String name) {
            return content.get(name);
        }
    }

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Трухин", "89042364456");
        phonebook.add("Петров", "89042774456");
        phonebook.add("Сидоров", "89042894456");
        phonebook.add("Петров", "89042344456");
        System.out.println("Петров: " + phonebook.get("Петров"));
    }
}
