package optional;

import optional.model.Address;
import optional.model.User;

import java.util.Optional;

public class AdressMain2 {

    static void main(String[] args) {
        User user1 = new User("user1", null);
        User user2 = new User("user1", new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        Optional<String> userStreet = getUserStreet(user);
        System.out.println(userStreet.orElse("unknown"));
    }

    static Optional<String> getUserStreet(User user) {
       return Optional.ofNullable(user).map(User::getAddress).map(Address::getStreet);
       // map chaining 중간에 null 이면 Optional.empty() 반환
    }
}
