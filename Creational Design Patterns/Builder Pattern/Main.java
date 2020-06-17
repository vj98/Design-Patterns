import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Ram", "Chandra").age(23).phone("00000000000").email("ramchandra@gmail.com").build();

        System.out.println(user);
    }
}