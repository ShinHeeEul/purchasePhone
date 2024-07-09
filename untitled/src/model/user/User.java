package model.user;

import model.phone.Phone;

import java.util.Objects;

import static utils.SecurityUtils.hashPassword;


public class User {
    private final String id;
    private final String name;
    private final String hen;

    public User(String name, String id, String hen) {
        this.id = id;
        this.hen = hashPassword(hen);
        this.name = name;
    }

    public boolean checkPassword(String hen) {
        return Objects.equals(hashPassword(hen), this.hen);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}
