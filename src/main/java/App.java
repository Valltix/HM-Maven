import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        String name = "Oleg";
        String lastName = "Khalkov";

        Gson gson = new Gson();
        String json = gson.toJson(new Person(name, lastName));

        System.out.println(json);
    }
}

