package ly.sparsearry;

import java.util.*;
import java.util.stream.Collectors;

public class Demo01 {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("张三", 25, "男"));
        users.add(new User("李四", 30, "男"));
        users.add(new User("王五", 25, "男"));
        users.add(new User("赵六", 28, "女"));
        users.add(new User("钱七", 25, "女"));
        users.add(new User("孙八", 30, "男"));


        Map<String, Map<Integer, List<User>>> groupedUsers = new HashMap<>();


        for (User user : users) {
            String gender = user.getGender();
            int age = user.getAge();
            if (!groupedUsers.containsKey(gender)) {
                groupedUsers.put(gender, new HashMap<>());
            }

            Map<Integer, List<User>> ageMap = groupedUsers.get(gender);

            if (!ageMap.containsKey(age)) {
                ageMap.put(age, new ArrayList<>());
            }

            ageMap.get(age).add(user);
        }

        for (Map.Entry<String, Map<Integer, List<User>>> genderEntry : groupedUsers.entrySet()) {
            String gender = genderEntry.getKey();
            System.out.println("性别: " + gender);

            for (Map.Entry<Integer, List<User>> ageEntry : genderEntry.getValue().entrySet()) {
                Integer age = ageEntry.getKey();
                List<User> userList = ageEntry.getValue();
                System.out.println("  年龄: " + age + " -> " + userList);
            }
        }



    }


}

