package model.user;

import model.phone.Phone;

import static view.OutputView.print;

public class User {
    private String name;
    private Phone phone;

    public User() {}

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
