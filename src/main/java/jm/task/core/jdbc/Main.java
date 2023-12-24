package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 27);
        userService.saveUser("Semen", "Petrov", (byte) 18);
        userService.saveUser("Sviatogor", "Ivanov", (byte) 54);
        userService.saveUser("Artem", "Sidorov", (byte) 27);

        userService.getAllUsers();

        userService.removeUserById(3);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}