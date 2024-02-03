package gb.ru.Sem1Homework;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", 25);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Presenting person as JSON: " + json);
        Person pesondeserialized = gson.fromJson(json, Person.class);
        System.out.println("Deserialized person: " + pesondeserialized);
    }
}
