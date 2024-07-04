package model.user;

import model.phone.Phone;

public class User {
    private final String name;
    private Phone phone;

    public User(String name) {
        this.name = name;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }
}
