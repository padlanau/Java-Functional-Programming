package lodgerio.functional.objects.functionUser;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionUser {
    public static void main(String[] args) {

        List<User> list = User.getUsers();
        System.out.println("Using findFirst() ---");

        // returning USER object
        User user = list.stream()
                    .filter(u -> u.getName().endsWith("sh"))
                    .findFirst().orElse(null);

        System.out.println(user.getName());

        // printing each record
        System.out.println("Using forEach() ---");
        list.stream().filter(u -> u.getName().endsWith("sh"))
                .forEach(u -> System.out.println(u.getName()));

        // converting(map) to int
        int sum = list.stream()
                .filter(u -> u.getId() >= 2 && u.getId() <= 4)
                .mapToInt(u -> u.getAge()).sum();

        // converting(map) to Name string
        List<String> userList =
                list.stream()
                        .filter(u -> u.getName().endsWith("sh"))
                        .map(us -> us.getName())
                        .collect(Collectors.toList());
        System.out.println(userList);

        // 2 filters
        List<String> userList2 =
                list.stream()
                        .filter(u -> u.getName().endsWith("sh"))
                        .filter(u -> u.getAge() > 20)
                        .map(us -> us.getName())
                        .collect(Collectors.toList());
        System.out.println(userList2);


        list.stream().map(usr -> {
            return new User(usr.getId(), usr.getName(), usr.getAge());
        }).collect(Collectors.toList());

        // OR
        list.stream().map(usr -> {
                User userDTO = new User(usr.getId(), usr.getName(), usr.getAge());
                return userDTO;
        }).collect(Collectors.toList());

        // OR
        List<User> userDto = list.stream().map(usr -> {
            User userDTO = new User(usr.getId(), usr.getName(), usr.getAge());
            return userDTO;
        }).collect(Collectors.toList());

        assert (list.size() == userDto.size());
        userDto.forEach(System.out::println);


    }
}
