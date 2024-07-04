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

    public void turnOnPhone() {
        print(name + "님이 "+ phone.getLogo() + "폰을 켰습니다.");
        print(phone.load());
        print("\n");
    }

    public String getName() {
        return name;
    }
}
