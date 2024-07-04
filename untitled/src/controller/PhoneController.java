package controller;


import model.Logo;
import model.phone.Apple;
import model.phone.Galaxy;
import model.phone.Phone;
import model.user.User;

import static view.OutputView.*;

public class PhoneController {

    public void buyPhone(User user, Logo logo) {
        if(logo == Logo.APPLE) {
            user.setPhone(new Apple());
        } else if(logo == Logo.GALAXY) {
            user.setPhone(new Galaxy());
        }
        print(user.getName() + "님이 " + logo.getLogo() + "폰을 구매했습니다.");
    }

    public void turnOnPhone(User user, Phone phone) {
        print(user.getName() + "님이 "+ phone.getLogo() + "폰을 켰습니다.");
        print(phone.load());
        print("\n");
    }

}
